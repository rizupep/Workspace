package actionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) throws Exception 
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.doosan.com/en/");
		WebElement corpproffile = wd.findElement(By.xpath(".//*[@id='menu-gnb']/li[3]/a/span[1]"));
		WebElement leadership = wd.findElement(By.xpath(".//*[@id='menu-gnb']/li[3]/ul/li[1]/a"));
		WebElement ExecutiveTeam = wd.findElement(By.xpath(".//*[@id='menu-gnb']/li[3]/ul/li[1]/ul/li[2]/a"));
		Actions a = new Actions(wd);
		a.moveToElement(corpproffile).build().perform();
		Thread.sleep(2000);
		a.moveToElement(leadership).build().perform();
		Thread.sleep(2000);
		a.moveToElement(ExecutiveTeam).click().build().perform();
		Thread.sleep(2000);
		
	}

}
