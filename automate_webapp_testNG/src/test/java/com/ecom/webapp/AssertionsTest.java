package com.ecom.webapp;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {
	//Hard Assert: Hard assert throws an AssertException immediately when an assert statement fails and 
	//test suite continues with next @Test
 
	@Test
	public void hardAssert() {
		System.out.println("-- Hard Assert Method was started...  --");
		assertEquals(true,false); //Assertion Error
		System.out.println("-- Hard Assert Is Completed.  ----");
	}
	
	//Soft Assert :: Soft assert collects errors during @Test. 
	//Soft assert does not throw an exception when an assert fails. 
	
	@Test
	public void softAssert() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("-- Soft Assert Method was started --");
		softAssert.assertEquals(true, false);
		softAssert.assertTrue(false);
		System.out.println("-- Soft Assert Method Was Completed --");
	}

}
