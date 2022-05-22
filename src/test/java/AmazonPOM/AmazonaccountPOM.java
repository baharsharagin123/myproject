package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonaccountPOM {


	WebDriver driver ;
	public AmazonaccountPOM(WebDriver driver) {
		
		this.driver=driver;

	    PageFactory.initElements(driver, this);


	}

		
		
		
		@FindBy(xpath="//input[@id='ap_customer_name']")
		WebElement type_name;
	public WebElement name() {
			
			return type_name;
		}


	@FindBy(xpath="//input[@id='ap_email']")
	WebElement type_email;
	public WebElement email() {
		return type_email;
	}


	@FindBy(xpath="//input[@id='ap_password']")
	WebElement type_pass;
	public WebElement pass() {
		return type_pass;
	}



	@FindBy(xpath="//input[@id='ap_password_check']")
	WebElement type_repass;
	public WebElement repass() {
		return type_repass;
	}

	@FindBy(xpath="//input[@id='continue']")
	WebElement a_continue;
	public WebElement bcontinue() {
	return a_continue;
	}

	}



















}