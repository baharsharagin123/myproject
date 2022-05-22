package AmazonStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonPOM.AmazonaccountPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonaccountStepDef {

WebDriver driver;
@Given("user visit amazon  sign in homepage")
public void user_visit_amazon_sign_in_homepage() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
Thread.sleep(2000);
}

@When("user type {string} and valid {string} and  type valid {string} and retype  {string} and click continue")
public void user_type_and_valid_and_type_valid_and_retype_and_click_continue(String string, String string2, String string3, String string4) throws InterruptedException {
   


	AmazonaccountPOM obj1=new AmazonaccountPOM(driver);
	obj1.name().sendKeys(string);
	obj1.email().sendKeys(string2);
	Thread.sleep(2000);
   

	
	
	
	
	
	
	
obj1.pass().sendKeys(string3);
obj1.repass().sendKeys(string4);
obj1.bcontinue().click();
	
}

@Then("user will be able to signin sucessfully")
public void user_will_be_able_to_signin_sucessfully() {
    




}


}
