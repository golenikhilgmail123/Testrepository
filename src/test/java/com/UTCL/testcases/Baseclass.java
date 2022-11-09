package com.UTCL.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.UTCL.utilities.Readconfig;

//Add all common methods and variables in 1 base class
public class Baseclass {
	Readconfig readconfig=new Readconfig();
	//All common variables as follows
	public String baseurl=readconfig.getapplicationurl();
    public String username=readconfig.getapplicationusername();
    public String password=readconfig.getapplicationpassword();
    public static WebDriver driver;
	
    @Parameters("browser")
    //All common methods as follows
    @BeforeClass
    public void setup(String br)
    {    
    	if(br.equals("chrome"))
    	{
   System.setProperty("webdriver.chrome.driver", readconfig.getbrowserpath());
     driver= new ChromeDriver();
    }
    	else if(br.equals("firefox")) {
    		 System.setProperty("webdriver.gecko.driver", readconfig.getbrowserpathfirefox());
    	     driver= new FirefoxDriver();
    	}
    	else if(br.equals("edge")) {
   		 System.setProperty("webdriver.edge.driver", readconfig.getbrowserpathedge());
   	     driver= new EdgeDriver();
   	}
    	driver.get(baseurl);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @AfterClass
    public void teardown()
    {
    	driver.close();
    }
	
	
	
}
