package actionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/droppable/");
		wd.switchTo().frame(0);
		WebElement src = wd.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement dest = wd.findElement(By.xpath(".//*[@id='droppable']"));
		Actions a = new Actions(wd);
		Thread.sleep(2000);
		a.dragAndDrop(src, dest).build().perform(); // imortant step.
				
			}

}


