package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class atribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
		Point locn = ele.getLocation();
		System.out.println(locn);
		int x = locn.getX();
		System.out.println(x); 
	int y = locn.getY();
	System.out.println(y);
	
			
		
		
		
		
	}

}
