package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsigninPOM {
WebDriver driver;


public DellsigninPOM (WebDriver driver) {
	
	
	this.driver=driver;

    PageFactory.initElements(driver, this);

	


}
@FindBy(xpath="//span[@id='um-si-label']")
WebElement mouseoversignin;
public WebElement mousesign() {
	return  mouseoversignin;
}

@FindBy(xpath="//a[text()=' Sign In ']")
WebElement click_signinhome;
public WebElement signin() {
	
	return click_signinhome;
}

@FindBy(xpath="//input[@id='SignInModel_EmailAddress']")
WebElement click_email;
public WebElement email() {
	
	return click_email;
}


@FindBy(xpath="//input[@id='userPwd_UserInputSecret']")
WebElement click_pass;
public WebElement pass() {
	return click_pass;
}



@FindBy(xpath="//input[@id='btnSignIn']")
WebElement click_signin;
public WebElement ssignin() {
	return click_signin;
}








}
