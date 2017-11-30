package com.selenium.Sample_Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SampleTest {
	 WebDriver driver;
	//private static String dynamicUrl;
	
	@Test
	public void testCheck() throws Exception 
	{
	//	driver=new HtmlUnitDriver();
		driver.get("https://www.google.co.in/");
		
	System.out.println("verify google");
	testverifybrowser();
	testcheck();
	
	}

	
	public void testverifybrowser(){
		
		driver.get("https://www.redbus.in");
		System.out.println("verify rebus");
		
	}
	
	
	public void testcheck(){
		
		driver.get("http://newtours.demoaut.com/");
	System.out.println("verify demo");
	}
	 @Before

	 public void beforedriver(){
	 	
	 	driver=new FirefoxDriver();
	 }

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}
