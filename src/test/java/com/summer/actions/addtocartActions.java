package com.summer.actions;

import com.summer.locator.addtocartLocator;
import com.summer.utilityy.base_classSummer;

public class addtocartActions extends base_classSummer{

	addtocartLocator AddtocartLocator = new addtocartLocator();
	
	public void AddtoCartalert () {
		
		AddtocartLocator.Addtocartalert.click();
		
	}
	
	public void clickCarttocheck() {
		
		AddtocartLocator.Cartcheck.click();
		
	}
	
	
	
}
