package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class FbHomepageObjects {
	public static WebDriver driver;
	
	@FindBy(name="email")
	public WebElement loginemail;
	
	@FindBy(name="pass")
	WebElement loginpwd;
	@FindBy(name="login")
	WebElement clickonlogin;
	@FindBy(linkText="Create New Account")
	WebElement clickoncreateacc;
	@FindBy(name="firstname")
	WebElement myname;
	@FindBy(name="lastname")
	WebElement mylastname;
	@FindBy(name="reg_email__")
	WebElement regemail;
	@FindBy(name="reg_email_confirmation__")
	WebElement Reenteremail;
	@FindBy(name="reg_passwd__")
	WebElement regpwd;
	@FindBy(name="birthday_month")
	WebElement regmonth;
	@FindBy(name="birthday_day")
	WebElement regday;
	@FindBy(name="birthday_year")
	WebElement regyear;
	@FindBy(xpath = "//input[@value='1']")
	WebElement femalebutton;
	
	//constructer
	public FbHomepageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean verifyemail() {
		if(loginemail.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enteremail(String myemail) {
		
		loginemail.sendKeys(myemail);
		}
	public void enterpwd(String mypwd) {
		loginpwd.sendKeys(mypwd);
	}
	public void clickloginbutton() {
		clickonlogin.click();
	}
	public void clickonreglink() {
		clickoncreateacc.click();
	}
	public boolean verifyfirstname() {
		if(myname.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enterfirstname(String fname) {
		myname.sendKeys(fname);
	}
	public void enterlastname(String lname) {
		mylastname.sendKeys(lname);
	}
	public void enterregemail(String remail) {
		regemail.sendKeys(remail);
	}
	public void enterreemail(String reemail) {
    	Reenteremail.sendKeys(reemail);
    }
    
	public void enterregpwd(String rpwd) {
		regpwd.sendKeys(rpwd);
	}
    public void selectmonthbyvitext(String month) {
		Select monthselect=new Select(regmonth);
		monthselect.selectByVisibleText(month);
	}
    public void selectmonthbyvalue(String month) {
		Select monthselect=new Select(regmonth);
		monthselect.selectByVisibleText(month);
	}
    public void selectdaybyvalue(String day) {
		Select dayselect=new Select(regday);
		dayselect.selectByValue(day);
	}
    public void selectyearbyvalue(String year) {
		Select yearselect=new Select(regyear);
		yearselect.selectByValue(year);
	}
    public void clickfemaleradiobutton() {
		femalebutton.click();
	}
}

