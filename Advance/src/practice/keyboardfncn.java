package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyboardfncn {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/webelement.html");
		WebElement ele = driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
		
	
		
		
		
	}
	
		
	}


