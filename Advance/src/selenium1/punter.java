package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class punter
{
public static void main(String[] args)
{
	String key="webdriver.chrome.driver";
	String value="./Software/chromedriver.exe";
	System.setProperty(key,value);
	ChromeDriver driver=new ChromeDriver();
			
}
}
