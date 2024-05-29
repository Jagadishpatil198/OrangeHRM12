package com.Orangehrm.basicTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Orangehrm.PageObject.AddRequirementPgae;
import com.Orangehrm.PageObject.HomePage;
import com.Orangehrm.PageObject.LoginPgae;
import com.Orangehrm.PageObject.LogoutPage;

public class BasePage implements FrameworkConstants{
	WebDriver driver;
public 	Properties pro;
	public FileInputStream fis;
	LogoutPage lo;
public 	HomePage HM;
public AddRequirementPgae Addreq;
	@BeforeClass
	public void openaplln() throws IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver= new ChromeDriver();
		
		pro=new Properties();
		 fis=new FileInputStream("./PropertyFile/test.properties");
		pro.load(fis);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
		 HM=new HomePage(driver);
		  Addreq=new AddRequirementPgae(driver);
		
		
	}
	@BeforeMethod
	public void login1()
	{
		LoginPgae LP=new LoginPgae(driver);
		LP.enterusn().sendKeys(pro.getProperty("usn2"));
		LP.pass().sendKeys(pro.getProperty("psw2"));
		LP.click().click();
	}
	@AfterMethod
	public void logout(ITestResult result)
	{
		if(result.FAILURE==result.getStatus())
		{
			Capture_Defect.Defect(driver, result.getName());
		}
	 lo=new LogoutPage(driver);
	 lo.logout().click();
	 lo.logoutbutton().click();
		 
		 
		 
	}
	@AfterClass
	public void closeappln()
	{
		driver.close();
	}

}
