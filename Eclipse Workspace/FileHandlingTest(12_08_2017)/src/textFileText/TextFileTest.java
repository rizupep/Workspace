package textFileText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileTest {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Eclipse Workspace\\FileHandlingTest(12_08_2017)\\File\\test.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f, true);
		// if true is given , it will fush the old data's
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Vmetry 10");
		bw.newLine();
		bw.newLine();
		bw.write("Vmetry 20");
		bw.newLine();
		bw.write("Vmetry 30");
		bw.close();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
				/*
		 * String data= br.readLine(); 
		 * System.out.println(data);
		 */
		String data="";
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
	}

}
