package constructorTest;

public class parameterisedConstructorTest {
	public static int a;
	public static int b;

	public static void main(String[] args) {
		parameterisedConstructorTest p = new parameterisedConstructorTest();
		int c = a + b;
		System.out.println(c);
		parameterisedConstructorTest p1 = new parameterisedConstructorTest(10, 10);
		int c1 = a + b;
		System.out.println(c1);
		parameterisedConstructorTest p2 = new parameterisedConstructorTest(100, 100);
		// It is constructor overloading, same name used in different form.
		int c2 = a + b;
		System.out.println(c2);
	}

	public parameterisedConstructorTest(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public parameterisedConstructorTest() {
		a = 5;
		b = 5;
	}
}
