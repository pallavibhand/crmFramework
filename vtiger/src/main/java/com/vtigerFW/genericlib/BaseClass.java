package com.vtigerFW.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void launchBrowserTest()
	{
		System.setProperty("webdriver.gecko.driver","../vtiger/target/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void loginTest()
	{
		System.out.println("login to application");
	}
	@AfterMethod
	public void logoutTest()
	{
		System.out.println("logout to application");
	}
	@AfterClass
	public void closeTest()
	{
		driver.quit();
	}

}
