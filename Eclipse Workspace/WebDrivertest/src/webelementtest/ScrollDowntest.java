package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDowntest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("ABC");
		input.submit();
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,1500)"); // polymorphism // to scroll down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1500)"); // to scroll up 
		

	}

}
