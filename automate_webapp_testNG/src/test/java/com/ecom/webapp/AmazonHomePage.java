package com.ecom.webapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonHomePage {
	
	//1. Formulate A Base Test URL
    final  String siteURL = "https://www.amazon.com/";
    //2. Locate A Web Driver BY Locating the path 
    final String driverPath ="D:\\Selenium\\chromedriver.exe"; 
    WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  //3. Set Selenium System Properties.
      System.setProperty("webdriver.chrome.driver",driverPath);
	 //4. Instantiate Selenium Web Driver . That means Create an object of the web driver.
      driver = new ChromeDriver();
     //5. Launch Browser
      driver.get(siteURL);
  }

  @AfterMethod
  public void afterMethod() {
	  
	//Close Driver 
      driver.close();
  }
  
  @Test
  public void homePageTitleVerification() {
	  
	//Perform Test Evaluation
      String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
      assertEquals(expectedTitle,driver.getTitle());
  }
  
  @Test
  public void testUrl() {
	//Perform Test Evaluation
      assertEquals(siteURL,driver.getCurrentUrl());
  }

}
