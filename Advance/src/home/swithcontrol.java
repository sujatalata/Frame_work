package home;


import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class swithcontrol {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@text()='ಕನ್ನಡ']"));
		Thread.sleep(2000);
		Actions s1=new Actions(driver);
		s1.contextClick(ele).perform();
	Robot r=new Robot();
			
			
	
		
		
	}

}
