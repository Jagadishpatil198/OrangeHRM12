package com.Orangehrm.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRequirementPgae {
	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement reqbutton;
	@FindBy(xpath = "(//div[text()='-- Select --' and @class='oxd-select-text-input'])[1]")
	private WebElement jobtitle;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement canditatename;
	@FindBy(xpath = "(//div[text()='-- Select --' and @class='oxd-select-text-input'])[2]")
	private WebElement vacancy;
	@FindBy(xpath = "(//div[text()='-- Select --' and @class='oxd-select-text-input'])[3]")
	private WebElement hiringmang;
	@FindBy(xpath = "(//div[text()='-- Select --' and @class='oxd-select-text-input'])[4]")
	private WebElement status;
	@FindBy(xpath = "(//div[text()='-- Select --' and @class='oxd-select-text-input'])[5]")
	private WebElement methodappln;
	@FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	private WebElement keywords;
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement datefrom;
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement dateto;
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchbuton;
	@FindBy(xpath="//p[text()='May']/following-sibling::p[@class='oxd-text oxd-text--p']/descendant::p[text()='2024']")
	private WebElement month;
	public AddRequirementPgae(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	public WebElement Req()
	{
		return reqbutton;
	}
	public WebElement job()
	{
		return jobtitle;
	}
	public WebElement fromcal()
	{
		return datefrom;
	}
	public WebElement tocal()
	{
		return dateto;
		
	}
	public WebElement moth()
	{
		return month;
	}

}
