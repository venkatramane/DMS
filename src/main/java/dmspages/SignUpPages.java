package dmspages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainBasePack.BaseClassProp;

public class SignUpPages extends BaseClassProp{
	
	@FindBy(xpath="//input[@type='text' and @name='firstName']")
	WebElement firsrname;
	
	@FindBy(xpath="//input[@type='text' and @name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement nextBtn;
	
	
	
	public SignUpPages(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyTitle(){
		return driver.getTitle();
		
	}
	
	public void signUp(){
		firsrname.sendKeys("Venkat");
		lastname.sendKeys("Dhaya");
		nextBtn.click();
	}

}
