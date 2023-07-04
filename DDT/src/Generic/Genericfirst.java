package Generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Genericfirst {
public WebDriver driver;
@ Beforemethod
public void openapplcn()
{
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Aftermethod
public void closeapplcn()
{
	driver.close();
}

}
	


