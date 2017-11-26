package stringtest;

import java.awt.im.InputContext;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "vmetry";
String output = "Tecnology";
input.concat(output);
System.out.println(input.concat(output));
System.out.println(input);

StringBuilder sb = new StringBuilder(" Vmetry");
sb.append(" Technology");
System.out.println(sb);

StringBuffer sb1 = new StringBuffer(" Vmetry ");
sb1.append("Technology");
System.out.println(sb1);
	}

}
