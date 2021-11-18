package com.mindtree.uistore;

import org.openqa.selenium.By;

public class Wishlist_UI {
	public static By home = By.cssSelector("[class='h1 site-header__logo']");
	public static By wishlist = By.xpath("//span[contains(text(),'wish')]");
//	public static By validate = By.cssSelector("[class='swym-tab-modal-content']");
	public static By button = By.cssSelector("[id='swym-welcome-button']");
}
