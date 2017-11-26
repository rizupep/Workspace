package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultiTestSingleDataPageFactoryTest {
	String UserName;
	String Password;
	String movie1;
	String movie2;

	// Below is the constructor

	@Factory(dataProvider = "dataset")
	public MultiTestSingleDataPageFactoryTest(String UserName, String Password, String movie1, String movie2) {
		this.UserName = UserName;
		this.Password = Password;
		this.movie1 = movie1;
		this.movie2 = movie2;

	}

	@Test(priority = 2)
	public void BookingTest() {
		System.out.println(movie1); // 0
		System.out.println(movie2); // 1
	}

	@Test(priority = 1)
	public void logintest() {
		System.out.println(UserName); // 0
		System.out.println(Password); // 1
	}

	@DataProvider(name = "dataset")
	public static Object[][] getdata() {
		Object[][] data = new Object[3][4]; // [3] defines the data set and [2]
											// defines the data.
		// valid user name and password is one data set
		data[0][0] = "valid user name";
		data[0][1] = "valid password";
		data[0][2] = "valid movie";
		data[0][3] = "valid ticket";

		data[1][0] = "Invalid username";
		data[1][1] = "Invalid password";
		data[1][2] = "Invalid movie";
		data[1][3] = "Invalid ticket";

		data[2][0] = "Empty username";
		data[2][1] = "Empty password";
		data[2][2] = "empty movie";
		data[2][3] = "empty ticket";

		return data;
		// Data provider return type should be either single dimensional array
		// or two dimensional array or iterator object.

		//google it and come - preserve order ( it is the key word )
	}
}
