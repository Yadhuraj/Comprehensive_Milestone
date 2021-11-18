package com.mindtree.reusablecompanents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mindtree.utility.OpenChromeBrowser;
import com.mindtree.utility.ReadProrperty;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	public static WebDriver driver;
	public static ReadProrperty rp;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream fis;
	public static String date = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss").format(new Date());
	static {

		System.setProperty("currenttime", date);

	}

	public WebDriver DriverSetUp() {
		rp = new ReadProrperty();
		switch (rp.browser()) {
		case "chrome": {
			driver = OpenChromeBrowser.OpenChrome(driver, rp);
			break;
		}
		default: {
			System.out.println("Invalid browser");
			break;
		}
		}

		try {
			fis = new FileInputStream(System.getProperty("user.dir") + rp.Excel());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(System.getProperty("user.dir") + rp.Excel());
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workbook.getSheetAt(0);
		return driver;

	}
}
