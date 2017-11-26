package collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		/* Set is a interface */
		Set S = new HashSet();
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

/*
 * Set is a interface which removes duplicates Hashset is a class which removes
 * the duplicates and provides the output in a random manner
 */
