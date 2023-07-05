package classass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleardisable {
	void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/passdisable.html");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('a1'). value=''");
	
		
	}

}



