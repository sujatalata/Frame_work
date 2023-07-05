package Generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genericfirst {
public WebDriver driver;
 @BeforeMethod
public void openapplcn()
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterMethod
public void closeapplcn()
{
	driver.close();
}

}
	


