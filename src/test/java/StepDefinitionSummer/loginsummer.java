package StepDefinitionSummer;

import com.google.common.base.MoreObjects.ToStringHelper;
import com.summer.actions.homepagesummerActions;
import com.summer.actions.loginpagesummerActions;
import com.summer.actions.profilepagesummerActions;
import com.summer.utilityy.Utilityyyy;
import com.summer.utilityy.base_classSummer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginsummer extends base_classSummer{
	
	homepagesummerActions HomepagesummerActions = new homepagesummerActions();
	loginpagesummerActions LoginpagesummerActions = new loginpagesummerActions();
	profilepagesummerActions ProfilepagesummerActions = new profilepagesummerActions();
	
	
	
	
	@Given("^launch \"([^\"]*)\" urlsum$")
	public void launch_urlsum(String URL) throws Throwable {
	
		getURLsum(URL);
		
		Utilityyyy.takescreenshot(driver, "Home Page Shot");
		//I am giving name as "Home page" bcause we will take the screen shot of the home page 
		
		
	}

	@Then("^click loginsum$")
	public void click_loginsum() throws Throwable {
	
		HomepagesummerActions.clickloginsum();
		
		
	}

	@Then("^enter namesum and passwordsum and click submit button$")
	public void enter_namesum_and_passwordsum_and_click_submit_button() throws Throwable {
	
	LoginpagesummerActions.UserCredential(propsum.getProperty("USERNAMESUM"),propsum.getProperty("PASSWORDSUM"));
	Utilityyyy.takescreenshot(driver, "Login Page shot");
	
	
		}

	@Then("^user loginsum has been successful$")
	public void user_loginsum_has_been_successful() throws Throwable {
	
		ProfilepagesummerActions.userloginsumhasbeensuccessful();
		Utilityyyy.takescreenshot(driver, "Profile Page shot");
		
		
	}
	
}
