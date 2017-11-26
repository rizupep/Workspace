package collectionTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistTest {

	public static void main(String[] args) {
		LinkedList S = new LinkedList();
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
 /*In generaL operation 9 Data search array list is faster ,
linked list is slower thaan array list
if your are frequently inserting and deleting the in a list use linked list
If your value remains same use array list
Real time example: In flipcart adding products to cart and removing - linked list should be used
Price list which remains same , array list ca be used */
