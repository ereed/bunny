package com.blizzard.selenium.training;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Devin Webster on 5/29/2014.
 */
public class TestGrid {

    String selhub = "http://localhost:4444/wd/hub";
    String targetServer = "http://us.battle.net/shop";

    @Test // Test FireFox
    public void testFox() throws Exception {
        DesiredCapabilities browser = DesiredCapabilities.firefox();
        openAndClose(browser);
    }

    @Test // Test Chrome
    public void testChrome() throws Exception {
        DesiredCapabilities browser = DesiredCapabilities.chrome();
        openAndClose(browser);
    }

    @Test // Test Internet Explorer
    public void testIE() throws Exception {
        DesiredCapabilities browser = DesiredCapabilities.internetExplorer();
        openAndClose(browser);
    }

    public void openAndClose (DesiredCapabilities browser) throws Exception{
        RemoteWebDriver driver = new RemoteWebDriver(new URL(selhub), browser);
        driver.get(targetServer + "/en/product/game/diablo");
        Thread.sleep(2000);
        driver.quit();
    }
}
