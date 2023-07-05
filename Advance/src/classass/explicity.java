package classass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicity {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n"
				 ));
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
