package pomtest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.This;

public class pomscript {
	
	@FindBy(id="email") 
	private WebElement unField;
	@FindBy(id="pass")
	private WebElement passpwd;
	@FindBy (name="login")
	private WebElement loginBtn;
	public pomscript(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	public void passUN(String un)
	{
	unField.sendKeys(un);
	}
	public void passpwd(String pwd)
	{
		passpwd.sendKeys(pwd);
	}
			public void loginBtn()
			{
loginBtn.click();
				
				
				
			}
		}
		{
			
		}
	}
	
	
	
	

}
