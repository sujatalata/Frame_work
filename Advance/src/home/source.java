package home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class source {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//img"));
		for(WebElement src:ele)
		{
		src.getAttribute("src");
		System.out.println(src);
		}
		Thread.sleep(2000);
	driver.close();	
		
		
	}

}
