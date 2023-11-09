import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\AamirSohail\\Downloads\\dummydata.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testing")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator <Row>rows = sheet.rowIterator();
				Row firstRow = rows.next();
				Iterator <Cell> ce = firstRow.cellIterator();
				while(ce.hasNext()) {
					Cell value = ce.next();
					System.out.println(value.getRichStringCellValue());
				}
			}
			
		}
		
	}

}
