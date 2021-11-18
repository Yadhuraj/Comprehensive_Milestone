package com.mindtree.uistore;

import org.openqa.selenium.By;

public class Search_header_UI {
	public static By home = By.cssSelector("[class='h1 site-header__logo']");
	public static By gifts = By.xpath("//li[@class='site-nav__item site-nav__expanded-item site-nav--has-dropdown']//a[contains(@href,'unique-gifts')]");
	public static By item = By.xpath("(//ul[@class='site-nav__dropdown text-left']//li)[1]");
	public static By product = By.xpath("(//div[@id='CollectionAjaxContent']//div[@class='grid__item grid-product small--one-half medium-up--one-quarter aos-init aos-animate']//div)[1]");
	public static By add_cart = By.xpath("//button[@name='add']");
	public static By cart_close = By.xpath("//div[@class='drawer__close text-right']//button");
	
}
