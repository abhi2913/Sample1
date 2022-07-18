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

public class Moztest extends Basetest {
	

	
	homepage B;
	@BeforeClass
	public void Bc(){
		//L=new Loginpage(D);
		B=new homepage(D);
	}
	
  @Test
  public void f() {
	  D.get("https://www.facebook.com/");
	  Assert.assertEquals(D.getTitle(), "og in to Facebook");
	  B.login("9765187111", "abhiabhi");
	  B.send();
	  
  }


}
