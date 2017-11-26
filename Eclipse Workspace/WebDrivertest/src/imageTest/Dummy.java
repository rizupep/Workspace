package imageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy {

	public static void main(String[] args) throws InterruptedException
	{
	for(int i =0;i<60;i++)
	{
	System.out.println(i);
	
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://share.fromfactory.club/event/club_friday?share_id=ce64bd15b6f9828c9816a70e47c7051a&index=1");
		//WebElement gmail = wd.findElement(By.xpath("html/body/button[1]"));
		WebElement gmail = wd.findElement(By.xpath("//button[contains(.,'Like')]"));
		gmail.click();
		Thread.sleep(2000);
		wd.close();

	}
	}

}
