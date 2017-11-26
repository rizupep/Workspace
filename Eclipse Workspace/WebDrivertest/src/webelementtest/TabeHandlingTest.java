package webelementtest;



import java.util.List;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class TabeHandlingTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Workspace\\WebDrivertest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		// wd.get("https://apps.na.collabserv.com/manage/account/dashboardHandler/input");
		wd.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = wd.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i=0; i<row.size();i++)
		{
			List<WebElement> column = row.get(i).findElements(By.tagName("td"));
			for ( int j=0;j<column.size();j++)
			{
				String data = column.get(j).getText();
				System.out.print(data + "  ");
			}
			System.out.println( );
			
		}
		
		
	}

}
