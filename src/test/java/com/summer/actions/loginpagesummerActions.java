package com.summer.actions;

import com.summer.locator.loginpagesummerLocators;
import com.summer.utilityy.base_classSummer;

public class loginpagesummerActions extends base_classSummer{

	
		
		loginpagesummerLocators LoginpagesummerLocators = new loginpagesummerLocators();
		
		public void UserCredential(String u, String p) throws Exception {
		
		LoginpagesummerLocators.namesum.sendKeys(u);
		
		LoginpagesummerLocators.passwordsum.sendKeys(p);
		
		LoginpagesummerLocators.submit.click();
		Thread.sleep(3000);
	}
}
