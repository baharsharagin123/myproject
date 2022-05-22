package AmazonStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import AmazonPOM.DellsigninPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dellsignin {

WebDriver driver;

@Given("user visit Dell homepage")
	public void user_visit_dell_homepage() throws InterruptedException {
	    
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	Thread.sleep(2000);


}

	@When("user click on sign in and type valid {string} and {string} and click on sign in")
	public void user_click_on_sign_in_and_type_valid_and_and_click_on_sign_in(String string, String string2) throws InterruptedException {
	    
	
		 DellsigninPOM obj3=new  DellsigninPOM(driver);
		
		 
		 Actions mouseover=new Actions(driver);
		 
		 obj3.mousesign();
		 mouseover.moveToElement(obj3.signin()).build().perform();
		 
		 obj3.signin().click();
		 obj3.email().sendKeys(string);
		 Thread.sleep(2000);
		 obj3.pass().sendKeys(string2);
		 obj3.ssignin().click();
		 
	
	
	
	}
	
	
	@Then("user will be sign in successfully")
	public void user_will_be_sign_in_successfully() {
	   
	}
}
