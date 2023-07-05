package classass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class urlexplctwait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("https://www.google.com/"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}

\
