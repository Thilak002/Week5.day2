package testcase;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String FileName) throws IOException {
		
      XSSFWorkbook wb = new XSSFWorkbook("./data/"+ FileName +".xlsx");
	  XSSFSheet ws = wb.getSheetAt(0);
	  int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);
	 short cellcount = ws.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		String[][] data = new String[rowcount][cellcount];
	 for (int i = 1; i <=rowcount; i++) {
		XSSFRow row = ws.getRow(i);
		for (int j = 0; j < cellcount; j++) {
		  XSSFCell cell = row.getCell(j);
		  
		String celldata = cell.getStringCellValue();  
	        data[i-1][j] = celldata ;

		
		}
	}
	wb.close();
	return data;
		
		
		
		
		
		
		
	}

}
