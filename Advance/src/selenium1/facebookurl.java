package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookurl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	String Title=driver.getTitle();
	System.out.println(Title);
	
	String chaitra=driver.getCurrentUrl();
	System.out.println(chaitra);
	
	String chaitra1=driver.getPageSource();
	System.out.println(chaitra1);
		
		
				
		
	}

}
