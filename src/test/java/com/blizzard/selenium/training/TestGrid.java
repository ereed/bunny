package com.blizzard.selenium.training;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.blizzard.selenium.training.BusinessObjects.Shop;

import java.net.URL;

import junit.framework.Assert;

/**
 *
 */
public class TestGrid {

    String selhub = "http://localhost:4444/wd/hub";
    String targetServer = "http://us.battle.net/shop";
    RemoteWebDriver driver;

    @Test // Test FireFox
    public void testFox() throws Exception {
        DesiredCapabilities browser = DesiredCapabilities.firefox();
        runTests(browser);
    }

    @Test // Test Chrome
    public void testChrome() throws Exception {
        DesiredCapabilities browser = DesiredCapabilities.chrome();
        runTests(browser);
    }

    @Test // Test Internet Explorer
    public void testIE() throws Exception {
        DesiredCapabilities browser = DesiredCapabilities.internetExplorer();
        runTests(browser);
    }

    public void runTests (DesiredCapabilities browser) throws Exception{
        RemoteWebDriver driver = new RemoteWebDriver(new URL(selhub), browser);
        Shop shop = new Shop(driver);
        Assert.assertTrue(shop.verifyStandardPrice());
        Thread.sleep(2000);
        driver.quit();

    }
}
