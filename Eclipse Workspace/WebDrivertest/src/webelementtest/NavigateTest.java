package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		//wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		wd.navigate().to("https://www.bing.com");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("ABC");
		input.submit();
		Thread.sleep(2000);
		wd.navigate().back();
		wd.navigate().forward();
		wd.navigate().refresh();

	}

}
