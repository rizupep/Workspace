package keywordTest;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority=1)
		public void logintest()
		{
			System.out.println("logintestcompleted");
		}

	@Test(priority=-2)
	public void registrationetest()
	{
		System.out.println("Registration Completed");
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
