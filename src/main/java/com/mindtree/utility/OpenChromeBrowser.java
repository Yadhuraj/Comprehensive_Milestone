package com.mindtree.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeBrowser  {
	
	

	public static WebDriver OpenChrome(WebDriver driver,ReadProrperty rp) {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + rp.readDriver());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(rp.readUrl());
		return driver;
	}
}
