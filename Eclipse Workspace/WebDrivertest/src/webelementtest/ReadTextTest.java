package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTextTest {

	public static void main(String[] args) 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		WebElement text = wd.findElement(By.xpath(".//*[@id='sos_text']"));
		String data = text.getText();
		System.out.println(data);
	}

}
