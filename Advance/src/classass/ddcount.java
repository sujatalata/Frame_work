package classass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ddcount {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/home.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		
	}

}
