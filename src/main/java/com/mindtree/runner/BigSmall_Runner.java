package com.mindtree.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageobject.Cart_Remove_POM;
import com.mindtree.pageobject.Cart_checkout_POM;
import com.mindtree.pageobject.Footer_POM;
import com.mindtree.pageobject.Latest_POM;
import com.mindtree.pageobject.Login_Forgot_POM;
import com.mindtree.pageobject.Login_Invalid_POM;
import com.mindtree.pageobject.Login_POM;
import com.mindtree.pageobject.Search_header;
import com.mindtree.pageobject.Shopping_Searcbar;
import com.mindtree.pageobject.Wishlist_POM;
import com.mindtree.reusablecompanents.BaseClass;
import com.mindtree.utility.ExtentUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BigSmall_Runner extends BaseClass {
	public static Logger logger;
	public static ExtentTest extentTest;
	public static ExtentReports extent;
	
	@BeforeTest
	void set()
	{
	
	extent = new ExtentReports(System.getProperty("user.dir")+"\\extentreport\\"+date+"_ExtendReport.html",false);
	}
	
	@Test (priority = 1)
	void Login() throws InterruptedException
	{	driver = DriverSetUp();
		logger = Logger.getLogger("Login");
		extentTest= extent.startTest("Login");
		new Login_POM(driver,logger,extentTest);
		extent.flush();
		driver.close();
	}

	@Test(dataProvider = "data_values",priority = 2)
	void Invalid_Login(String user , String pass) throws InterruptedException 
	{
		driver = DriverSetUp();
		logger = Logger.getLogger("Invalid_Login");	
		extentTest= extent.startTest("Invalid_Login");
//		ExtentUtility.fail(extentTest, driver, "Invalid_Login");
		new Login_Invalid_POM(driver, logger, extentTest,user,pass);
//		System.out.println("here");
		extent.flush();
		driver.close();
		Thread.sleep(2000);
	
	
	}

	
	@Test(priority = 3)
	void Forgot_Login() throws InterruptedException 
	{
		driver = DriverSetUp();
		extentTest= extent.startTest("Forgot_Password");
		logger = Logger.getLogger("Forgot_Login");	
		new Login_Forgot_POM(driver, logger, extentTest);
		System.out.println("here");
		extent.flush();
		driver.close();
		Thread.sleep(2000);
	
		
	}
	
	
	@Test(priority = 4)
	void SearchBar() throws IOException, InterruptedException
	{driver = DriverSetUp();
	extentTest= extent.startTest("SearchBar");
	logger = Logger.getLogger("SearchBar");
	new Shopping_Searcbar(driver, logger, extentTest);
	extent.flush();
	Thread.sleep(2000);
	}

	@Test(priority = 5)
	void Header() throws IOException, InterruptedException
	{
//		driver = DriverSetUp();
	extentTest= extent.startTest("Header");
	logger = Logger.getLogger("Header");
	new Search_header(driver, logger, extentTest);
	extent.flush();
	Thread.sleep(2000);
	}
	
	@Test(priority = 6)
	void Latest() throws IOException, InterruptedException
	{
//		driver = DriverSetUp();
	extentTest= extent.startTest("Latest");
	logger = Logger.getLogger("Latest");
	new Latest_POM(driver, logger, extentTest);
	extent.flush();
	Thread.sleep(2000);
	}
	
	
	
	@Test(priority = 7)
	void Wishlist() throws IOException, InterruptedException
	{
//		driver = DriverSetUp();
	extentTest= extent.startTest("Wishlist");
	logger = Logger.getLogger("Wishlist");
	new Wishlist_POM(driver, logger, extentTest);
	extent.flush();
	}
	@Test(priority = 8)
	void Cart_checkout() throws IOException, InterruptedException
	{
//		driver = DriverSetUp();
	extentTest= extent.startTest("Cart_checkout");
	logger = Logger.getLogger("Cart_checkout");
	new Cart_checkout_POM(driver, logger, extentTest);
	extent.flush();
	}
	@Test(priority = 9)
	void Cart_remove() throws IOException, InterruptedException
	{
//		driver = DriverSetUp();
	extentTest= extent.startTest("Cart_remove");
	logger = Logger.getLogger("Cart_remove");
	new Cart_Remove_POM(driver, logger, extentTest);
	extent.flush();
	}
	@Test(priority = 10)
	void Footer_ContactUS() throws IOException, InterruptedException
	{
//		driver = DriverSetUp();
	extentTest= extent.startTest("Footer_ContactUS");
	logger = Logger.getLogger("Footer_ContactUS");
	new Footer_POM(driver, logger, extentTest);
	extent.flush();
	}
	
	@DataProvider
	Object[][] data_values()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0]="sedifek613@otozuz.com";
		obj[0][1] ="book@123";
		obj[1][0]="sedifek@otozuz.com";
		obj[1][1] ="book@1";
		return obj;
	}
	
	@AfterMethod
	void meth() {
		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report

	}
	
	@AfterTest
	void end() throws InterruptedException
	{Thread.sleep(3000);
//	extent.flush();
	extent.close();
		driver.close();
	}

}
