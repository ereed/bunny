package com.blizzard.selenium.training;

import com.blizzard.selenium.training.PageObjects.BrowsePage;
import com.blizzard.selenium.training.PageObjects.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DWebster on 5/29/2014.
 */
public class TestOne {

    private WebDriver driver;
    private BrowsePage browsePage;
    private HomePage homePage;

    public TestOne(final WebDriver driver) {
        this.driver = new FirefoxDriver();
        PageFactory.initElements(driver, browsePage);
        PageFactory.initElements(driver, homePage);
    }

    @Test
    public void testStuff(){
        // perform some sort of test
        // Use Assert.assertTrue(Expression) to verify something.
    }
}
