package home;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertandconfirmation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sujata");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	Alert a = driver.switchTo().alert();
	String t = a.getText();
	System.out.println(t);
	a.accept();
		
	}

}
