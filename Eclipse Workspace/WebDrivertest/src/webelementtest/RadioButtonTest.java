package webelementtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> radio = wd.findElements(By.tagName("group1"));
		for (int i = 0; i < radio.size(); i++) {
			String data = radio.get(i).getAttribute("value");
			System.err.println(data);
			if (data.equals("Milk")) 
			{
				radio.get(i).click();
			}
		}
	}

}
