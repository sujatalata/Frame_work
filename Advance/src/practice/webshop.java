package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;



public class webshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/login");
	WebElement ele = driver.findElement(By.xpath("//a[@href='/apparel-shoes']"));
	ele.click();
	WebElement ele1 = driver.findElement(By.xpath("//select[@name='products-orderby']"));
	ele1.click();
	Select s=new Select(ele1);
	s.selectByIndex(1);
	Thread.sleep(1000);
	WebElement ele2 = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	ele2.click();
	Thread.sleep(1000);
	Select s1=new Select(ele2);
	Thread.sleep(1000);
	s1.selectByVisibleText("4");
	WebElement ele3 = driver.findElement(By.xpath("//select[@name='products-viewmode']"));
	ele3.click();
	Thread.sleep(1000);
	Select s2=new Select(ele3);
	s2.selectByVisibleText("List");
	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	driver.findElement(By.xpath("//span[@class='cart-label']"));
	
	//s.selectByVisibleText(null)
	
		
	}

}
