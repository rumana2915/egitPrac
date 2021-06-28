package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReed {

	static DataFormatter format;
	static Sheet sh;

	public static Object[][] excelToArray(String filename, String sheetname) throws IOException {

		FileInputStream fis = new FileInputStream(filename);
		format = new DataFormatter();
		Workbook wb = new XSSFWorkbook(fis);

		sh = wb.getSheet(sheetname);
		int totalRows = sh.getPhysicalNumberOfRows(); // 3
		int totalCols = sh.getRow(0).getPhysicalNumberOfCells(); // 2
		Object[][] t = new Object[totalRows - 1][totalCols];
		for (int r = 1; r < totalRows; r++) {
			for (int c = 0; c < totalCols; c++) {
				// we will read the excel cell value and put it into an array. t
				t[r - 1][c] = getCellData(r, c);
			}
		}
		return t;
	}

	public static String getCellData(int row, int col) {
		String data = " ";
		Cell c = sh.getRow(row).getCell(col);
		data = format.formatCellValue(c);
		return data;
	}

}
