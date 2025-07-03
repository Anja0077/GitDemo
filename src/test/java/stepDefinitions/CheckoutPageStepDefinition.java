package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	
public WebDriver driver;
public CheckoutPage checkoutPage;
TestContextSetup testContextSetup;
public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
	this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
}

@Then("^user proceeds to checkout and validate the (.+) items checkout page$")
public void user_proceeds_to_checkout_and_validate_the(String name) throws InterruptedException {
	checkoutPage.checkoutItems();	
}

@Then("verify user has ability to enter promocode and place the order")
public void verify_user_has_ability_to_enter_promocode_and_place_the_order() {
	Assert.assertTrue(checkoutPage.verifyPromoBtn());
	Assert.assertTrue(checkoutPage.verifyPlaceOrder());

}



}
