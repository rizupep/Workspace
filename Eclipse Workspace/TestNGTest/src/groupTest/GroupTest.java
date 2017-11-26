package groupTest;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(priority = 1,groups={"Book","Cancel"})
	public void logintest() {
		System.out.println("logintestcompleted");
	}

	@Test(priority = 2,groups={"Book"})
	public void registrationetest() {
		System.out.println("Registration Completed");
	}

	@Test(priority = 3,groups={"Book","Cancel"})
	public void bookingtest() {
		System.out.println("booking Completed");
	}

	@Test(priority = 4,groups={"Cancel"})
	public void canceltest() {
		System.out.println("cancel Completed");
	}

}
