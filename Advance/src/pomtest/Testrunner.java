package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testrunner {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Pom p=new Pom1(driver);
		p.clicklogin();
		Thread.sleep(2000);
		driver.navigate()
		.refresh();
		
	}
	

}
