package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Punt {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("8151061639");
	driver.findElement(By.name("pass")).sendKeys("sujisuji");
	driver.findElement(By.name("login")).click();
	}
}