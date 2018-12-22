package capturescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebooklogin {
	
	@Test
	public void mylog( ) {
		System.setProperty("webdriver.chrome.driver", "E:\\javaSelenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Screenshotutilities.takescreenshot(driver, "Homepage");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("send");
		driver.findElement(By.xpath("//input[@id='email']//following::input[1]")).sendKeys("test");
        driver.findElement(By.xpath(".//*[@id='email']//following::input[2]")).click();  
        Screenshotutilities.takescreenshot(driver, "Loginpage");

}}
