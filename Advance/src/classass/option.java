package classass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class option {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/hotel.html");
		WebElement slct = driver.findElement(By.id("marutihotel"));
		Select s=new Select(slct);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("palav");
		Thread.sleep(2000);
		s.deselectAll();
		
			
		
	}

}
