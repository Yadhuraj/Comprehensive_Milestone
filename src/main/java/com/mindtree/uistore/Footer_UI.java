package com.mindtree.uistore;

import org.openqa.selenium.By;

public class Footer_UI {
	
	public static By home = By.cssSelector("[class='h1 site-header__logo']");
	public static By contact = By.xpath("(//ul//li//a[contains(text(),'Contact us')])[1]");
	public static By name = By.cssSelector("[name='contact[name]']");
	public static By email = By.cssSelector("[name='contact[email]']");
	public static By msg = By.cssSelector("[name='contact[body]']");
	public static By submit = By.xpath("//form[@id='contact_form']//button[@type='submit']");
	public static By validate = By.cssSelector("[class='note note--success']");
	public static By validate2 = By.cssSelector("[value='Submit']") ;
}
