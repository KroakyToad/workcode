package com.infrrd.roostify.testcase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.infrrd.roostify.pagelibrary.HomePagePageLibrary;
import com.kroakyhub.testfrog.base.BaseTest;



public class HomePageTestCase extends BaseTest {
		
	String response = null;
	
	@BeforeClass
	public void driverSetup(){
		initializeDriver();
	}
	
	@BeforeMethod
	public void testSetup(){
		gotoTestURL();
	}
	
	@AfterMethod
	public void clearResponse(){
		response = null;
	}
	
	@AfterTest
	public void tearDown(){
		killDriver();
	}
	
	@Test(description = "Validating presence of relevant fields for purchase ", enabled=true)
	public void validateOptionsForPurchase() throws InterruptedException{
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response = homePagePageLibrary.addUserInputForPurchase();
		Assert.assertEquals(response.contains("Success"), true);
	}

	@Test(description = "Validating presence of relevant fields for refinance ", enabled=true)
	public void validateOptionsForRefinance() throws InterruptedException{
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response = homePagePageLibrary.addUserInputForRefinance();
		Assert.assertEquals(response.contains("Success"), true);
		
	}

	@Test(description = "Validating presence of relevant fields for refinance cashout", enabled=true)
	public void validateOptionsForRefinanceCashout(){
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response =  homePagePageLibrary.addUserInputForRefinanceCashOut();
		Assert.assertEquals(response.contains("Success"), true);
	}

	@Test(description = "Validating graph legends", enabled=true)
	public void validateGraphLegends(){
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response = homePagePageLibrary.verifyingGraphLegends();
		Assert.assertEquals(response.contains("Success"), true);
	}


	@Test(description = "Validating other optimizations section", enabled=true)
	public void validateOtherOptimizations(){
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response = homePagePageLibrary.validateOtherOptimizationsAndOptions();
		Assert.assertEquals(response.contains("Success"), true);
	}

	@Test(description = "Validating Lead form upon clicking get this loan button ", enabled=true)
	public void validatingLeadForm(){
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response = homePagePageLibrary.validatingLeadFormDetailsContainer();
		Assert.assertEquals(response.contains("Success"), true);
	}

	@Test(description = "Validating Get My Options is not enabled if madatory data is not filled", enabled=true)
	public void checkEnablingOfGetMyOptionsButton(){
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response = homePagePageLibrary.getMyOptionsEnablingCheck();
		Assert.assertEquals(response.contains("Success"), true);
	}

	@Test(description = "Validating Zip code error block", enabled=true)
	public void validateZipCodeError(){
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response = homePagePageLibrary.validateZipCodeLookupError();
		Assert.assertEquals(response.contains("Success"), true);
	}

	@Test(description = "Validate zip code look up container", enabled=true)
	public void validateZipCodeLookUp(){
		HomePagePageLibrary homePagePageLibrary = new HomePagePageLibrary(getDriver());
		response =  homePagePageLibrary.validateZipCodeLookUpContainer();
		Assert.assertEquals(response.contains("Success"), true);
	}
	

}
