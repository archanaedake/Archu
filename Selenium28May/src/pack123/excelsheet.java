package pack123;

import java.io.FileInputStream;

public class excelsheet {
	public static void main(String[] args) {
		String path ="E:\\Automation Code\\Desktop\\TestExcel.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		System.out.println(value);
		
	}
	

}
