package Ing.SPAutomation.SPAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class xlsRead {
	@Test
	public void xlsReadTest() {

		try {
			String xlspath = "C:\\Users\\spawal\\git\\SPAutomation26Dec\\SPAutomation\\src\\test\\resources";
			File f1 = new File(xlspath + "\\Book1.xlsx");
			FileInputStream ins = new FileInputStream(f1);
			XSSFWorkbook wb = new XSSFWorkbook(ins);

			XSSFSheet sh = wb.getSheet("Sheet1");
			short col1 = sh.getRow(0).getLastCellNum();
			int row1 = sh.getLastRowNum();

			for (int rowi = 0; rowi <= row1; rowi++) {
				for (int colj = 0; colj < col1; colj++) {
					XSSFCell cellva = sh.getRow(rowi).getCell(colj);
					System.out.println(cellva.toString());
				}
				System.out.println("=====Next Row Data==========");

			}
wb.close();
			
		} catch (Exception e) {
			System.out.println("Errro in Reading xls" + e.getMessage());
		}

	}

	@Test
	public void xlWriteTest() {

		try {
			String xlspath = "C:\\deleteMe";
			File f1 = new File(xlspath + "\\Book2.xlsx");
			FileInputStream ins = new FileInputStream(f1);
			XSSFWorkbook wb = new XSSFWorkbook(ins);

			XSSFSheet sh = wb.getSheet("Sheet1");
			int row1 = sh.getLastRowNum();

			FileOutputStream fos=new FileOutputStream(f1);
			XSSFRow nrow = sh.createRow(row1+1);
			XSSFCell ncell = nrow.createCell(0);
			ncell.setCellValue("Updated");
		wb.write(fos);
			wb.close();
System.out.println("Writing in xls updated successfully");
			}
			
		 catch (Exception e) {
			System.out.println("Errro in Writng xls" + e.getMessage());
		}
		
	}

}
