package PageFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommenFunction;

public class PageClass extends baseFile.BaseClass {
	
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement emailButton;
	
	public PageClass() {
		
	PageFactory.initElements(driver,this);
		
	}
	
	
	public void loginForm() {
		
		CommenFunction.SendKeys(emailButton,"nragunath2001@gmail.com");
		
		
		
	}
	
	
	
	
	
	

}
