package com.mindtree.uistore;

import org.openqa.selenium.By;

public class Shopping_Searchbar {
//	public static By sign_in = By.xpath("//div[@class='site-nav__icons']//a[contains(@href ,'login')]");
//	public static By email = By.cssSelector("[id = 'CustomerEmail']") ;
//	public static By password = By.cssSelector("[id = 'CustomerPassword']") ;
//	public static By submit = By.cssSelector("[value = 'Sign In']") ;
//	public static By validate = By.cssSelector("div[class='errors']") ;
	public static By home = By.cssSelector("[class='h1 site-header__logo']");
	public static By seachbar = By.xpath("//form[@class='search-bar']//input[@type='search']");
	public static By item = By.xpath("(//ul[@class='snize-search-results-content clearfix']//a)[1]");
	public static By qty_add = By.xpath("//span[contains(text(),'+')]");
	public static By add_cart = By.xpath("//button[@name='add']");
	public static By cart_close = By.xpath("//div[@class='drawer__close text-right']//button");


}
