package DataExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framestwo {
	public static void main(String[] args) {
		//lounch the browser
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Frame5.html");
		//operations
		driver.findElement(By.id("un")).sendKeys("Ravi");
		driver.switchTo().frame(0);
		driver.findElement(By.id("pwd")).sendKeys("vinu");
		
		
	}

}
