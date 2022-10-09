package com.ecom.webapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonNavigationLink {
	
	//1. Formulate A Base Test URL
    final  String siteURL = "https://www.amazon.in/";
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
  public void mobileLinkVerification() {
	  
	  WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
	  assertTrue(mobileLink.isDisplayed());
	  assertTrue(mobileLink.isEnabled());
	  mobileLink.click();
	  
	  //VerifyTestLink
	  String expected = "Amazon.in Bestsellers: The most popular items on Amazon";
	  assertEquals(expected, driver.getTitle());
  }
  
  @Test
  public void fashionLinkVerification() {
	  
	  WebElement fashionLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)"));
	  assertTrue(fashionLink.isDisplayed());
	  assertTrue(fashionLink.isEnabled());
	  fashionLink.click();
	  
	  //VerifyTestLink
	  String expected1 = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
	  assertEquals(expected1, driver.getTitle());
  }
  
  @Test
  public void electronicsLinkVerification() {
	  
	  WebElement electronicsLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)"));
	  assertTrue(electronicsLink.isDisplayed());
	  assertTrue(electronicsLink.isEnabled());
	  electronicsLink.click();
	  
	  //VerifyTestLink
	  String expected2 = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
	  assertEquals(expected2, driver.getTitle());
  }
  
  
}
