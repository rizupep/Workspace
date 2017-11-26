package webelementtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {

public static void main(String[] args) {
// TODO Auto-generated method stub
WebDriver wd = new FirefoxDriver();
wd.manage().window().maximize();
wd.get("https://www.google.co.in/?gws_rd=ssl");
List<WebElement> link = wd.findElements(By.tagName("a"));
// <input> common for checkbox, text, radio button and all elements
// <a> to get link
for (int i = 0; i < link.size(); i++) {
String data = link.get(i).getText();
if(!data.isEmpty()){
System.out.println(data);

}

}
}

}