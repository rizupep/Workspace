package locatortest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdTest {
	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		WebElement input = wd.findElement(By.id("sb_form_q"));
input.sendKeys("ABC");
input.submit();
	}


}
