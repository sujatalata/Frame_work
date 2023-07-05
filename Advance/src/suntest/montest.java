package suntest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


	public class tscript {
		@Test
		public void test1()
		{
			System.setProperty("webdriver.chrome.driver","./Software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String chaitra=driver.getCurrentUrl();
		System.out.println(chaitra);
		
		String chaitra1=driver.getPageSource();
		System.out.println(chaitra1);
			
		}
		@Test
		public void test2()
		{
			System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.Flipkart.com");

		}
	}

}
