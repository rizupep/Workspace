package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		// wd.get("https://apps.na.collabserv.com/manage/account/dashboardHandler/input");
		wd.get("https://jqueryui.com/tooltip/");
		wd.switchTo().frame(0);
		WebElement tooltip = wd.findElement(By.xpath("//input[@id='age']"));
		String data = tooltip.getAttribute("title");
		System.out.println(data);
				
	}

}
