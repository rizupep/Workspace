package keywordTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test
	public void LoginTest()
	{
		System.out.println(" Assertion Started");
		int expected = 1 ;
		int actual = 2;
		SoftAssert s = new SoftAssert(); // if validation fails also it will also to execute the other cases
		s.assertEquals(actual, expected);
		System.out.println(" Assert completed ");
		s.assertAll();
		
	}
}
