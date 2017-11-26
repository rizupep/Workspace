package webelementtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class UntrustedSiteTest {

	public static void main(String[] args) 
	{
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver wd = new FirefoxDriver(profile);
		wd.manage().window().maximize();
		wd.get("https://e.origins.na.us.dev.ncsa.elcdev.net/checkout/viewcart.tmpl");

	}

}
