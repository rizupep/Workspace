package waitTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWaitTest {

	public static void main(String[] args) 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.get("https://www.bing.com");
		WebElement input = wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
		input.sendKeys("ABC");
		input.submit();
	}

}
