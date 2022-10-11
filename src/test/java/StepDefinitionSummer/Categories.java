package StepDefinitionSummer;

import com.summer.actions.homepagesummerActions;
import com.summer.utilityy.base_classSummer;

import cucumber.api.java.en.Then;

public class Categories extends base_classSummer{

	homepagesummerActions HomepagesummerActions = new homepagesummerActions();
	
	@Then("^Click LaptopsLink$")
	public void click_Laptops() throws Throwable {
	
		HomepagesummerActions.ClickLaptopsLink();
	}

	@Then("^verify LaptopsDisplay$")
	public void verify_LaptopsDisplay() throws Throwable {
	 
	HomepagesummerActions.verifyLaptopDisplay();
		
	}
	
}
