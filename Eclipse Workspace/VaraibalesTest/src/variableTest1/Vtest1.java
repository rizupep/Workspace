package variableTest1;

public class Vtest1 {
//public static int i=1; // Global variable
// static int j=1; //Static variable.
	int i=1;
	int j=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=1;
		//int j=1;
		Vtest1 v= new Vtest1(); // instance is created for the variable.
		int k=v.i+v.j;
		System.out.println(k);
	}
public static void add()
{
	int k=i+j;
	System.out.println(k);
}
	}