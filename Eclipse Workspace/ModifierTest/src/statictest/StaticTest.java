package statictest;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest s=new StaticTest();
		s.calc();
		add();
	}

	public static void add() {
		System.out.println("add");
	}

	public void sub() {
		System.out.println("sub");

	}

	public void calc()

	{

		add();
		sub();
	}
}
