package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fontsize {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		 WebElement ele = driver.findElement(By.xpath("//input[@type='password']"));
		String size = ele.getCssValue("font-size");
		 System.out.println(size);
		
		
	}

}