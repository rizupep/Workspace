package actionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/slider/");
		wd.switchTo().frame(0);
		WebElement src = wd.findElement(By.xpath(".//*[@id='slider']/span"));

		Actions a = new Actions(wd);
		Thread.sleep(2000);
		a.dragAndDropBy(src, 80, 0).build().perform();
		
		
		/*int i =10; // this is fr step by step slider
		while(true){
			a.dragAndDropBy(src, i, 0).build().perform();
			i=i+10;
		}*/
	

	}

}
