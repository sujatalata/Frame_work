package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kantaramovie {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/webelement.html");
		 WebElement ele = driver.findElement(By.id("a1"));
		boolean b = ele.isDisplayed();
		if(b);
		{
			System.out.println("element displayed");
		}
		System.out.println("element is not displayed");
		}
			
			
		
		
		
	}


