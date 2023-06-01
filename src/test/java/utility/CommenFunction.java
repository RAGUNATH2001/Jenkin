package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseFile.BaseClass;

public class CommenFunction extends BaseClass {
	
	
	static public void ClickFunction(WebElement loc) {
		loc.click();
		
	}
	
	static public void SendKeys(WebElement ele,String argu) {
		
		ele.sendKeys(argu);
		
	}

}
