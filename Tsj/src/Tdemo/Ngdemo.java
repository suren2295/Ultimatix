package Tdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ngdemo {
	@Test
	 public void ngde() {
	
	/*System.setProperty("webdriver.chrome.driver", "E:\\javaSelenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String str1= driver.getTitle();
	String str="Facebook – log in or sign up";
	//System.out.println(Assert.assertEquals(str, str1));*/
		SoftAssert sof=new SoftAssert();
		System.out.println("step 1");
		System.out.println("step 2");
		sof.assertEquals(10,20);
		System.out.println("step 3");
		System.out.println("step 4");
		sof.assertAll();
	
	
}
}
