package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ra ra sarasaku ra ra");
driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
	}
}

