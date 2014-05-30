package com.blizzard.selenium.training.SandBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.blizzard.selenium.training.BusinessObjects.Shop;
import com.blizzard.selenium.training.PageObjects.BrowsePage;
import com.blizzard.selenium.training.PageObjects.HomePage;
import com.blizzard.selenium.training.PageObjects.ProductDetailsPage;

/**
 * http://docs.seleniumhq.org/docs/03_webdriver.jsp
 * http://docs.seleniumhq.org/docs/04_webdriver_advanced.jsp
 * http://docs.seleniumhq.org/docs/06_test_design_considerations.jsp
 * http://docs.seleniumhq.org/docs/07_selenium_grid.jsp
 * https://groups.google.com/forum/#!forum/selenium-users
 */
public class SandBoxTest {


	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		final Shop shop = new Shop(driver);
		
		if(shop.verifyStandardPrice() == true) {
			System.out.println("pass");
			driver.quit();
		}
		else
		{
			System.out.println("fail");
			driver.quit();
		}
		
	}

	}  
