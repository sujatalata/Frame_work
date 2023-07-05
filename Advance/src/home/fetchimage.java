package home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchimage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/tet.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		Thread.sleep(2000);
		int size = ele.size();
		for(int i=0; i<size; i++)
		{
			WebElement text = ele.get(i);
			Thread.sleep(2000);
			text.sendKeys("Sujata");
		}
		for(int i=size-1; i>=0; i--)
		{
			WebElement text1 = ele.get(i);
			Thread.sleep(2000);
			text1.clear();
		}
	}

}
