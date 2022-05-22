package AmazonStepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonPOM.AmazonBestSellerPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonbestseller {


WebDriver driver;




	@Given("user visit Amazon homepage")
	public void user_visit_amazon_homepage() throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(2000);
	}

	@When("user click on best seller")
	public void user_click_on_best_seller() {
	    
		AmazonBestSellerPOM obj=new AmazonBestSellerPOM (driver);
		obj.bestseller().click();
		
	
	
	
	}

	@Then("user will be able to land on best seller page")
	public void user_will_be_able_to_land_on_best_seller_page() {
	    
	}
















}
