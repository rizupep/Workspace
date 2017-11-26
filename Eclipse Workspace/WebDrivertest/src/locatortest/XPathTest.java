package locatortest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathTest {
	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		//Absolute Xpath
		//WebElement input = wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]"));
		//Reative Xpath
		WebElement input = wd.findElement(By.xpath(".//*[@id='sb_form_q']"));
		input.sendKeys("ABC");
		input.submit();
	}
}
