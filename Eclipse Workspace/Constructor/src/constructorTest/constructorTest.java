package constructorTest;

public class constructorTest {
	public static int i;
	public static int j;

	public static void main(String[] args) {
		//constructorTest c=new constructorTest(); 
		//after creating object, output:10 by taking the value i & j=5 4m the constructor test
		int k = i + j; // constructor is the one which sets the value for int &
						// string.
		// Always a constructor is run behind one the data are initialized
		System.out.println(k); // Output 0
		constructorTest c=new constructorTest(); // if we place here, output will b 0 by calling the default value
		//The constructor should be placed before declaring the object.
	}

public constructorTest()
{
	i=5;
	j=5;
			}
}
