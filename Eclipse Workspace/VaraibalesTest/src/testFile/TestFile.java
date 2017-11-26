package testFile;

public class TestFile {
	{
		System.out.println("Normal Block");
	}
	static {
		System.out.println("Static Block");
	}

	public TestFile() {
		System.out.println("Constructor Block");
	}

	public static void add() {
		System.out.println("add fuc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestFile t=new TestFile();

	}
}
