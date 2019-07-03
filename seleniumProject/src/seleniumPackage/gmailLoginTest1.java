package seleniumPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class gmailLoginTest1 {
	
	WebDriver driver;
	
	@BeforeTest public void gmailLoginTest()
		{
		
			 String exePath = "C:\\chromedriver.exe";
			 System.setProperty("webdriver.chrome.driver", exePath);
			 driver = new ChromeDriver();
			 driver.get("http://clientzone-cz-stage.orion.platform.is/login");
			 //driver.get("http://google.com");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
			 //String title= driver.getTitle();
			 //String expected="Demo Form for practicing Selenium Automation";
			 
			System.out.println("Manu11110");
			 //assertEquals(title, expected);
			 
		}
	@Test
	public void Register()
	{
		//driver.findElement(By.name("username")).sendKeys("divya.tripathi@is.co.za");
		//driver.findElement(By.className("icon-button")).click();
		//driver.findElement(By.name("password")).sendKeys("Password@2");
		//driver.findElement(By.className("icon-button")).click();
	    driver.findElement(By.name("username")).click();
	    //driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("divya.tripathi@is.co.za");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='i'])[1]/following::span[1]")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Password.8888");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Password@2");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='i'])[1]/following::span[1]")).click();
		
	    //Order Verification
		
	    //driver.findElement(By.linkText("HOME")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Service Tasks'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Service Request History'])[1]/following::div[4]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DATE (ASCENDING)'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Statues'])[1]/following::label[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DATE (DESCENDING)'])[1]/following::div[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DATE (DESCENDING)'])[1]/following::strong[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DATE (DESCENDING)'])[1]/following::div[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DATE (DESCENDING)'])[2]/following::strong[1]")).click();
	    
	   
	 
	  
	    
	  
	  
	  if(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Service Tasks'])[1]/following::span[1]")).isDisplayed())
	  {
		  System.out.println("Service Task displayed");
	  }
	    if(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Service Request History'])[1]/following::div[4]")).isDisplayed())
	    {
	    	 {
	   		  System.out.println("Orders tab displayed");
	   	  }
	    }
	    if(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[1]/following::h1[1]")).isDisplayed())
	    {
	    	 {
	   		  System.out.println("my account displayed");
	   	  }
	    }
	    if( driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Orders'])[2]/following::div[6]")).isDisplayed())
	    {
	    	 {
	   		  System.out.println("orders header displayed");
	   	  }
	    }
	    
	    if(  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Orders'])[2]/following::div[9]")).isDisplayed())
	    {
	    	 {
	   		  System.out.println("orders displayed");
	   	  }
	    }
	    if(  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Keywords'])[1]/following::input[1]")).isDisplayed())
	    {
	    	 {
	   		  System.out.println("Keywords displayed");
	   	  }
	    }
	    
	    int count= (driver.findElements(By.xpath("/html/body/app-root/app-main-layout/div/div/div/div/app-orders/div/div[2]/div/is-list/div/is-list-item"))).size();
		System.out.println("count of Orders ##############"+count);
	 
		
		WebElement wb=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/div/div/div/div/app-orders/div/div[1]/div[1]/strong"));
		System.out.println("Count of orders"+wb.getText());
		System.out.println("count of Orders ##############"+count);
		driver.close();
		/*driver.findElement(By.name("firstname")).sendKeys("Manju");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.id("sex-1")).click();	
		driver.findElement(By.id("exp-3")).click();	
		driver.findElement(By.id("datepicker")).sendKeys("2/03/2019");
		driver.findElement(By.id("profession-1")).click();;
		driver.findElement(By.id("tool-2")).click();
		Select dropdown= new Select(driver.findElement(By.id("continents")));
		WebElement DropdownValue=dropdown.getFirstSelectedOption();
		System.out.println("DropdownValue "+DropdownValue);
		dropdown.selectByVisibleText("Africa");
		
		Select dropdown1= new Select(driver.findElement(By.id("selenium_commands")));
		dropdown1.selectByVisibleText("Wait Commands");
		driver.findElement(By.id("submit")).click();
		driver.close();*/
		
	}
		
		 

}
