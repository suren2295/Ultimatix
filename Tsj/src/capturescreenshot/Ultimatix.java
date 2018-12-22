package capturescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ultimatix {
	@Test
	public void ultimatixlogin() {
		System.setProperty("webdriver.chrome.driver", "E:\\javaSelenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auth.ultimatix.net/utxLogin/login?TYPE=33554432&REALMOID=06-000e128c-664b-1c1a-9ba7-abcac0a8f081&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EdbHMX6T%2bWb8DN7DVmL5sbY%2bn%2b30S7n%2fgIBptYa9dLbudResX4AYm9ObPeNozoDH&TARGET=-SM-HTTPS%3a%2f%2fwww%2eultimatix%2enet%2futxHomeApp%2fredirectToHome%3fTARGET%3dhttps-%3A-%2F-%2Fwww%2eultimatix%2enet-%2F");
		driver.findElement(By.xpath(".//*[@id='USER']")).sendKeys("1215245");	
		driver.findElement(By.xpath(".//*[@id='USER']//following::input[2]")).sendKeys("Ssandy@5");
		//driver.findElement(By.xpath(".//*[@id='USER']//following::input[3]")).click();

	}
	

}
