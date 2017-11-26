package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiDataProviderTest
{
	@Test(priority=2,dataProvider="data set1")
	public void BookingTest(String movie1 , String movie2) {
		System.out.println(movie1); // 0
		System.out.println(movie2); // 1
	}
@DataProvider(name="data set1")
	public static Object[][] getBookdata() 
	{
		Object[][] data = new Object[3][2]; // [3] defines the data set and [2] defines the data.
		// valid user name and password is one data set 
		data[0][0] = "Tamil movie 1";
		data[0][1] = "Tamil movie 2";
		
		data[1][0] = "english movie 1";
		data[1][1] = "english movie 2";
		
		data[2][0] = "Telugu movie 1";
		data[2][1] = "telugu movie 2";
		
		return data;
		//Data provider return type should be  either single dimensional array or two dimensional array or iterator object.
		
	}

@Test(priority=1,dataProvider="data set")
public void logintest(String UserName , String Password) {
	System.out.println(UserName); // 0
	System.out.println(Password); // 1
}
@DataProvider(name="data set")
public static Object[][] getdata() 
{
	Object[][] data = new Object[3][2]; // [3] defines the data set and [2] defines the data.
	// valid user name and password is one data set 
	data[0][0] = "valid user name";
	data[0][1] = "valid password";
	
	data[1][0] = "Invalid username";
	data[1][1] = "Invalid password";
	
	data[2][0] = "Empty username";
	data[2][1] = "Empty password";
	
	return data;
	//Data provider return type should be  either single dimensional array or two dimensional array or iterator object.
	
}

}
