package collectionTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet S = new TreeSet();
		S.add("A");
		S.add("D");
		S.add("C");
		S.add("B");
		S.add("A");
		S.add("C");
		S.add("D");
		S.add("B");
		Iterator it = S.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}
/*Tree set is a class which removes dyplicates and provides the reuslt inascending order*/
