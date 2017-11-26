package imageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CoOrdinatesTest {

	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		WebElement input = wd.findElement(By.id("hplogo"));
		Point point = input.getLocation();
		System.out.println(point);
		int x=point.x;
		int y = point.y;
		int height = input.getSize().height;
		int width = input.getSize().width;
		System.out.println(x);
		System.out.println(y);
		System.out.println(height);
		System.out.println(width);
				

	}

}
