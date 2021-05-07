package Yahooscript;

import org.testng.annotations.Test;

import YahooPageObjects.YahoohomepageObjects;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class yahooreg {
	public static WebDriver driver;
	  

  @Test
 public void yahooregscript() {
	  System.out.println("its start");
	  YahoohomepageObjects yhpo=new YahoohomepageObjects(driver);
	  yhpo.clickoncreateacclink();
	  //first name displayed or not
	  boolean myfirstname=yhpo.verifyyahoofname();
	  if(myfirstname)
	  {
	  	System.out.println("first name is displayed");
	  }
	  else
	  {
	  	System.out.println("first name is not diplayed");
	  }
	  //first name enabled or not
	  boolean mylastname=yhpo.verifystatusfname();

	  if(mylastname)
	  {
	  	System.out.println("first name is enabled");
	  }
	  else
	  {
	  	System.out.println("first name is not enabled");
	  }
	  //enter data
	  yhpo.enteryahoofname("Nithika");
	  //enter last name
	  yhpo.enteryahoolname("B");

	  //enter email
	  yhpo.enteryahooemail("mypractice123");
	  Actions myAct  = new Actions(driver);
	  WebElement emailselect=driver.findElement(By.xpath("//*[@id=\"desktop-suggestion-list\"]/li[1]"));
	  myAct.moveToElement(emailselect).perform();

	  //enter pwd
	  yhpo.enteryahoopwd("testing");
	  //select country
	  yhpo.yahoocountryselect("US");
	  //enter mobile no
	  yhpo.entermobileno("7576743562");
	  //select month
	  yhpo.yahoomonthselectbytext("June");
	  //enter day
	  yhpo.enteryahooday("28");
	  //enter year
	  yhpo.enteryahooyear("1989");
	  //enter gender
	  yhpo.entergenderfemale("female");

       }

     @BeforeMethod
	  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
	  	
	  	//browser instance
	  	driver=new ChromeDriver();
	  	//maximize browser
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	//open app
	  	driver.navigate().to("http://login.yahoo.com");
	  	
	  }

	  @AfterMethod
	  public void terminatebrowser()throws Exception {
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



