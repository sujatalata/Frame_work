package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class swap {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/cer/swap.html");
		 WebElement ele = driver.findElement(By.id("a1"));
		 ele.sendKeys(Keys.CONTROL+"a"+"x");
		WebElement ele1 =driver.findElement(By.id("a3"));
		ele1.sendKeys(Keys.CONTROL+"v");
	 WebElement ele2 =driver.findElement(By.id("a2"));
	 ele2.sendKeys(Keys.CONTROL+"a"+"x");
	 ele.sendKeys(Keys.CONTROL+"v");
	 ele1.sendKeys(Keys.CONTROL+"a"+"x");
	 ele2.sendKeys(Keys.CONTROL+"v");
		 
		
		
	}

}
