package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Loginpage;
import page.homepage;



public class LoginTest extends Basetest {
	
		
		
		Loginpage L;
	
		@BeforeClass
		public void Bc(){
			L=new Loginpage(D);
			
		}
		
	  @Test
	  public void f() {
		  D.get("https://opensource-demo.orangehrmlive.com/");
		  L.enterdetails("Admin", "admin123");
		  L.send();
		  Assert.assertEquals(D.getTitle(), "OrngeHRM");
	  }
	  

	 

}
