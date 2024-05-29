package com.Orangehrm.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orangehrm.basicTest.BasePage;
import com.Orangehrm.basicTest.ReadExcel;

public class Testcase_id extends BasePage {
	
	@Test
	public void runnappln123() throws Exception
	{
		HM.pimcl().click();
		HM.addemploy().click();
		HM.firstname().sendKeys(ReadExcel.Readdata("Sheet5", 1, 0));
		HM.middlename().sendKeys(ReadExcel.Readdata("Sheet5", 1, 1));
		HM.lastname().sendKeys(ReadExcel.Readdata("Sheet5", 1, 2));
		HM.save1().click();
		Assert.fail();
	}
	@Test
	public void runnappln()
	{
		HM.pimcl().click();
		HM.addemploy().click();
		HM.firstname().sendKeys(pro.getProperty("fn1"));
		HM.middlename().sendKeys(pro.getProperty("mdl1"));
		HM.lastname().sendKeys(pro.getProperty("lst1"));
		HM.save1().click();
		
	}

}
