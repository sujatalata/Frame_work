package classass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrlbarxy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(x,y)");
	Thread.sleep(1000);
	
	
	
	
	
	
	

	
	
	
		}
		
	
}
