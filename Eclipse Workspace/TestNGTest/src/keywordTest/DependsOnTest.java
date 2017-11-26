package keywordTest;

import org.testng.annotations.Test;

public class DependsOnTest 
{

	@Test(priority=1)
		public void logintest()
		{
			System.out.println("logintestcompleted");
		}

	@Test(priority=2,dependsOnMethods="logintest")
	public void registrationtest()
	{
		int i = 1/0;
		System.out.println("Registration Completed");
	}
	
	@Test(priority=3,dependsOnMethods="registrationtest")
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
