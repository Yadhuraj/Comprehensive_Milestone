package com.mindtree.uistore;

import org.openqa.selenium.By;

public class Cart_checkout_UI {
	public static By home = By.cssSelector("[class='h1 site-header__logo']");
	public static By cart = By.xpath("(//*[@class='cart-link'])[2]");
	public static By checkout = By.xpath("//*[@class='drawer__inner']//button[@name='checkout']");
	public static By Continue = By.xpath("(//button[@id='continue_button'])");
	public static By remove = By.xpath("(//*[@class='cart__remove text-link'])[1]");
	public static By cart_close = By.xpath("//div[@class='drawer__close text-right']//button");

}
