package keywordTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogTest 
{
	@Test(priority=1)
	public void logintest()
	{
		System.out.println("logintestcompleted");
	}

@Test(priority=2) 
public void registrationtest()
{
	//int i = 1/0;
	//System.out.println("Registration Completed");
	Reporter.log("Test is completed");
}

@Test(priority=3)
public void bookingtest()
{
	System.out.println("booking Completed");
}

@Test(priority=4)
public void canceltest()
{
	System.out.println("cancel Completed");
}



}
