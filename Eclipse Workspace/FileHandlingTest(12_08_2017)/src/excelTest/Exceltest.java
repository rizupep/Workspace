package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltest {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Riz\\Desktop\\test1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // XSSFWorkbook for xlsx
														// format excel
		XSSFSheet sheet = workbook.getSheet("home"); // Home is sheet name
		int row = sheet.getLastRowNum() + 1; // row is counted from 0 so adding
												// +1 imp step
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col);
		/*
		 * String data = sheet.getRow(1).getCell(1).getStringCellValue();
		 * System.out.println(data);
		 */
		for (int rownum = 0; rownum < row; rownum++) {
			for (int cellnum = 0; cellnum < col; cellnum++) {
				// sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				if (sheet.getRow(rownum).getCell(cellnum).getCellType() == Cell.CELL_TYPE_STRING) {

					String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
					System.out.print(data + " ");
				}

				else if (sheet.getRow(rownum).getCell(cellnum).getCellType() == Cell.CELL_TYPE_NUMERIC) 
				{

					int data = (int) sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
					System.out.print(data + " ");
				}
				/*else if (sheet.getRow(rownum).getCell(cellnum).getCellType()== Cell.CELL_TYPE_BLANK )
				{
                    System.out.println("");*/
                    		/*sheet.getRow(rownum).getCell(cellnum).toString()
                }*/
				/*else if (sheet.getRow(rownum).getCell(cellnum).getCellType() == Cell.CELL_TYPE_BLANK)
				{
					System.out.print(" ");
				}*/
				
				 			
			}
			System.out.println();
		}
		fis.close();
		FileOutputStream fos = new FileOutputStream(f);
		sheet.getRow(1).getCell(1).setCellValue("Vmetry");
		workbook.write(fos);
		fos.close();
	}
}
