package com.mindtree.uistore;

import org.openqa.selenium.By;

public class Login_Forgot_UI {
	public static By sign_in = By.xpath("//div[@class='site-nav__icons']//a[contains(@href ,'login')]");
	public static By forgot = By.cssSelector("[id = 'RecoverPassword']");
	public static By email_recover = By.cssSelector("[id = 'RecoverEmail']");
	public static By submit_recover = By.cssSelector("input[value = 'Submit']");
	public static By validate_recover = By.cssSelector("div[id = 'ResetSuccess']");
	public static By validate2 = By.cssSelector("[value='Submit']") ;
	
}
