package actionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		Actions a = new Actions(wd);
		WebElement gmail = wd.findElement(By.linkText("Gmail"));
		/*a.contextClick(gmail).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();*/
		a.doubleClick(gmail).build().perform();
		wd.close();
	}

}
