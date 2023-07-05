package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexc {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void exc(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			
		}
		
	}
	
	
	

}
}