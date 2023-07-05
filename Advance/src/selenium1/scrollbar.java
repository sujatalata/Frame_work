package selenium1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://Amazone.com");
	JavascriptExecutor Js=(JavascriptExecutor)driver;
	for(int i=0; i<3; i++)
	{
		Js.executeScript("window.scrollBy(x,y)");
Thread.sleep(1000);
	}
	for(int i=0; i<3; i++)
	{
		Js.executeScript("window.scrollBy(x,y)");
		Thread.sleep(1000);
		
	}
		
	
	
		
		
	}

}
