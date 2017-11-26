package automationTestingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static final WebDriver Browser() 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\DemoAutomationTesting\\Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
