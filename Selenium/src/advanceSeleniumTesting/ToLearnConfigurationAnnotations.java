package advanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("Before suit got executed",true);
	}
	
	@AfterSuite
	public void afterSuit() {
		Reporter.log("After suit got executed",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test got executed",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test got executed",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class got executed",true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("After Class got executed",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method got executed",true);
	}
	
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("After Method got executed",true);
	}
	
	@Test
	public void testCase() {
		Reporter.log("Testcase got executed",true);
	}
	

}
