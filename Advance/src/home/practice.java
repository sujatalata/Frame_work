package home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		  List<WebElement> ELE = driver.findElements(By.xpath("//a"));
		 Thread.sleep(2000);
		int count = ELE.size();
		for(WebElement lin:ELE)
		{
			String attribute = lin.getAttribute("href");
			System.out.println(attribute);
			
		}
		
		 Thread.sleep(2000);
		 driver.close();
		 
				 
		
		
		
		
	}

}