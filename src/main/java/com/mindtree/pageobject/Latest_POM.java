package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.exception.PageObjectRException;
import com.mindtree.reusablecompanents.DriverFunctions;
import com.mindtree.uistore.Latest_UI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Latest_POM extends Latest_UI{
	public Latest_POM(WebDriver driver,Logger logger, ExtentTest test) {
		
		try {
			Thread.sleep(3000);
			DriverFunctions.click(driver, New);
			Thread.sleep(3000);
			DriverFunctions.click(driver, product);
			Thread.sleep(3000);
			DriverFunctions.click(driver, add_cart);
			Thread.sleep(9000);
			
			if (driver.findElement(cart_close).isDisplayed()) 
			{
				DriverFunctions.click(driver,cart_close);
				Log.testLoggerInfo(logger, "Added successfully");
				ExtentUtility.pass(test, driver, "Added successfully");
			}
			else {
				DriverFunctions.click(driver, home);
				throw new PageObjectRException("Adding to cart interrupted");
				}
//			DriverFunctions.click(driver, cart_close);
			Thread.sleep(5000);
			
		}
		catch( PageObjectRException e)
		{
			Log.testLoggerError(logger, e.toString());
			ExtentUtility.fail(test, driver, e.toString());
		}
		catch (Exception e) {
			Log.testLoggerError(logger, e.getMessage());
			ExtentUtility.fail(test, driver, e.getMessage());
		}
		DriverFunctions.click(driver, home);
		
	}

}
