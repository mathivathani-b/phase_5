package com.ecom.webapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
//Let's do some Test Cases Evaluated in Chrome browser and some in MicrosoftEdge Browser 
public class TestNgGroupTest {
	
   final  String amazonURL = "https://www.amazon.in/";
   final  String simplilearnURL = "https://www.simplilearn.com/";
   
   final String chromeDriverPath ="D:\\Selenium\\chromedriver.exe"; 
   final String mirosoftedgeDriverPath ="D:\\Selenium\\msedgedriver.exe"; 
   
   WebDriver driver1;
   WebDriver driver2;
 

   //Chrome browser test -> Group Chrome Test
   
  
  @Test(groups="ChromeOnly")
  public void launchChromeTest() {
	  System.setProperty("webdriver.chrome.driver",chromeDriverPath );
	  driver1 = new ChromeDriver();
	  driver1.get(amazonURL);
  }
  
  @Test(groups="ChromeOnly", dependsOnMethods="launchChromeTest", priority=1)
  public void testAmazonHomePage() {
	  String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  assertEquals(expected,driver1.getTitle());
  }
  
  @Test(groups="ChromeOnly", dependsOnMethods="launchChromeTest",priority=2)
  public void testAmazonSourceURL() {
	  assertEquals(amazonURL,driver1.getCurrentUrl());
	  driver1.close();
  }
  
  //Microsoft Edge Test -> Group Microsoft Edge Test 
  @Test(groups="MicrosoftEdgeOnly")
  public void launchMicrosoftEdgeTest() {
	  System.setProperty("webdriver.edge.driver",mirosoftedgeDriverPath );
	  driver2 = new EdgeDriver();
	  driver2.get(simplilearnURL);
  }
  
  @Test(groups="MicrosoftEdgeOnly",dependsOnMethods="launchMicrosoftEdgeTest", priority=1)
  public void testSimplilearnHomePageTitle() {
	  String expected = "Simplilearn | Online Courses - Bootcamp & Certification Platform";
	  assertEquals(expected, driver2.getTitle());
  }
  
  @Test(groups="MicrosoftEdgeOnly", dependsOnMethods="launchMicrosoftEdgeTest",priority=2)
  public void testSimplilearnSourceURL() {
	  assertEquals(simplilearnURL,driver2.getCurrentUrl());
	  driver2.close();
  }
  
}
