package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By cartBag = By.cssSelector("[alt=\"Cart\"]");
	By checkOutBtn = By.xpath("//*[text()='PROCEED TO CHECKOUT']");
	By promoBtn = By.className("promoBtn");
	By placeOrderBtn = By.xpath("//*[text()='Place Order']");
	
	public void checkoutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutBtn).click();
	}
	public boolean  verifyPromoBtn() {
	 return driver.findElement(promoBtn).isDisplayed();
		
	}
	public boolean  verifyPlaceOrder() {
		 return driver.findElement(placeOrderBtn).isDisplayed();
			
		}

}
