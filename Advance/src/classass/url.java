package classass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class url {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("month"));
		Select se=new Select(ele);
		List<WebElement> ele1 = se.getOptions();
		int count = ele1.size();
		for(WebElement er:ele1)
			{
			
			
			
			
		
		
		
		
		
	}
	}
}

