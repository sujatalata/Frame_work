package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class multipletab {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		=driver.findElement(By.xpath("//span"))
	}

}
