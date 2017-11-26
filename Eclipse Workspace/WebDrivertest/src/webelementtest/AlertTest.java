package webelementtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		wd.switchTo().frame(0);
		WebElement w = wd.findElement(By.xpath("html/body/button"));
		w.click();
		Thread.sleep(2000);
		Alert a = wd.switchTo().alert();
		String data = a.getText();
		System.out.println(data);
		a.accept(); // this is  applicable if a alert box have OK button.
		// a.dismiss(); this is  applicable if a alert box have cancel button.

	}

}
