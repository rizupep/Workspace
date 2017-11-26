package hashTest;

import java.util.Hashtable;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		// Hashtable is for faster recovery
		table.put("Name", "ABC");
		table.put("password", "123");
		table.put("domain", "testing");
		table.put("company", "vmetry");
		table.put("Address", null);
		System.out.println(table.get("company"));
	}

}

/*
 * Hashtable wont allow null values Hashtable wont allow null key also
 * Thread safety is huge
 * Hashtable is slow since there is thread safety
 */
