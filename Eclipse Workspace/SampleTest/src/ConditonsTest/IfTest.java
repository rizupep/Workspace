package ConditonsTest;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		String con = "PAK";
		if (age > 18) 
		{
			System.out.println("Allowed to vote");
		} 
		else if(con.equals("PAK")) 
		{
			System.out.println("He is PAK allowed to vote");
		} 
		else 
		{
			System.out.println("Under 18");
		}

	}

}
