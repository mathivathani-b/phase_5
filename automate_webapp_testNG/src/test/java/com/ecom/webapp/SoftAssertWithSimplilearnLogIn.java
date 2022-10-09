package com.ecom.webapp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertWithSimplilearnLogIn {
	
	final  String siteURL = "https://accounts.simplilearn.com/user/login";
	 final String DriverPath ="D:\\Selenium\\chromedriver.exe";
	 WebDriver driver;
	 SoftAssert softAssert = new SoftAssert();
	 
	 @Test(groups="ChromeOnly")
	  public void launchChromeTest() {
		  System.setProperty("webdriver.chrome.driver",DriverPath );
		  driver = new ChromeDriver();
		  driver.get(siteURL);
	  }
	 
	 @Test(groups="ChromeOnly",dependsOnMethods="launchChromeTest", priority=1)
	  public void testSimplilearnHomePageTitle() {
		  String expected = "Learning on Simplilearn";
		  assertEquals(expected, driver.getTitle());
	  }
	  
	  @Test(groups="ChromeOnly", dependsOnMethods="launchChromeTest",priority=1)
	  public void testSimplilearnLogin() throws InterruptedException {
		  driver.findElement(By.name("user_login")).sendKeys("mathi02112000@gmail.com");
		  driver.findElement(By.name("user_pwd")).sendKeys("Arunsankar100%");
		  driver.findElement(By.name("btn_login")).click();
		  softAssert.assertTrue(driver.findElement(By.name("user_login")).isDisplayed());
		  driver.close();
	  }
	  

}
