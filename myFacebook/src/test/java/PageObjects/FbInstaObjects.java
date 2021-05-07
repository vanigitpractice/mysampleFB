package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbInstaObjects {
	public static WebDriver driver;
	//insta link
	 @FindBy(linkText = "Instagram")
	 WebElement InstaFBHomePage;
		 
	//insta username
	@FindBy(name="username")
	WebElement usernameInstaObj;
	//insta pwd
	@FindBy(name="password")
	WebElement pwdinstaobj;
	//insta login
	@FindBy(id = "loginForm")
	WebElement instaloginobj;
	 ///constructor 
	 public FbInstaObjects(WebDriver  driver)
	 {
		this.driver = driver;
		///pagefactory
		PageFactory.initElements(driver, this);
	 } 
	 public void clickoninsta()
	 {
		InstaFBHomePage.click(); 
	 }
	
	 
	 ////verify the insta username 
	
	public boolean verifyinstaUsername()
	{
		if(usernameInstaObj.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyinstaUsernameStatus()
	{
		if(usernameInstaObj.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//enter username
	public void enterinstausername(String inusername)
	{
		usernameInstaObj.sendKeys(inusername);
	}
    //enter pwd
	public void enterinpwd(String inpwd)
	{
		pwdinstaobj.sendKeys(inpwd);
	}
	//click on login
	public void clickoninstalogon()
	{
		instaloginobj.click();
	}


}
