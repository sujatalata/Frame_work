package pomobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Pomscript {
	
	@FindBy(xpath = "//input[class='header-text']")
	private WebElement firstname;
	@FindBy(xpath = "//input[id='lastName']")
	private WebElement lastname;
	@FindBy(xpath = "//input[id='userEmail']")
	private WebElement email;
	public  Pomscript(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	public void firstname(String FN)
	{
		firstname.sendKeys(FN);
	}
		public void lastname(String LN)
		{
		lastname.sendKeys(LN);
	}
	public void email(String EM)
	{
		email.sendKeys(EM);
		
		
		
	
	
	
	
	
	
	}
}
