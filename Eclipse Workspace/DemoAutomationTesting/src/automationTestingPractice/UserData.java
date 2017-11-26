package automationTestingPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserData {
	static String URLkey;
	static String URLvalue;
	static String EmailSignup;
	static String FirstName;
	static String LastName;
	static String Address;
	static String EmailAddress;
	static String numberAsString;
	static String Phone;
	static String Gender;
	static String Hobbies;
	static String Language;
	static String skills;	
	static String country;
	static String select_country;
	static String Year;
	static String Month;
	static String Day;
	static String Password;
	

	public static void Data() throws IOException  {
		File f = new File("E:\\Eclipse Workspace\\DemoAutomationTesting\\Files\\Book1.xlsx ");
		Sheet s;
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum() + 1;
		int col = sheet.getRow(0).getLastCellNum();
		//System.out.println(row);
		//System.out.println(col);

		URLkey = sheet.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(URLkey);
		URLvalue = sheet.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(URLvalue); // this will display my URL which need
		EmailSignup = sheet.getRow(2).getCell(1).getStringCellValue();
		FirstName = sheet.getRow(3).getCell(1).getStringCellValue();
		LastName = sheet.getRow(4).getCell(1).getStringCellValue();
		Address = sheet.getRow(5).getCell(1).getStringCellValue();
		EmailAddress = sheet.getRow(6).getCell(1).getStringCellValue();
		Phone = sheet.getRow(7).getCell(1).getStringCellValue();
		Gender = sheet.getRow(8).getCell(1).getStringCellValue();
		Hobbies = sheet.getRow(9).getCell(1).getStringCellValue();
		Language = sheet.getRow(10).getCell(1).getStringCellValue();
		skills = sheet.getRow(11).getCell(1).getStringCellValue();
		country = sheet.getRow(12).getCell(1).getStringCellValue();
		select_country = sheet.getRow(13).getCell(1).getStringCellValue();
		Year = sheet.getRow(14).getCell(1).getStringCellValue();
		Month = sheet.getRow(15).getCell(1).getStringCellValue();
		Day = sheet.getRow(16).getCell(1).getStringCellValue();
		Password = sheet.getRow(17).getCell(1).getStringCellValue();
		//numberAsString = String.valueOf(Phone);

		/*
		 * int rownum = 0; XSSFRow Row = sheet.getRow(0); XSSFCell URL =
		 * Row.getCell(1); System.out.println(URL);
		 */

		// int row = sheet.getLastRowNum() + 1;

	}

}
