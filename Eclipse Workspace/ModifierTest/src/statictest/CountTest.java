package statictest;

public class CountTest {
static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CountTest c1=new CountTest();
CountTest c2=new CountTest();
CountTest c3=new CountTest();
		c1.add();
		c2.add();
		c3.add();
	}
	
	public void add()
	{
		i++;
		System.out.println(i);
	}

}
