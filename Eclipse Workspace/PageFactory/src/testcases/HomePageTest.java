package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;

public class HomePageTest
{

	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		HomePage.loadurl(wd, "https://www.ntltaxi.com");
		HomePage homePage = PageFactory.initElements(wd, HomePage.class);
		homePage.enterusername("VMETRY");
		homePage.entermobilenumber("9999988889");
		homePage.enterpickupplace("VELACHERY");
		homePage.enterdropplace("CHETPET");
		homePage.entervtype("SEDAN");
		homePage.clickbooklater();
	}
}
