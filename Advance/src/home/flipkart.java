package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8151061639");	
	 
	// Thread.sleep(2000);
	
	
		
	}

}
