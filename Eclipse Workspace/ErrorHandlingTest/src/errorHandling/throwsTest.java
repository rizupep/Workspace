package errorHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class throwsTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fileHandling();
	}

	public static void fileHandling() throws IOException {
		File f = new File("");
		FileInputStream fs = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fs);
	}
}
