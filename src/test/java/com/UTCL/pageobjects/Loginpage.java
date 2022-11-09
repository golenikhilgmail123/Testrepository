package com.UTCL.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Add all login page object/web elements here
public class Loginpage {
	WebDriver ldriver;
	public Loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//All login page object elements as follows
	
	
	@FindBy(xpath="//*[@id=\"uname\"]")
	WebElement username;
	
	@FindBy(xpath="/html/body/app-root/div/app-login/div[1]/div/div/div[1]/form/div/div/div[2]/div/button")
	WebElement nextbutton;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="/html/body/app-root/div/app-login/div[1]/div/div/div[1]/div[2]/form/div/div[2]/div/button")
	WebElement nextbutton2;
	
	
	//Action methods for all those elements as follows
	
	
	public void username(String uname)
	{
		username.sendKeys(uname);
	}
	public void clicknext()
	{
		nextbutton.click();
	}
		public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
		public void clicknext2()
		{
			nextbutton2.click();
		}
	

	
}
