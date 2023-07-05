package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
	driver.get("https://www.amazon.in/");
WebElement ele = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
//ele.click();
Actions act=new Actions(driver);//driver means application
act.moveToElement(ele).perform();
//driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();

     
		
		
	}

}
