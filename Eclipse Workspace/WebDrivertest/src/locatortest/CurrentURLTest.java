package locatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentURLTest {
	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		String data = wd.getCurrentUrl();
		System.out.println(data);
	}

}
