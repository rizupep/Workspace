package webelementtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

import com.sun.jna.platform.WindowUtils;
import com.sun.jna.platform.unix.X11.Window;

public class CloseQuitkillTest {

	public static void main(String[] args) 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		//wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		wd.navigate().to("https://www.bing.com");
		wd.quit();
		wd.close();
		WindowsUtils.killByName("firefox.exe");

	}

}
