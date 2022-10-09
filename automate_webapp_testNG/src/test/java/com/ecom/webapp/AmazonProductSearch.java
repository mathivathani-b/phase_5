package com.ecom.webapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonProductSearch {
	
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
	  
	  driver.close();
  }
  
  @Test
  public void testForSearchProduct1() {
	  
	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	  assertTrue(searchBox.isDisplayed());
	  assertTrue(searchBox.isEnabled());
	  searchBox.sendKeys("Intel I7 Laptop");
	  searchBox.submit();
  }
  
  @Test
  public void testForSearchProduct2() {
	  
	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	  assertTrue(searchBox.isDisplayed());
	  assertTrue(searchBox.isEnabled());
	  searchBox.sendKeys("Search HP Laptops");
	  searchBox.submit();
  }

  
  
  @Test
  public void testForSearchProduct3() {
	  
	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	  assertTrue(searchBox.isDisplayed());
	  assertTrue(searchBox.isEnabled());
	  searchBox.sendKeys("Search for Asus TUF");
	  searchBox.submit();
  }

}
