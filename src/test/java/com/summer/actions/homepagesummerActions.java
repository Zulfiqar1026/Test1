package com.summer.actions;

import org.testng.Assert;

import com.summer.locator.homepagesummerLocators;
import com.summer.utilityy.base_classSummer;



public class homepagesummerActions  extends base_classSummer{

	homepagesummerLocators  HomepagesummerLocators = new homepagesummerLocators();
	
	public void clickloginsum() throws Exception {
		
		HomepagesummerLocators.loginsum.click();
		
		Thread.sleep(3000);
		
	}
	
	public void ClickLaptopsLink () {
		HomepagesummerLocators.LaptopsLinks.click();
		
	}
	
	public void verifyLaptopDisplay() {
		
		boolean laptopssss = HomepagesummerLocators.LaptopsDisplay.isDisplayed();
		
	Assert.assertTrue(laptopssss);
	
	}
	
	public void clickMonitor() {
		HomepagesummerLocators.Monitor.click();
		
		
	}
	
	
	public void clickAppleMonitor() {
		HomepagesummerLocators.Apple.click();
				
	}
	
	
	
	
	
	
	
	
	
}
