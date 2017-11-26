package parellelExecutionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellelTest {
	WebDriver wd;

	@Parameters({ "Browser" })
	@BeforeTest
	public void setup(String Browser) {
		if (Browser.equals("Firefox")) {
			wd = new FirefoxDriver();
		} else if (Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
			wd = new ChromeDriver();
		}
	}

	@Test
	public void bing() throws InterruptedException {

		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("abc");
		input.submit();
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();

		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();

		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();

		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();
	}
}
