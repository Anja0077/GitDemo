package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;// this driver only sending to everyone
	//public String landingPageProductName;
	public String offerPageProductName;
	public String productName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;// all these objects which have created in this class we can access by dependency injection the contructor of that perticular class
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}

}
