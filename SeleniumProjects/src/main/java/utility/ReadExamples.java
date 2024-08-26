package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExamples {

    public static String getProductDetails(String SheetName, int rowIndex, int columnIndex) throws IOException {
        File file = new File("src/main/resources/configuration/TestData/ListData.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("sheetName");
        return sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
    }
}


