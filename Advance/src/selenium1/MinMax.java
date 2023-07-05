package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMax {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./Software/chromedrover.exe");
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		
	}

}
