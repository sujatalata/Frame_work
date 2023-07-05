package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		ele.sendKeys(Keys.CONTROL+"T");
		Thread.sleep(2000);
	 String pid	=driver.getWindowHandle();
	 Set<String> cid = driver.getWindowHandles();
	 Thread.sleep(2000);
	
	}


}
