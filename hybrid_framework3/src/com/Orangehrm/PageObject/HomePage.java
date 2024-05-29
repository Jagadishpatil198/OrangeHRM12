package com.Orangehrm.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addem;

	@FindBy(name="firstName")
	private WebElement fn;

	@FindBy(name="middleName")
	private WebElement middlen;

	@FindBy(name="lastName")
	private WebElement lastn;
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save;


	 public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement pimcl()
	{
	   return	pim;
	}
	public WebElement addemploy()
	{
	return	addem;
	}
	public WebElement firstname()
	{
		return fn;
	}
	public WebElement middlename()
	{
		return middlen;
	}
	public WebElement lastname()
	{
	return	lastn;
	}
	public WebElement save1()
	{
		return save;
	}


}
