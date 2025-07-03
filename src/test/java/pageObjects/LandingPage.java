package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@type=\"search\"]");
	By productName = By.cssSelector("h4.product-name");
	By topDeals = By.xpath("//*[text()=\"Top Deals\"]");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.xpath("//*[text()='ADD TO CART']");
	
	
	public void searchItem(String name) throws InterruptedException {
		driver.findElement(search).sendKeys(name);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
	
	public String getProductName() {

		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage() {
		driver.findElement(topDeals).click();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	public void incrementQty(int quantity) {
		int i = quantity-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
		}
		

}
