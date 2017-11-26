package actionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/resizable/");
		wd.switchTo().frame(0);
		WebElement src = wd.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		Actions a = new Actions(wd);
		a.clickAndHold(src).build().perform();
		a.moveToElement(src, 80, 80).release().build().perform();
		
		
	}

}
