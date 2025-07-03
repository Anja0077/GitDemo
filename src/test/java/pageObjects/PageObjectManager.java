package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public OfferPage offersPage;
	public WebDriver driver ;
	public CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;	
	}
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;	
	}
	
	public OfferPage getOfferPage() {
		offersPage = new OfferPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}

}
