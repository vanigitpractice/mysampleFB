package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageObjects.FbHomepageObjects;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FbTotalScript {
	public static WebDriver driver;
	
  @Test
  public void fblogin() {
	  System.out.println("start");
	  FbHomepageObjects fbho=new FbHomepageObjects(driver);
	  
	  //verify email
	  boolean emailstatus=fbho.verifyemail();
	  if(emailstatus)
	  {
		  System.out.println("email is displayed");
	  }
	  else
	  {
		  System.out.println("email is not displayed");
	  }
	  fbho.enteremail("testing");
	  fbho.enterpwd("practice");
	  fbho.clickloginbutton();
      
      
  }
  @Test
  public void  fbmyReg()
  {
 FbHomepageObjects fbho=new FbHomepageObjects(driver);
	  
	  
       fbho.clickonreglink();
      //verify first name
      boolean fnamestatus=fbho.verifyfirstname();
      if(fnamestatus)
      {
    	  System.out.println("first name is displayed");
      }
      else
      {
    	  System.out.println("first name is not displayed");
      }
      fbho.enterfirstname("Sanjana");
      fbho.enterlastname("k");
      fbho.enterregemail("Ishitha11@gmail.com");
      fbho.enterreemail("Ishitha11");
      fbho.enterregpwd("behara");
      fbho.selectmonthbyvitext("Jun");
      fbho.selectdaybyvalue("9");
      fbho.selectyearbyvalue("1989");
      fbho.clickfemaleradiobutton();
  
  }
	  
  
  @BeforeMethod
  public void launchBowser() {
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
  public void terminatebrowser() throws Exception{
	  Thread.sleep(3000);
	  driver.quit();
  }

  @BeforeTest
  public void mytest()
  {
  }
  

  @AfterTest
  public void mytestend()
  {
  }

}
