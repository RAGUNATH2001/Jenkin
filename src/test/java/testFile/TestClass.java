package testFile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageFile.PageClass;
import baseFile.BaseClass;

public class TestClass extends BaseClass {
	
	
	@Test
	public void TestLoginForm() {
		
		driver.findElement(By.linkText("Log in")).click();
		
		PageClass obj=new PageClass();
				obj.loginForm();
		
		
		
	}

}
