package com.Orangehrm.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	@FindBy(xpath = "//p[text()='Demo User']")
	private WebElement log;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement logout()
	{
		return log;
	}
	public WebElement logoutbutton()
	{
		return logout;
	}
	

}
