package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	
//	WebDriver driver;
//	String productName;
//	String offerPageProductName;
	
	 TestContextSetup testContextSetup;
	 LandingPage lp;

		public LandingPageStepDefinition(TestContextSetup testContextSetup) {
			System.out.println("On landing Page1");
			this.testContextSetup=testContextSetup;
			this.lp = testContextSetup.pageObjectManager.getLandingPage();
			}
		
	@Given("user is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(lp.getTitleLandingPage().contains("GreenKart"));
		
	}
	
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String ShortName) throws InterruptedException {
		lp.searchItem(ShortName);
		testContextSetup.productName = lp.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.productName+" is extracted from home page");
		}
	
	@When("added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
		lp.incrementQty(Integer.parseInt(quantity));
		lp.addToCart();
	}


}
