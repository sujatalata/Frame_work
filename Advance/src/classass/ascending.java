package classass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ascending {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		 WebElement ele = driver.findElement(By.id("month"));
		 Select s=new Select(ele) ;
		 ArrayList<String>l=new ArrayList<String>();
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement we:opt);
	
		
		
		
	}

}
