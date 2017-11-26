package autoITtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadTest {

		public static void main(String[] args) throws InterruptedException, IOException {
//			System.setProperty("webdriver.chrome.driver",
//					"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
			WebDriver wd = new FirefoxDriver();
			wd.manage().window().maximize();
			wd.get("http://www.tinyupload.com/");
			WebElement input = wd.findElement(By.xpath("//input[@name='uploaded_file']"));
			input.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec("C:\\Users\\Riz\\Desktop\\upload.exe");

	}

}

