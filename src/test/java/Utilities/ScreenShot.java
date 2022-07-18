package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public void sc(WebDriver D, String name) throws InterruptedException,IOException {
		TakesScreenshot Tss=(TakesScreenshot)D;
		File source=Tss.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
		FileHandler.copy(source, file);
	System.out.println("Sc taken");}
}
