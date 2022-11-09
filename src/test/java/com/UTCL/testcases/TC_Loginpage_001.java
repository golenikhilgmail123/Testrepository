package com.UTCL.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.UTCL.testcases.Baseclass;
import com.UTCL.utilities.XLUtils;
import com.UTCL.pageobjects.Loginpage;
//Create only test methods here i.e. actual test case @Test annotation
public class TC_Loginpage_001 extends Baseclass {
	
	@Test
	public void logintest() throws InterruptedException
    {
		
		Loginpage lp= new Loginpage(driver);
		lp.username(username);
		lp.clicknext();
		Thread.sleep(2000);
		lp.setpassword(password);
		lp.clicknext2();
		Thread.sleep(5000);
		if(driver.getTitle().equals("UltratechWeb V13.8"))
		{
			Assert.assertTrue(true);
			System.out.println("Test case passed");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Test case failed");
		}
}
	
	
	
	
	
	

	/*@DataProvider(name="Logindata")
	String [][] getdata() throws IOException
	{
		String path="C:\\Users\\Dhruvansh\\eclipse-workspace\\Testingframework\\TestData.xlsx";
		//System.out.println("File name is:" +path);
		int rownum=XLUtils.getrowcount(path, "Sheet1");
		//System.out.println("row count is:" +rownum);
		int colcount=XLUtils.getcellcount(path, "Sheet1",1);
		System.out.println("col count is:" +colcount);
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<=colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getcelldata(path, "sheet1", i, j);
			}
		}
		return logindata;
	}*/
	
}
