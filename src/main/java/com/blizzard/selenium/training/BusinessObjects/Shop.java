package com.blizzard.selenium.training.BusinessObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.blizzard.selenium.training.PageObjects.BrowsePage;
import com.blizzard.selenium.training.PageObjects.HomePage;
import com.blizzard.selenium.training.PageObjects.ProductDetailsPage;

/**
 * 
 * Summary: Business objects is a java classes where methods / functions are
 * stored. These objects will then be later called by the main test object to be
 * executed. Business objects will be calling upon the page objects for
 * retrieving the data.
 * 
 * Note: Make sure each method/function created does exactly what it is named.
 * When your method/function begins to go on a tangent, it is best to create a
 * new method/function for that operation.
 */
public class Shop {
	// Such examples of methods/functions to be used below in this class.
	private final HomePage homePage;
	private final BrowsePage browsePage;
	private final ProductDetailsPage productDetailsPage;
	private final WebDriver driver;

	public Shop(final WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage();
		browsePage = new BrowsePage();
		productDetailsPage = new ProductDetailsPage();
		PageFactory.initElements(driver, homePage);
		PageFactory.initElements(driver, browsePage);
		PageFactory.initElements(driver, productDetailsPage);

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	public boolean verifyStandardPrice() {

		// Navigate to shop home page.
		String home = "http://us.battle.net/shop";
		driver.get(home);

		// locate the World of Warcraft products link and click it.
		homePage.getLinkWarcraft().click();

		// Click the very first product on the page.
		// "World of Warcraft: Warlords of Draenor".
		browsePage.getLinkDraenor().click();

		// Locate the standard edition price and verify it displays 49.99.
		String price = productDetailsPage.getStandardPrice().getText();
		if (price.contains("USD 49.99")) {
			return true;
		} else {
			return false;
		}

	}

	// Method navigates to shop homepage.

	// Method navigates to shop homepage and clicks on WoW product family using
	// page objects.

	// Method retrieves product card name and price from page objects.

	// Method navigates to shop homepage, clicks on SC2 product family, then
	// clicks Shop Home icon.
}
