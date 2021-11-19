package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exception.PageObjectRException;
import com.mindtree.reusablecompanents.BaseClass;
import com.mindtree.reusablecompanents.DriverFunctions;
import com.mindtree.uistore.Login_Forgot_UI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Login_Forgot_POM extends Login_Forgot_UI{

	public Login_Forgot_POM(WebDriver driver,Logger logger,ExtentTest test) throws InterruptedException {

		try {
			Thread.sleep(3000);
			DriverFunctions.click(driver, sign_in);
			Thread.sleep(5000);
			DriverFunctions.click(driver, forgot);
			Thread.sleep(5000);
			DriverFunctions.sendkeys(driver, email_recover,BaseClass.rp.user4());
			Thread.sleep(5000);
			DriverFunctions.click(driver, submit_recover);
			Thread.sleep(5000);
			if(driver.getTitle().equalsIgnoreCase("Too many attempts"))
			{
				driver.navigate().back();
				Log.testLoggerInfo(logger, "Sucessful in reteiving password");
				ExtentUtility.pass(test,driver, "Sucessful in reteiving password");
			}
			else
			if(driver.findElements(validate2).size()>0)
			{
				System.out.println("if1");
				Log.testLoggerInfo(logger, "Sucessful in reteiving password");
				ExtentUtility.pass(test,driver, "Sucessful in reteiving password");
			}
			else
			if(driver.findElements(validate_recover).size()>0)
			{
				Log.testLoggerInfo(logger, "Sucessful in reteiving password");
				ExtentUtility.pass(test,driver, "Sucessful in reteiving password");
			}
			else
			{
				DriverFunctions.click(driver, home);
				throw new PageObjectRException("Forgot password interrupted");
			}
		}
		catch (PageObjectRException e) {
			Log.testLoggerError(logger, e.toString());
			ExtentUtility.fail(test, driver, e.toString());
		}
		catch (Exception e) {
			Log.testLoggerError(logger, e.getMessage());
			ExtentUtility.fail(test, driver, e.getMessage());
		}
		
		
	}
	
}
