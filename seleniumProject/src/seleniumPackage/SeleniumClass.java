package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass {
	public static void main(String[] args) {
  
	SeleniumClass obj= new SeleniumClass();
	obj.verifyLogin();
		
	
	
	}
@Test (dataProvider="manju")
public void verifyLogin()
{
	System.out.println("Manju");
	WebDriver driver;
	//driver=new firefoxdriver();
	
	String path = System.getProperty("user.dir");
	System.out.println(path); 
	//System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
	
	System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriver.exe");
	//C:\Users\manju.sharma\Desktop\Workspace\seleniumProject\driver
	 
	// Initialize browser
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// Open facebook
	driver.get("http://www.facebook.com");
	 
	// Maximize browser
	 
	driver.manage().window().maximize();
	driver.quit();
	}
}
