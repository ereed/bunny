package com.blizzard.selenium.training;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.blizzard.selenium.training.BusinessObjects.Shop;

/**
 * 
 */
public class TestOne {
	WebDriver driver = new FirefoxDriver();
	Shop shop = new Shop(driver);

	@Test
	public void testStuff() {
		Assert.assertTrue(shop.verifyStandardPrice());
		driver.quit();
		
		
		}
	@Test public void testStuff2() {
		Assert.assertFalse(shop.verifyStandardPrice());
		driver.quit();
	}
}
