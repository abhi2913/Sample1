package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	
	public static WebDriver D;
	@BeforeSuite
	  public void beforeSuite() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	D=new ChromeDriver();
	D.manage().window().maximize();
	
	Thread.sleep(2000);
	}
	 @AfterSuite
	  public void afterSuite() {
		  D.close();
	  }
}
