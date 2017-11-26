package annotationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestTest {
	@Test(priority = 1)
	public void logintest() {
		System.out.println("logintestcompleted");
	}

	@Test(priority = 2)
	public void registrationtest() {
		// int i = 1/0;
		System.out.println("Registration Completed");
	}

	@Test(priority = 3)
	public void bookingtest() {
		System.out.println("booking Completed");
	}

	@Test(priority = 4)
	public void canceltest() {
		System.out.println("cancel Completed");
	}

	@BeforeMethod
	public void openbrowser() {
		System.out.println(" To validate whether browser is open or not");

	}

	@AfterMethod
	public void closebrowser() {
		System.err.println(" To validate whether browser is closed or not");

	}

	@BeforeClass
	public void checknetwork() {
		System.out.println("check whether network is available or not");
	}
	@AfterClass
	public void logoutnetwork()
	{
		System.out.println(" Logout from network");
	}
	@BeforeTest
	public void loginDB()
	
	{
		System.out.println(" DB is logged in ");
	}
	@BeforeTest
	public void logoutDB()
	
	{
		System.out.println(" DB is logged out ");
	}
	
}
