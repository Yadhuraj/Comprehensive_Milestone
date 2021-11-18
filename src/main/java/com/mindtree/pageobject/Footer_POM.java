package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecompanents.BaseClass;
import com.mindtree.reusablecompanents.DriverFunctions;
import com.mindtree.uistore.Footer_UI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Footer_POM extends Footer_UI {
	public Footer_POM(WebDriver driver,Logger logger, ExtentTest test) throws InterruptedException {
			Thread.sleep(3000);
			DriverFunctions.click(driver, contact);
			Thread.sleep(3000);
			DriverFunctions.sendkeys(driver, name, "XYZ");
			Thread.sleep(3000);
			DriverFunctions.sendkeys(driver, email, BaseClass.rp.user());
			Thread.sleep(3000);
			DriverFunctions.sendkeys(driver, msg, "THANK YOU!!!");
			Thread.sleep(3000);
			DriverFunctions.click(driver, submit);
			Thread.sleep(5000);
			if(driver.findElement(validate2).isDisplayed())
			{
				System.out.println("if1");
				Log.testLoggerInfo(logger, "Sucessful in reteiving password");
				ExtentUtility.pass(test,driver, "Sucessful in reteiving password");
			}
			else
			if(driver.findElement(validate).isDisplayed())
			{
				Log.testLoggerInfo(logger, "Message sent As Expected");
				ExtentUtility.pass(test, driver, "Message sent As Expected");
			}
			else
			{
				Log.testLoggerInfo(logger, "Message not sent As Expected");
				ExtentUtility.pass(test, driver, "Message not sent As Expected");
			}
			Thread.sleep(3000);
			DriverFunctions.click(driver, home);
	}
}
