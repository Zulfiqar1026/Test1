package com.summer.actions;

import org.testng.Assert;

import com.summer.locator.profilepagesummerLocators;
import com.summer.utilityy.base_classSummer;

public class profilepagesummerActions extends base_classSummer{

	profilepagesummerLocators ProfilepagesummerLocators = new profilepagesummerLocators();
	
	
	public void userloginsumhasbeensuccessful() throws Exception {
		
		boolean profilepage = ProfilepagesummerLocators.loginsum.isDisplayed();
		Assert.assertTrue(profilepage);
		Thread.sleep(3000);
	}
}
