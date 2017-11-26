package locatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximiseTest {
	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
        wd.manage().window().maximize();

	}
}