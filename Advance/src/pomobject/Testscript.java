package pomobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Testscript {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Pomscript p=new Pomscript(driver);
		p.firstname("suju");
		p.lastname("lata");
		p.email("su12@gmail.com");
		
		
		
		
		
	}

}
