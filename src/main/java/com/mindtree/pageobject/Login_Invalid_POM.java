package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exception.PageObjectRException;
import com.mindtree.reusablecompanents.BaseClass;
import com.mindtree.reusablecompanents.DriverFunctions;
import com.mindtree.uistore.Login_Invaid_UI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Login_Invalid_POM extends Login_Invaid_UI{
	public Login_Invalid_POM(WebDriver driver, Logger logger, ExtentTest test,String user,String pass) throws InterruptedException {
		try {
			Thread.sleep(3000);
			DriverFunctions.click(driver, sign_in);
			Thread.sleep(3000);
			DriverFunctions.sendkeys(driver, email, user);
			DriverFunctions.sendkeys(driver, password, pass);
			Thread.sleep(3000);
			DriverFunctions.click(driver, submit);
			Thread.sleep(3000);
			if(driver.findElements(validate2).size()>0)
			{
//				System.out.println("if1");
				Log.testLoggerInfo(logger, "invalid login intercepted-successful");
				ExtentUtility.pass(test,driver, "invalid login intercepted-successful");
			}
			else
			if (driver.findElements(validate).size()>0) {
				Log.testLoggerInfo(logger, "invalid login intercepted-successful");
				ExtentUtility.pass(test, driver, "invalid login intercepted-successful");
			} else {
				DriverFunctions.click(driver, home);
				throw new PageObjectRException("invalid login not intercepted-unsuccessful");
			}
		} catch (PageObjectRException e) {
			Log.testLoggerError(logger, e.toString());
			ExtentUtility.fail(test, driver, e.toString());
		}
		Thread.sleep(3000);
//		
	}
}
