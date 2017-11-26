package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://www.tinyupload.com/");
		WebElement input = wd.findElement(By.xpath("//input[@name='uploaded_file']"));
		input.sendKeys("E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
	   // the above statement will upload the file automatically.
		
	
	}

}
