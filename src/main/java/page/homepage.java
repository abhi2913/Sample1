package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(id="email")
	WebElement Userid;
	
	@FindBy(id="pass")
	WebElement pas;
	
	@FindBy(id="loginbutton")
	WebElement Send;
	public homepage(WebDriver D) {
		PageFactory.initElements(D, this);
	}
	
	public void login(String id,String PASS) {
	Userid.sendKeys(id);
	pas.sendKeys(PASS);
	}
	public void send() {
		Send.click();
	}
}

