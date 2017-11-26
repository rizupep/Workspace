package webelementtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowhandleTest {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("http://book.theautomatedtester.co.uk/chapter1");
	WebElement input = wd.findElement(By.xpath("//*[@id='multiplewindow']"));
	input.click();
	Set<String> window = wd.getWindowHandles();
	Iterator<String> it = window.iterator();
	String parentid= it.next();
	String childid= it.next();
	wd.switchTo().window(childid);
	WebElement text = wd.findElement(By.xpath(".//*[@id='popuptext']"));
	String data = text.getText();
	System.out.println(data);
	WebElement closetext = wd.findElement(By.xpath(".//*[@id='closepopup']"));
	closetext.click();
	wd.switchTo().window(parentid);
	WebElement load = wd.findElement(By.xpath(".//*[@id='secondajaxbutton']"));
	load.click();
	Thread.sleep(2000);
	wd.close();
	//defaut content key word will navigate the control to the first window

	}

}
