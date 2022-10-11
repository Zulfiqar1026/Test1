package com.summer.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.summer.utilityy.base_classSummer;

public class profilepagesummerLocators extends base_classSummer {

	
public profilepagesummerLocators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how= How.ID, using ="nameofuser")
	public WebElement loginsum;
	
		
		
	
	
	
}
