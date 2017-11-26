package automationTestingPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageClass 
{
	static WebDriver driver = null;
	public static void homepage(WebDriver driver ) throws IOException 
	{
	UserData.Data();
	driver.get(UserData.URLvalue);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserData.EmailSignup);
	driver.findElement(By.xpath("//img[@id='enterimg']")).click();
	driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	}

}
