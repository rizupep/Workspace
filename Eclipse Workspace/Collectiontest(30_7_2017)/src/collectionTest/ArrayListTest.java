package collectionTest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("vmetry1"); // 0
		a.add("vmetry2"); // 1
		a.add("vmetry3"); // 2nd index
		a.add(2, "vmetry4"); // 3rd index

		// System.out.println(a.size());
		a.add("vmetry5");
		// System.out.println(a.get(0));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

}
