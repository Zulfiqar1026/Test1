package com.summer.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.summer.utilityy.base_classSummer;

public class loginpagesummerLocators extends base_classSummer{

	
	public loginpagesummerLocators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how= How.ID, using ="loginusername")
	public WebElement namesum;
	
	@FindBy(how= How.ID, using ="loginpassword")
	public WebElement passwordsum;
	
	@FindBy(how= How.XPATH, using ="//button[text() = 'Log in']")
	public WebElement submit;
	
	
}
	
	
