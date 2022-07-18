package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Pass;
	
	@FindBy(id="btnLogin")
	WebElement Button;
	
	public Loginpage (WebDriver D){
		
		PageFactory.initElements(D,this);
	}
	
	public void enterdetails(String id, String pass) {
		
		Username.sendKeys(id);
		Pass.sendKeys(pass);
	}
	
	public void send() {
		Button.click();
	}

}
