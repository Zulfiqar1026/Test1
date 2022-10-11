package com.summer.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.summer.utilityy.base_classSummer;

public class homepagesummerLocators extends base_classSummer {
	
	public homepagesummerLocators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how= How.ID, using ="login2")
	public WebElement loginsum;
	
	//LAptop link
	@FindBy(how= How.ID, using ="itemc")
	public WebElement LaptopsLinks;
	
	
	@FindBy(how= How.XPATH, using ="/html/body/div[5]/div/div[2]")
	public WebElement LaptopsDisplay;
	
	//monitor locator
	@FindBy(how= How.XPATH, using ="//a[text() = 'Monitors']")//done for monitor
	public WebElement Monitor;
	
	//apple monitor locator
	@FindBy(how= How.XPATH, using ="//a[text() = 'Apple monitor 24']")//done for apple monitor 24
	public WebElement Apple;
	
		
}

		

