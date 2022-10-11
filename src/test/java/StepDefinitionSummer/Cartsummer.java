package StepDefinitionSummer;

import com.summer.actions.PlaceOrderPageActions;
import com.summer.actions.addtocartActions;
//import com.summer.actions.PlaceOrderPageActions;
import com.summer.actions.homepagesummerActions;
import com.summer.utilityy.base_classSummer;

import cucumber.api.java.en.Then;

public class Cartsummer extends base_classSummer{

	homepagesummerActions HomepagesummerActions = new homepagesummerActions();
	//PlaceOrderPageActions placeOrderPageActions = new PlaceOrderPageActions();
	
	addtocartActions AddtocartActions = new addtocartActions();
	
	PlaceOrderPageActions placeOrderPageActions = new PlaceOrderPageActions();
	
	@Then("^click Monitor$")
	public void click_Monitor() throws Throwable {
		HomepagesummerActions.clickMonitor();
	
	}

	@Then("^click AppleMonitor(\\d+)$")
	public void click_AppleMonitor(int Nusi) throws Throwable {
	
		HomepagesummerActions.clickAppleMonitor();
		Thread.sleep(3000);
	}
	

	@Then("^click Add to Cart alert$")
	public void click_Add_to_Cart_alert() throws Throwable {
		AddtocartActions.AddtoCartalert();
//		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	
	}

	@Then("^click Cart to check$")
	public void click_Cart_to_check() throws Throwable {
		AddtocartActions.clickCarttocheck();
		Thread.sleep(3000);
	}

	
	
	@Then("^verify Order Placed$")
	public void verify_Order_Placed() throws Throwable {
		placeOrderPageActions.verifyOrderPlaced();
		
	}

	
}
