package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		ele1.click();
		Thread.sleep(2000);
		 WebElement ele2 = driver.findElement(By.xpath("//img[@class='_396cs4']"));
		 ele2.click();
		 Thread.sleep(2000);
		 Actions act=new Actions(driver);
		act.moveToElement(ele1).perform();
		WebElement ele3 = driver.findElement(By.xpath("//input[@class='_166SQN']"));
		ele3.sendKeys("560079");
		 
		 
		
	}

}
