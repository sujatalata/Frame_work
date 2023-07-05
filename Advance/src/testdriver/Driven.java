package testdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Driven {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1
		FileInputStream fis=new FileInputStream("./excel/suji.xlsx");
		//step2
		Workbook book=WorkbookFactory.create(fis);
		//step3
	Sheet sh = book.getSheet("sheet1");
	//4
	 Row r = sh.getRow(0);
	 //step5
	 Cell c = r.getCell(1);
	 //step6
	 String value = c.toString();
	 System.out.println(value);
		
	}
	
	
	

}
