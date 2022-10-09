package com.ecom.webapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonNavigationDemo {
	
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
  
  @Test(description = "Test for bestsellers in amazon")
  public void descriptionPage() {
	  
	  WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
	  assertEquals(mobileLink.isDisplayed(), true);
	  assertEquals(mobileLink.isEnabled(), true);
	  
	  mobileLink.click();
	  String expected = "Amazon.in Bestsellers: The most popular items on Amazon";
	  assertEquals(driver.getTitle(), expected);
	  
  }
  
  @Test(description = "Test for customer service ", dependsOnMethods="descriptionPage", alwaysRun=true)
  public void testFashion() {
	  WebElement fashionLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)"));
	  assertEquals(fashionLink.isDisplayed(), true);
	  assertEquals(fashionLink.isEnabled(), true);
	  fashionLink.click();
	  
	  String expected = "Help - Amazon Customer Service";
	  assertEquals(driver.getTitle(), expected); 
  }

}
