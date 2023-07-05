package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/xpath.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='c1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='c1']")).sendKeys("latachandru");
		
		
		
	}

}
