package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstCryHomework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		// wd.get("https://apps.na.collabserv.com/manage/account/dashboardHandler/input");
		wd.get("http://www.firstcry.com/");
		wd.switchTo().frame("iframe_Login");
		WebElement close = wd.findElement(By.xpath("//div[@class='_pop_close _pop_reg_bg']"));
		close.click();
	}

}
