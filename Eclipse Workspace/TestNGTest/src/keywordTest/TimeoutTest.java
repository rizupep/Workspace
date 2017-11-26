package keywordTest;

import org.testng.annotations.Test;

public class TimeoutTest {

	@Test(priority = 1,timeOut=8000)
	public void logintest() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("logintestcompleted");
	}

}
