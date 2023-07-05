package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	driver.findElement(By.cssSelector("input[id='search']")).click();
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("KGF trailer");
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
}
}
