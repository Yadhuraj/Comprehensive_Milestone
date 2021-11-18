package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecompanents.BaseClass;

public class TakeScreenshots extends BaseClass{
	public static  String screenshot(WebDriver driver,String name) throws IOException {
		String date = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "//FailedSCreenshots//" + date + "_" + name + ".png";
//		System.out.println(destination);
		File fileDestination = new File(destination);
		FileUtils.copyFile(src, fileDestination);
		return destination;
	}
}
