package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddendivision {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\'fl icon-calendar_icon-new icon-onward-calendar icon\']")).click();
		driver.findElement(By.xpath("//td[text()='31']")).click();
		
		
		
	}

}
