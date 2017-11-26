package keywordTest;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	@Test(priority = 1 , expectedExceptions=ArithmeticException.class) //since it throws exception and it is expected.
	public void logintest()  {
		int i = 1/0;
		//Thread.sleep(10000);
		System.out.println("logintestcompleted");
	}
}
