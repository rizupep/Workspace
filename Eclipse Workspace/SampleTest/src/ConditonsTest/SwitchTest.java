package ConditonsTest;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 60;
		/*if (age == 10) {
			System.out.println("Age is 10");

		} else if (age == 20) {
			System.out.println("Age is 20");

		} else if (age == 30) {
			System.out.println("Age is 30");

		} else if (age == 40) {
			System.out.println("Age is 40");

		} else if (age == 50) {
			System.out.println("Age is 50");

		}*/
		switch (age) {
		case 10:
			System.out.println("Age is 10");
			
			break;
		case 20:
			System.out.println("Age is 20");
			
			break;
		case 30:
			System.out.println("Age is 30");
			
			break;
		case 40:
			System.out.println("Age is 40");
			
			break;
		case 50:
			System.out.println("Age is 50");
			
			break;

		default:
			System.out.println("Age is not in range");
			break;
		}
	}

}
