package webelementtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.condition.Text;

public class AutoCompleteTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/autocomplete/");
		wd.switchTo().frame(0);
		WebElement input = wd.findElement(By.xpath("html/body/div[1]/input"));
		
		input.sendKeys("a");
		Thread.sleep(2000);
		String Sxpath = "html/body/ul/li["; // Sxpath - Starting xpath
		String Expath = "]/div"; // Expath - Ending xpath
		int i = 1;
		while (true) {
			try {

				String xpath1 = Sxpath+i+Expath;
				WebElement text = wd.findElement(By.xpath(xpath1));
				String data = text.getText();
				System.out.println(data);
				i++;
			}

			catch (Exception E) {
				break;
			}

		}

	}

}
