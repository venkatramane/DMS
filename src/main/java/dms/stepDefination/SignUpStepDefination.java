package dms.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dmspages.SignUpPages;
import mainBasePack.BaseClassProp;

public class SignUpStepDefination extends BaseClassProp {
	
	SignUpPages sign;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		
		BaseClassProp.initalization();
	    
	}

	@Then("^open url$")
	public void open_url() throws Throwable {
		sign = new SignUpPages();
		sign.verifyTitle();
	    
	}

	@Given("^first name$")
	public void first_name() throws Throwable {
		
		sign.signUp();
	    
	}

	


}
