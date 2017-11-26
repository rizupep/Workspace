package keywordTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	@Test
	public void LoginTest()
	{
		System.out.println(" Assertion Started");
		int expected = 1 ;
		int actual = 2;
		Assert.assertEquals(actual, expected);// if validation fails it will not  execute the other cases
		System.out.println(" Assert completed ");
		
	}

}
