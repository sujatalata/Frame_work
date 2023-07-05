package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class punter1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/cer/click.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("a")).click();
	
}

}