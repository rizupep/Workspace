package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrometest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com");
		WebElement input = wd.findElement(By.xpath("//input[@name='q']"));
		input.sendKeys("samsung");
		input.submit();

	}

}
