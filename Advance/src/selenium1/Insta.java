package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8151061639");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sujisuji");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}

}


