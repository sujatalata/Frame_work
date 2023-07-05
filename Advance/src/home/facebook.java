package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		
		
				
		
	}

}
