package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindtree.exception.PageObjectRException;
import com.mindtree.reusablecompanents.BaseClass;
import com.mindtree.reusablecompanents.DriverFunctions;
import com.mindtree.uistore.Shopping_Searchbar;
import com.mindtree.utility.ExcelSheet;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class Shopping_Searcbar extends Shopping_Searchbar {

	public Shopping_Searcbar(WebDriver driver, Logger logger, ExtentTest test)
			throws InterruptedException, IOException {
//		new Login_POM(driver, logger, test);
		for (int i = 0; i < BaseClass.sheet.getPhysicalNumberOfRows(); i++) 
		{
			Row r = BaseClass.sheet.getRow(i);

			try {
				DriverFunctions.sendkeys(driver, seachbar, ExcelSheet.Excelread(i, 0));
				DriverFunctions.sendkeys(driver, seachbar, Keys.ENTER);
				Thread.sleep(3000);
				DriverFunctions.click(driver, item);
				Thread.sleep(3000);
				
				for (int j = 1; j < r.getCell(1).getNumericCellValue(); j++) {
					DriverFunctions.click(driver, qty_add);
					Thread.sleep(3000);
				}
				DriverFunctions.click(driver, add_cart);
				Thread.sleep(9000);
				if (driver.findElements(cart_close).size()>0) 
				{
					DriverFunctions.click(driver,cart_close);
					Log.testLoggerInfo(logger, "Added successfully");
					ExtentUtility.pass(test, driver, "Added successfully");
				} else {
					DriverFunctions.click(driver, home);
					throw new PageObjectRException("Adding to cart interrupted");
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
				DriverFunctions.click(driver, home);
				Thread.sleep(2000);
		}

	}
}
