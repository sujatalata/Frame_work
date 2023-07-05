package Pomscript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom1 {
	@FindBy(xpath = "//input[name='actiTimeUrl']")
	private WebElement sa;
	@FindBy(xpath = "//input[name='username']")
	private WebElement un;
	@FindBy(xpath = "//input[name='password']")
	private WebElement pwd;
	
	
	

}
