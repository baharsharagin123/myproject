package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TmobilePOM {

WebDriver driver;

public TmobilePOM(WebDriver driver) {
	
	this.driver=driver;

    PageFactory.initElements(driver, this);

	
}


@FindBy(xpath="//span[text()='My account']")
WebElement click_myaccount;
public WebElement account() {
	return click_myaccount;
}

@FindBy(xpath="//a[text()='Log in']")
WebElement click_login;
public WebElement login() {
	return click_login;
}



@FindBy(xpath="//button[text()='Accept']")
WebElement click_accept;
public WebElement accept() {
	return click_accept;
}
@FindBy (xpath="//input[@id='usernameTextBox']")
WebElement type_email;
public WebElement email() {
	return  type_email;
	
}

@FindBy(xpath="//*[@id=\"lp1-next-btn\"]/span")
WebElement click_next;
public WebElement next() {
	return click_next;
}




@FindBy(xpath="//input[@id='passwordTextBox']")
WebElement type_pass;
public WebElement pass() {
	return type_pass;
}

@FindBy(xpath="//*[@id=\"lp2-login-btn\"]/span")
WebElement click_loginn;
public WebElement loginn() {
	return click_loginn;
}




}
