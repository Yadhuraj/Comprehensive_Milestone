package com.mindtree.uistore;

import org.openqa.selenium.By;

public class Latest_UI {
	public static By home = By.cssSelector("[class='h1 site-header__logo']");
	public static By New = By.xpath("//button[contains(text(),'New')]");
	public static By product = By.xpath("(//*[@class='grid-product__content'])[1]");
	public static By add_cart = By.xpath("//button[@name='add']");
	public static By cart_close = By.xpath("//div[@class='drawer__close text-right']//button");
	
}
