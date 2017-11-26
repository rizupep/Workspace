package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static void loadurl(WebDriver wd, String url) {// boolean should be started with is

		wd.get(url);
	}

	@FindBy(how = How.XPATH, using = "html/body/section/div/div[2]/div/form/input[2]")
	public static WebElement username;

	public void enterusername(String username) {
		this.username.sendKeys(username);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='mobid']")
	public static WebElement mobilenumber;

	public void entermobilenumber(String mobilenumber) {
		this.mobilenumber.sendKeys(mobilenumber);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='pickid']")
	public static WebElement pickupplace;

	public void enterpickupplace(String pickupplace) {
		this.pickupplace.sendKeys(pickupplace);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='dropid']")
	public static WebElement dropplace;

	public void enterdropplace(String dropplace) {
		this.dropplace.sendKeys(dropplace);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='vehid']")
	public static WebElement vtype;

	public void entervtype(String vtype) {
		Select s = new Select(this.vtype);
		s.selectByVisibleText(vtype);

	}

	@FindBy(how = How.XPATH, using = ".//*[@id='bookLater']")
	public static WebElement clickbooklater;

	public void clickbooklater() {
		clickbooklater.click();
	}
}