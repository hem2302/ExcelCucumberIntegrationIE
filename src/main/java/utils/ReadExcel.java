package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends DataObjects{
	public void readExcel(String credentials) throws IOException {
		FileInputStream fis = new FileInputStream(".//data/datasheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {	
			if(sheet.getRow(i).getCell(0).getStringCellValue().equals(credentials))
			{
				setUname(sheet.getRow(i).getCell(1).getStringCellValue());
				setPWD(sheet.getRow(i).getCell(2).getStringCellValue());
			}
		}
	}

}
