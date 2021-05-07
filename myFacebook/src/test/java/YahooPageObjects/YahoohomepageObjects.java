package YahooPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class YahoohomepageObjects {
	//webdriver
		public static WebDriver driver;
		//find create acc objects
		@FindBy(linkText = "Create an account")
		WebElement yahoocreateacc;
		@FindBy(name="firstName")
		WebElement yahoofname;
		@FindBy(name="lastName")
		WebElement yahoolname;
		@FindBy(name="yid")
		WebElement yahooemail;
		@FindBy(name="password")
		WebElement yahoopwd;
		@FindBy(name = "shortCountryCode")
		WebElement yahoocountryselect;
		@FindBy(id = "usernamereg-phone")
		WebElement yahoomobileno;
		@FindBy(id="usernamereg-month")
		WebElement yahoomonth;
		@FindBy(id = "usernamereg-day")
		WebElement yahooday;
		@FindBy(id = "usernamereg-year")
		WebElement yahooyear;
		@FindBy(id="usernamereg-freeformGender")
		WebElement yahoogender;
		//constructer
		public YahoohomepageObjects(WebDriver driver)
		{
			this.driver=driver;
			//pagefactory
			PageFactory.initElements(driver, this);
		}
		//click on create acc
		public void clickoncreateacclink()
		{
			yahoocreateacc.click();
		}
		//verify first name
		public boolean verifyyahoofname()
		{
			if(yahoofname.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		//verify first name status
		public boolean verifystatusfname()
		{
			if(yahoofname.isEnabled())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		//enter data
		public void enteryahoofname(String firstname)
		{
			yahoofname.sendKeys(firstname);
		}
		//enter data in last name
		public void enteryahoolname(String lname)
		{
			yahoolname.sendKeys(lname);
		}
		//enter data in email
		public void enteryahooemail(String email)
		{
			yahooemail.sendKeys(email);
		}
		public void enteryahoopwd(String pwd)
		{
			yahoopwd.sendKeys(pwd);
		}
		//select country
		public void yahoocountryselect(String country)
		{
			//convert to select category
			Select countryselect= new Select(yahoocountryselect);
			countryselect.selectByValue(country);
		}
		//enter mobile number
		public void entermobileno(String mobileno)
		{
			yahoomobileno.sendKeys(mobileno);
		}
		//select month
		public void yahoomonthselectbytext(String month)
		{
			//convert to select category
			Select monthselect= new Select(yahoomonth);
			monthselect.selectByVisibleText(month);
		}
		//enter day
		public void enteryahooday(String day)
		{
			yahooday.sendKeys(day);
		}
		//enter year
		public void enteryahooyear(String year)
		{
			yahooyear.sendKeys(year);
		}
		//enter gender
		public void entergenderfemale(String female)
		{
			yahoogender.sendKeys(female);
		}

	}



