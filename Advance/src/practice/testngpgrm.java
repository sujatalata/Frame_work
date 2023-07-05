package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testngpgrm {
	@Test
	public void test1()
	{
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for(int i=0;i<count;i++);
		{
		WebElement w = links.get(count);
		String t= w.getText();
		System.out.println(t);
		
		}
	}
		@Test
		public void test2()
		{
			System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.Flipkart.com");
		driver.findElement(By.xpath("//svg[@class='']"));
	
		
		
		
	
	
	}	

}
