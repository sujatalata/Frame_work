package Runnerscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.Genericfirst;

public class runnerfirst {
	public class Runnerscript extends Genericfirst
	{
		@Test
		public void validlogin()
		{
			driver.findElement(By.id("email")).sendKeys("hellow");
			
			
		
		
	}
	}
}
