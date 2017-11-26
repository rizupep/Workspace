package collectionTest;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet S = new LinkedHashSet();
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
 * hashnext will check the memory space 
 * next is a function which reads the memory value.
 * iterator will come where there is no index.
 */
