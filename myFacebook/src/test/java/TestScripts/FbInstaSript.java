package TestScripts;

import org.testng.annotations.Test;

import PageObjects.FbInstaObjects;



import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FbInstaSript {
	WebDriver driver;
  @Test
  public void fbinsta() throws Exception{
	  //click on ista
	  FbInstaObjects fbio= new FbInstaObjects(driver);
	  fbio.clickoninsta();
	  
	  Thread.sleep(2000);
	   boolean teststatus;
	  ArrayList<String> alltabs=new ArrayList<>(driver.getWindowHandles());
	  for(int i=0; i<alltabs.size(); i++)
	  {
		driver.switchTo().window(alltabs.get(i));
		//capture title
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("facebookj"))
		{
			System.out.println("facebook page displayed");
		}
		else if(title.equalsIgnoreCase("Instagram"))
		{
			
			System.out.println("insta page is displayed");
         fbio.enterinstausername("vani");
         fbio.enterinpwd("practice");
         fbio.clickoninstalogon();
		}
		
	  }
	
  }
  @BeforeMethod
  
  public void beforeMethod() {
	//set browser path  
	  System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
	  //browser instance
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //maximize browser
	   driver.manage().window().maximize();
	   //open app
	   driver.get("http://www.facebook.com");
	  
  }
  

  @AfterMethod
  public void afterMethod()throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }
  

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
