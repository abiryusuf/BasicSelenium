package selenium_practice;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataRead {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        FileInputStream fis = new FileInputStream("C:/MyDevelopment/Basic_Selenium_Practice/Workbook.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("Sheet1");
        String cellValue = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println("Cell value is -->"+cellValue);

    }
}
