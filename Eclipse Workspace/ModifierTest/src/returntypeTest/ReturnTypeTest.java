package returntypeTest;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r=add()*sub();
System.out.println(r);
System.out.println(msg());
	}
	public static int add()
	{
		int i=1;
		int j=1;
		int k=i+j;
		System.out.println(k);
		return k;
	}
	public static int sub()
	{
		int i=5;
		int j=2;
		int k=i-j;
		System.out.println(k);
		return k;
	}
	public static String msg()
	{
		int i=1;
		int j=1;
		int k=i+j;
		String m="Addition of 2 number is:";
		return m+k;
		
	}
	
	  ReturnTypeTest()
	{
		
	}

}
