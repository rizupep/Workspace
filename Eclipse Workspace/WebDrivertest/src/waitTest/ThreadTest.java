package waitTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreadTest {
/*	implicitly wait 
	explicitly wait
	fluent wait */
	public static void main(String[] args)  {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(10000);
	
		WebElement input = wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
		input.sendKeys("ABC");
		input.submit();
		
	}

}
