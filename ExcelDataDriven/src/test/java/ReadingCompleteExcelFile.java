import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingCompleteExcelFile {

	DataFormatter formatter = new DataFormatter();
	
	@Test(dataProvider="driveTest")
	public void dataSet(String driverFName, String driverLName, String Team) {
		System.out.println(driverFName + " " + driverLName + " drives for " + Team);
	}
	
	@DataProvider(name="driveTest")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\AamirSohail\\Downloads\\f1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][columnCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}

		}
		return data;

	}
}
