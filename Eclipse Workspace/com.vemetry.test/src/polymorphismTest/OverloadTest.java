package polymorphismTest;

public class OverloadTest {

	public static void main(String[] args) {
		add(1, 1, 1);
		add(10, 20, "tester");
	}

	public static void add(int i, int j) {
		int k = i + j;
		System.out.println(k);
	}

	public static void add(int i, int j, int z) {
		int k = i + j + z;
		System.out.println(k);
	}

	public static void add(int a, int b, String msg) {
		int k = a + b;

		System.out.println(msg + k);
	}
}
