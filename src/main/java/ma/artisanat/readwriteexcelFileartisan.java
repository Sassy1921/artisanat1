package ma.artisanat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readwriteexcelFileartisan {
    static XSSFRow row;

    public static void main(String[] args) throws Exception{

        try(FileInputStream fis = new FileInputStream(new File("src/main/resources/artisaninfo.xlsx")))
        {
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet spreadsheet = workbook.getSheetAt(0);
            Iterator <Row>  rowIterator = spreadsheet.iterator();

            while (rowIterator.hasNext()) {
                row = (XSSFRow) rowIterator.next();
                Iterator <Cell>  cellIterator = row.cellIterator();

                while ( cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    System.out.print(cell.toString()+"\t\t");

                }
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            // TODO: handle exception
        }
        catch (IOException e) {
            // TODO: handle exception
        }
    }


}
