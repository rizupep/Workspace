package hashTest;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMaptest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		// Hashtable is for faster recovery
		map.put("Name", "ABC");
		map.put("password", "123");
		map.put("domain", "testing");
		map.put("company", "vmetry");
		map.put("Address", null);
		map.put(null, "adyar");
		System.out.println(map.get("company"));
	}
}

/*
 * Hashmap allow null values 
 * Hashmap allow null key also
 * there is no thread safety
 * Hashmap is faster
 * If null is there it will take the last updated value
 * 
 * Tree map and linked hash map wont allow null values.
 */