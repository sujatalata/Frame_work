package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Takescreanshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("E:\\takescrn\\shirt.jpeg");
		FileHandler.copy(src, path);
		
		
	}

}
