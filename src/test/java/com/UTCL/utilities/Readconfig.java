package com.UTCL.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	public Readconfig()
	{
      File src= new File("C:\\\\Users\\\\Dhruvansh\\\\eclipse-workspace\\\\Testingframework\\\\Configuration\\\\config.properties");
	//First we need to open that confir.properties file
	try {
	FileInputStream fis= new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
}
catch(Exception e)
{
	System.err.println("Exception is" +e.getMessage());
}
	}
	//create method to read var from config properties
	
	
	
public String getapplicationurl() {
	String url= pro.getProperty("baseurl");
	return url;
}
	public String getapplicationusername() {
		String url= pro.getProperty("username");
		return url;
	}
		
		public String getapplicationpassword() {
			String url= pro.getProperty("password");
			return url;
		}
		
		public String getbrowserpath() {
			String url= pro.getProperty("chromepath");
			return url;
		}
		
		public String getbrowserpathfirefox() {
			String url= pro.getProperty("firefoxpath");
			return url;
		}
		public String getbrowserpathedge() {
			String url= pro.getProperty("edgepath");
			return url;
		}
		public String getexcelpath() {
			String url= pro.getProperty("excelpath");
			return url;
		}
}

	
	


	
