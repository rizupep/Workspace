package webelementtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		// wd.get("https://apps.na.collabserv.com/manage/account/dashboardHandler/input");
		wd.get("https://www.facebook.com");
		// wd.manage().deleteAllCookies();
		Cookie c1 = new Cookie("Company", "Vmetry");
		wd.manage().addCookie(c1);
		Set<Cookie> cook = wd.manage().getCookies();
		Iterator<Cookie> it = cook.iterator();
		while (it.hasNext()) {
			Cookie c = it.next();
			System.out.println(" Domain: " + c.getDomain() + " Name: " + c.getName() + " Expiry:" + c.getExpiry()
					+ " Path:" + c.getPath() + "value" + c.getValue());
		}

	}

}
