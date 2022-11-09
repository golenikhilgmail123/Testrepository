package com.UTCL.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testseleniummethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhruvansh\\eclipse-workspace\\Testingframework\\Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("name=\"q\""));
		element.click();
		
	}

}
