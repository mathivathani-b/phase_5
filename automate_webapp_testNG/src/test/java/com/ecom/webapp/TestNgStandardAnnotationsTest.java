package com.ecom.webapp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgStandardAnnotationsTest {
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("--- Before Suite Is Executed---");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("--- After Suite Is Executed ---");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("--- Before Class Is Executed ---");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("--- After Class Is Executed ---");
		
	}
	
	@BeforeMethod
	public void setUpBeForEachTest() {
		System.out.println("--- Before Method Is Executed ---");
	}
	
	@AfterMethod
	public void tearDownAfterEachTest() {
		System.out.println("---After Method Is Executed ---");
	}
	
	@Test
	public void testOne() {
		System.out.println("-- Test 1 method is executed ! --");
		
	}
	
	@Test
	public void testTwo() {
		System.out.println("-- Test 2 method is executed ! --");
		
	}
	
	@Test
	public void testThree() {
		System.out.println("-- Test 3 method is executed ! --");
		
	}

}
