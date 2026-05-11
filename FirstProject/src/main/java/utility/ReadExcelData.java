package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class ReadExcelData {
    public static String getParticularData(int rowno, int cellno) {
        String data = "";
        try {
            File file = new File("C:\\Users\\Ajith M\\Downloads\\DataDriven_IPT.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");
            Row row = sheet.getRow(rowno);
            Cell cell = row.getCell(cellno);
            DataFormatter dataformat = new DataFormatter();
            data = dataformat.formatCellValue(cell);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void getAllData() {
        try {
            File file = new File("C:\\Users\\Ajith M\\Downloads\\DataDriven_IPT.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");

            int lastRowNum = sheet.getLastRowNum();
            System.out.println("No of rows: " + lastRowNum);

            Short lastCellNum = sheet.getRow(0).getLastCellNum();
            System.out.println("No of columns: " + lastCellNum);

            for (int row = 0; row < lastRowNum; row++) { // row iteration

                Row rows = sheet.getRow(row);

                for (int clmn = 0; clmn < lastCellNum; clmn++) {//column iteration
                    Cell cell = rows.getCell(clmn);
                    DataFormatter dataFormat = new DataFormatter();
                    String data = dataFormat.formatCellValue(cell);
                    System.out.println(data);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getAllData();
    }
}