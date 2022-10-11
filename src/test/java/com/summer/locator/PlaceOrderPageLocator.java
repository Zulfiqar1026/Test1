package com.summer.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.summer.utilityy.base_classSummer;

public class PlaceOrderPageLocator extends base_classSummer{

	
	public PlaceOrderPageLocator() {
		
		
		PageFactory.initElements(driver, this);
		
		}

	//place order locator
		@FindBy(how= How.XPATH, using ="//button [text() = 'Place Order']")
		public WebElement placeorder;
	
		
}

