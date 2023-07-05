package home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_checkbox {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/wensdy.html");
		List<WebElement> ele = driver.findElements(By.tagName("//input"));
		int text = ele.size();
		System.out.println(text);
		for(int i=0; i<text;i++) 
		{
			 WebElement links = ele.get(i);
			 links.click();
			 Thread.sleep(1000);
		}
	for(int i=text-1;i>=0;i--)
	{
		WebElement links = ele.get(i);
		links.click();
		Thread.sleep(1000);
		}
}

}
