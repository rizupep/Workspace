package webelementtest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DimensionTest {

	public static void main(String[] args) 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bobcat.com/index");
		Dimension d = new Dimension(300, 300);
		wd.manage().window().setSize(d);
		

	}

}
