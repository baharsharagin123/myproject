package AmazonStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonPOM.TmobilePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TmobileStepDef {

WebDriver driver;

@Given("user visit Tmobile url")
	public void user_visit_tmobile_url() throws InterruptedException {
	    
	
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.t-mobile.com/");
	Thread.sleep(2000);







}

	@When("user click on my account and click on log in and type valid {string} and click next and type valid {string} and click log in")
	public void user_click_on_my_account_and_click_on_log_in_and_type_valid_and_click_next_and_type_valid_and_click_log_in(String string, String string2) throws InterruptedException {
	    
	
		TmobilePOM obj2=new TmobilePOM(driver);
		obj2.accept().click();
		obj2.account().click();
		obj2.login().click();
		Thread.sleep(2000);
		obj2.email().sendKeys(string);
		obj2.next().click();
		Thread.sleep(2000);
		
		obj2.pass().sendKeys(string2);
		Thread.sleep(2000);
		obj2.loginn().click();
		
	
	
	
	
	
	}

	@Then("user will be able to login successfully")
	public void user_will_be_able_to_login_successfully() {
	    
	}
}
