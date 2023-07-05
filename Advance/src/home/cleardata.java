package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class cleardata {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/home3.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
		
		
		
	}

}
