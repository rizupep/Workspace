package flipkart;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CutImageTest {

	public static void main(String[] args) throws IOException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com");
		WebElement input = wd.findElement(By.xpath("//input[@name='q']"));
		input.sendKeys("samsung");
		input.submit();
		WebElement input1 = wd.findElement(By.xpath("//img[@alt='Samsung Galaxy On5 (Gold, 8 GB)']"));
		Point point = input1.getLocation();
		System.out.println(point);
		int x=point.x;
		int y = point.y;
		int height = input.getSize().height;
		int width = input.getSize().width;
		System.out.println(x);
		System.out.println(y);
		System.out.println(height);
		System.out.println(width);
		File src  = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		BufferedImage copyimage = ImageIO.read(src);
		BufferedImage cropimage = copyimage.getSubimage(x, y, width, height);
		ImageIO.write(cropimage, "png", src);
		FileUtils.copyFile(src, new File("E:\\Eclipse Workspace\\homework\\src\\screenshots\\crop.png"));
	}
}
