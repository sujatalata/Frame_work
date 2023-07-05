
package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelementtwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/webelement.html");
		WebElement ele = driver.findElement(By.name("n1"));
		boolean s = ele.isSelected();
		if(s);
		{
			System.out.println("checked");
		}
		System.out.println("checked ");
		
		
	}
}

