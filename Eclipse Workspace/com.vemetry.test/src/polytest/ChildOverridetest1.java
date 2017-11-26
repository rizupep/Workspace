package polytest;

public class ChildOverridetest1 extends ChildOverrideTest {

	public static void main(String[] args) {
		ChildOverridetest1 C1 = new ChildOverridetest1();
		C1.calci();
	}

	public static void add() {
		System.out.println(" Child Add 1");
	}

	public void calci() {
		add();
	}
}
