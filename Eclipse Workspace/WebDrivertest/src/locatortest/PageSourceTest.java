package locatortest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSourceTest {

	public static void main(String[] args) throws IOException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		String data = wd.getPageSource();
		System.out.println(data);
		File f = new File("E:\\Eclipse Workspace\\WebDrivertest\\libtest.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f, true);
		// if true is given , it will fush the old data's
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);
		bw.close();
	}
}
