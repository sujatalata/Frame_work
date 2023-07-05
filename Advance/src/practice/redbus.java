package practice;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.com/");
		WebElement ele = driver.findElement(By.id("disricts of karnataka"));
		Select se=new Select(ele);
		ArrayList<String>l=new ArrayList<String>();
		List<WebElement> opt = se.getOptions();
		int count = opt.size();
		System.out.println(count);
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
