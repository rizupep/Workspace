package textFileText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("E:\\Eclipse Workspace\\FileHandlingTest(12_08_2017)\\File\\test.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("company"));
		
	}

}
