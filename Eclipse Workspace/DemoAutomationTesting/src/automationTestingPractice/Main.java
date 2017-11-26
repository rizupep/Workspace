package automationTestingPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = BaseClass.Browser();
		HomepageClass.homepage(driver);
		// WebDriver driver = new FirefoxDriver();
		// BaseClass.Browser(); // this will open my browser and maximise
		//UserData UD = new UserData();
		/*UserData.Data();
		driver.get(UserData.URLvalue);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserData.EmailSignup);
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);*/
		Assert.assertEquals("Register",driver.getTitle());
		System.out.println(" Navigated to Register Page ");
		RegisterClass.Registerpage(driver);
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 driver.navigate().refresh();
		System.out.println(driver.getTitle());
		//Assert.assertEquals("Web Table",driver.getTitle());
		System.out.println(" Navigated to Web Table Page ");
		
	}
}
