package com.summer.actions;

import org.testng.Assert;

import com.summer.locator.PlaceOrderPageLocator;
import com.summer.utilityy.base_classSummer;

public class PlaceOrderPageActions extends base_classSummer{

	PlaceOrderPageLocator placeOrderPageLocator = new PlaceOrderPageLocator();
	
	public void  verifyOrderPlaced () throws Exception {
	
	boolean placeorder = placeOrderPageLocator.placeorder.isDisplayed();
	Assert.assertTrue(placeorder);
	
	Thread.sleep(3000);
		
	}
	
	
	
}
