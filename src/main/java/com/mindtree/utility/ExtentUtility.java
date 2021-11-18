package com.mindtree.utility;

import java.io.IOException;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import com.mindtree.runner.BigSmall_Runner;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentUtility {

	public static void fail(ExtentTest extentTest, WebDriver driver, String name) {
		String s = null;
		try {
			s = TakeScreenshots.screenshot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.log(LogStatus.FAIL, name);
		extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(s));

	}

	public static void pass(ExtentTest extentTest,WebDriver driver, String name) {
		String s = null;
		try {
			s = TakeScreenshots.screenshot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.log(LogStatus.PASS, name);
		extentTest.log(LogStatus.PASS,  extentTest.addScreenCapture(s));

	}
}
