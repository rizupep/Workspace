package automationTestingPractice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterClass {
	static WebDriver driver = null;

	public static void Registerpage(WebDriver driver) throws IOException {
		// UserData UD = new UserData();
		UserData.Data();
		driver.findElement(By.xpath(" //input[@ng-model='FirstName'] ")).sendKeys(UserData.FirstName);
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(UserData.LastName);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(UserData.Address);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(UserData.EmailAddress);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(UserData.Phone);
		driver.findElement(By.xpath("//input[@value='" + UserData.Gender + "']")).click();
		driver.findElement(By.xpath("//input[@value='" + UserData.Hobbies + "']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[contains(.,'" + UserData.Language + "')]")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Select skilldropdown = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		skilldropdown.selectByVisibleText("" + UserData.skills + "");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Select countrydropdown = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		countrydropdown.selectByValue("" + UserData.country + "");

		// driver.findElement(By.xpath("//span[@aria-expanded='true']")).click();
		
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("" + UserData.select_country + "");
		WebElement ele = driver.findElement(By.xpath("//ul[@id='select2-country-results']/li"));
		// List<WebElement> ele =
		// driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
		System.out.println(ele.getText());
		ele.click();

		// System.out.println(ele.getText());

		Select yeardropdown = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		yeardropdown.selectByValue("" + UserData.Year + "");

		Select monthdropdown = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		monthdropdown.selectByValue("" + UserData.Month + "");

		Select daydropdown = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		daydropdown.selectByValue("" + UserData.Day + "");

		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(UserData.Password);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(UserData.Password);
		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("E:\\Eclipse Workspace\\DemoAutomationTesting\\Files\\08 09 2017 10 58 52.jpg");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

		// option[@value='1993']

		/*
		 * for (WebElement obj : ele) 
		 * {
		 *  System.out.println(obj.getText());
		 * String aa = obj.getText(); if (aa.equalsIgnoreCase(" " +
		 * UserData.select_country + " ")) 
		 * {
		 *  obj.click(); break; 
		 *  } else 
		 * {
		 * continue; 
		 * }
		 * 
		 * }
		 */
	}
}
