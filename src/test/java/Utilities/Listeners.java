package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Test.Basetest;

public class Listeners extends Basetest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
	
		ScreenShot ref=new ScreenShot();
		try {
			ref.sc(D, result.getName());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
