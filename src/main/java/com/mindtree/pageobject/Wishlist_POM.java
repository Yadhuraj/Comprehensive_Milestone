package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecompanents.DriverFunctions;
import com.mindtree.uistore.Latest_UI;
import com.mindtree.uistore.Wishlist_UI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Wishlist_POM extends Wishlist_UI{
	public Wishlist_POM(WebDriver driver,Logger logger, ExtentTest test) throws InterruptedException {
		
		DriverFunctions.click(driver, wishlist);
		Thread.sleep(5000);
		if(driver.findElement(button).isDisplayed())
		{	DriverFunctions.click(driver, button);
		
			Log.testLoggerInfo(logger, "Navigated as expected");
			ExtentUtility.pass(test, driver, "Navigated as expected");
		}
		else
		{
			Log.testLoggerError(logger, "Did not navigate as expected");
			ExtentUtility.fail(test, driver, "Did not navigate as expected");
		}
		Thread.sleep(5000);
		DriverFunctions.click(driver, home);
		
		
	}
}
