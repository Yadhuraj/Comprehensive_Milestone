package com.mindtree.reusablecompanents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DriverFunctions {

	public static void click(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	public static void sendkeys(WebDriver driver, By locator, String key) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(key);
	}
	public static void sendkeys(WebDriver driver, By locator,Keys key) {
		
		driver.findElement(locator).sendKeys(key);
	}
}
