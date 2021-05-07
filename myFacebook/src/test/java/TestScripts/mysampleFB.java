package TestScripts;

import org.testng.annotations.Test;

import PageObjects.FbHomepageObjects;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class mysampleFB {
	public static WebDriver driver;
  @Test
  public void f() {
	  
	  FbHomepageObjects fbho=new FbHomepageObjects(driver);
	  //driver.findElement(By.name("email")).sendKeys("tester");
	  fbho.enteremail("myemail");
	  fbho.enterpwd("mytest");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
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
  

  @AfterTest
  public void terminatebrowser() throws Exception{
	  Thread.sleep(3000);
	  driver.quit();
  }


}
