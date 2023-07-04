
package multiple;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Data2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Excel/Testdata1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sh = book.getSheet("Sheet1");
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
	List<WebElement>links=driver.findElements(By.xpath("//month"));
	Select s=new Select((WebElement) links);
	List<WebElement> opt = s.getOptions();
	int count =opt.size();
	System.out.println(count);

	String txt;
	for(WebElement we:opt)
		txt=we.getText();
	{
		int i = 0;
		Row r=sh.createRow(i);
		Cell c = r.createCell(0);
		String value=links.get(i).getAttribute("href");
		c.setCellValue(value);

}
FileOutputStream fos=new FileOutputStream("./Excel/Testdata1.xlsx");
book.write(fos);
}
}


