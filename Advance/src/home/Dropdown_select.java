package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_select 
{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Desktop/multiple.html");
	  WebElement htl = driver.findElement(By.id("marutihotel"));
	Select s=new Select(htl);
	boolean b = s.isMultiple();
	if(b)
		
	{
		System.out.println("multi select dropdwon");
	}
	else
	{
		System.out.println("not multiseletdrop down");
	}
}
}
