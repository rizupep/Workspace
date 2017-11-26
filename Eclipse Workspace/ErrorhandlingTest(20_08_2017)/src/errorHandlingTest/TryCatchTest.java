package errorHandlingTest;

import java.util.Hashtable;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Error Handling initiator");
		try {

/*			Hashtable table=new Hashtable();
			table.put(null, null);
*/			
			int[] a = new int[1];
			a[0] = 1;
			a[1]=20;
			//a[2] = 20;
			int i = 1 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("invalid number enterd" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("invalid array size " + aie.getMessage());
		}

		catch (Exception e) {
			System.out.println("Sorry Something went wrong" + e.getMessage());
		} catch (Throwable t) {
			System.out.println("Unexpected error" + t.getMessage());
		} finally {
			System.out.println("Finally done");
		}

		System.out.println("error handling completor");
	}

}
