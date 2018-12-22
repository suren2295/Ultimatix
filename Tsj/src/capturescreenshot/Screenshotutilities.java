package capturescreenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotutilities {
	public static void takescreenshot(WebDriver dr,String Pagename)
	{
		try {
	
		TakesScreenshot sc=(TakesScreenshot)dr;
		File src=sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Screenshot\\"+Pagename+".png"));
	}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}}
	
				