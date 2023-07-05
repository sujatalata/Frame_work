package home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//fetch both image and links
public class withoutgetcss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		 List<WebElement> ele = driver.findElements(By.xpath("//a|//img"));
		int count = ele.size();
		 for(WebElement src:ele)
		 {
			 String link2 = src.getAttribute("aimg");
			System.out.println(link2);
		 }
				Thread.sleep(2000);
				driver.close();
				
			}
		
	}

