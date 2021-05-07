package ExcelUDFS;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class excelscript {
	public static WebDriver driver;
	String filename="C:\\Users\\sures\\OneDrive\\Documents\\Testing\\TestData.xls";
	String sheetname="Sheet3";
	String sheetname1="myData";
  
  @Test
  public void f() throws IOException {
	//identify login email
	  WebElement mylogemail=driver.findElement(By.name("email"));
	  String myemail= readfromExcel.fnReadFromExcel(filename,sheetname, 1, 0);
	  //data enter
	  mylogemail.sendKeys(myemail);
	  //identify login pwd
	  WebElement mylogpwd=driver.findElement(By.name("pass"));
	  //String mypwd=readfromExcel.fnReadFromExcel(filename, sheetname, 1, 1);
	 // mylogpwd.sendKeys(mypwd);
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
  public void afterMethod() throws Exception{
	  Thread.sleep(2000);
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
