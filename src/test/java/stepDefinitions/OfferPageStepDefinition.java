package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	 TestContextSetup testContextSetup;
	 PageObjectManager pageObjectManager;

	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		System.out.println("On Offers page1");
		}
	
	
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String ShortName) {
		
		switchToOffersPage();
		
		OfferPage op = testContextSetup.pageObjectManager.getOfferPage();
		op.searchItem(ShortName);
		testContextSetup.offerPageProductName = op.getProductName();
		System.out.println(testContextSetup.offerPageProductName+" is extracted from the offers page");
	}
	
	public void switchToOffersPage() {
		//for other scenarios if switched to offer page already then skiup below part
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
		LandingPage lp = testContextSetup.pageObjectManager.getLandingPage();
		lp.selectTopDealsPage();
		testContextSetup.genericUtils.switchWindowToChild();
	}
	
	@Then("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(testContextSetup.offerPageProductName,testContextSetup.productName );
	

}}
