package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/hotel.html");
		WebElement htl = driver.findElement(By.id("marutihotel"));
		Select s=new Select(htl);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("k");
		Thread.sleep(1000);
		s.selectByVisibleText("bisibelebath");
		Thread.sleep(1000);
		s.deselectAll();
		
		
	}

}
