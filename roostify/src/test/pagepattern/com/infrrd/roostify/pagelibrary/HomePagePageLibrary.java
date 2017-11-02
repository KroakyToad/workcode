package com.infrrd.roostify.pagelibrary;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import com.infrrd.roostify.pageobject.HomePagePageObject;
import com.kroakyhub.testfrog.base.BasePageLibrary;
import com.kroakyhub.testfrog.base.BaseTest;



public class HomePagePageLibrary extends BasePageLibrary<HomePagePageObject> {

	EventFiringWebDriver driver;
		
	public HomePagePageLibrary(EventFiringWebDriver driver) {
		super(driver, new HomePagePageObject(driver));
		this.driver = driver;
	}
	
	Select dropdown;
	
	public String addUserInputForPurchase(){			
		try {
			
			dropdown = new Select(ObjectRepository.purposeOfLoan);
			dropdown.selectByValue("purchase");
			ObjectRepository.purchasePrice.sendKeys("350000");
			//downPayment.sendKeys("20");
			ObjectRepository.zipCode.sendKeys("15001");
			ObjectRepository.zipCodeDropdown.click();
			ObjectRepository.CTALink.click();
			dropdown =  new Select(ObjectRepository.propertyType);
			dropdown.selectByValue("SingleFamily");
			dropdown =  new Select(ObjectRepository.propertyUse);
			dropdown.selectByValue("primary");
			ObjectRepository.firstTimeHomeBuyerCheckBox.click();
			ObjectRepository.veteranCheckBox.click();
			ObjectRepository.hoaFees.sendKeys("25000");
			ObjectRepository.getMyOptionsButton.click();
			return "Successfully Entered Relevant Data For Purchase ";
		} catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
			
		}
		
	}


	public String addUserInputForRefinance(){
		try{		
			dropdown = new Select(ObjectRepository.purposeOfLoan);
			dropdown.selectByValue("refi");
			ObjectRepository.currentMortgageBalance.sendKeys("53000");
			ObjectRepository.currentPropertyValue.sendKeys("350000");
			ObjectRepository.zipCode.sendKeys("15001");
			ObjectRepository.zipCodeDropdown.click();
			ObjectRepository.CTALink.click();
			dropdown =  new Select(ObjectRepository.propertyType);
			dropdown.selectByValue("SingleFamily");
			dropdown =  new Select(ObjectRepository.propertyUse);
			dropdown.selectByValue("primary");
			ObjectRepository.veteranCheckBox.click();
			return "Successfully Entered Relevant Data For Refinance ";
		}catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}	
		
	}


	public String addUserInputForRefinanceCashOut(){	
		try{
			dropdown =  new Select(ObjectRepository.purposeOfLoan);
			dropdown.selectByValue("reficashout");
			ObjectRepository.currentMortgageBalance.sendKeys("350000");
			ObjectRepository.desiredCashOut.sendKeys("53000");
			ObjectRepository.zipCode.sendKeys("15001");
			ObjectRepository.zipCodeDropdown.click();
			ObjectRepository.CTALink.click();
			dropdown =  new Select(ObjectRepository.propertyType);
			dropdown.selectByValue("Condo");
			dropdown =  new Select(ObjectRepository.propertyUse);
			dropdown.selectByValue("investment");
			ObjectRepository.veteranCheckBox.click();
			ObjectRepository.annualPropertyTax.sendKeys("3456");
			ObjectRepository.homeOwnerInsurance.sendKeys("5500");
			ObjectRepository.currentPropertyValue.sendKeys("5500");
			/*WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")))*/;
			ObjectRepository.getMyOptionsButton.click();
			return "Successfully Entered Relevant Data For Refinance Cashout";
		}catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}
		
	}

	public String verifyingGraphLegends(){
		try{
			//WebDriverWait wait =  new WebDriverWait(driver, 10);
			dropdown = new Select(ObjectRepository.purposeOfLoan);
			dropdown.selectByValue("purchase");
			ObjectRepository.purchasePrice.sendKeys("350000");
			//downPayment.sendKeys("20");
			ObjectRepository.autocompleteTyper("15001", ObjectRepository.zipCode);
			ObjectRepository.zipCodeDropdown.click();
			ObjectRepository.CTALink.click();
			dropdown =  new Select(ObjectRepository.propertyType);
			dropdown.selectByValue("SingleFamily");
			dropdown =  new Select(ObjectRepository.propertyUse);
			dropdown.selectByValue("primary");
			ObjectRepository.firstTimeHomeBuyerCheckBox.click();
			ObjectRepository.veteranCheckBox.click();
			ObjectRepository.hoaFees.sendKeys("25000");
			ObjectRepository.getMyOptionsButton.click();	
			ObjectRepository.principleAndInterestField.isDisplayed();
			ObjectRepository.propertyTextField.isDisplayed();
			ObjectRepository.homeInsuranceField.isDisplayed();
			ObjectRepository.PMIField.isDisplayed();
			ObjectRepository.PrincipalInterest.isDisplayed();
			ObjectRepository.getThisLoanButton.isDisplayed();
			return "Successfully validated Graph Legends ";
		}catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}	
		
	}


	public String validateOtherOptimizationsAndOptions() {

		try{
		//	WebDriverWait wait =  new WebDriverWait(driver, 10);
			dropdown = new Select(ObjectRepository.purposeOfLoan);
			dropdown.selectByValue("purchase");
			ObjectRepository.purchasePrice.sendKeys("123456");
			//downPayment.sendKeys("20");
			ObjectRepository.zipCode.sendKeys("15001");
			ObjectRepository.zipCodeDropdown.click();
			ObjectRepository.CTALink.click();
			dropdown =  new Select(ObjectRepository.propertyType);
			dropdown.selectByValue("SingleFamily");
			dropdown =  new Select(ObjectRepository.propertyUse);
			dropdown.selectByValue("primary");
			ObjectRepository.firstTimeHomeBuyerCheckBox.click();
			ObjectRepository.veteranCheckBox.click();
			ObjectRepository.hoaFees.sendKeys("25000");
			ObjectRepository.getMyOptionsButton.click();	
			ObjectRepository.otherOptimizationText.isDisplayed();	
			return "Successfully Validated Other Optimizations And Others Section";
		}catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}
		

	}


	public String validatingLeadFormDetailsContainer() {
		try{
			//WebDriverWait wait =  new WebDriverWait(driver, 10);
			dropdown = new Select(ObjectRepository.purposeOfLoan);
			dropdown.selectByValue("purchase");
			ObjectRepository.purchasePrice.sendKeys("123456");
			//downPayment.sendKeys("20");
			ObjectRepository.zipCode.sendKeys("15001");
			ObjectRepository.zipCodeDropdown.click();
			
			ObjectRepository.CTALink.click();
			dropdown =  new Select(ObjectRepository.propertyType);
			dropdown.selectByValue("SingleFamily");
			dropdown =  new Select(ObjectRepository.propertyUse);
			dropdown.selectByValue("primary");
			ObjectRepository.firstTimeHomeBuyerCheckBox.click();
			ObjectRepository.veteranCheckBox.click();
			ObjectRepository.hoaFees.sendKeys("25000");
			ObjectRepository.getMyOptionsButton.click();
			ObjectRepository.getThisLoanButton.click();
			ObjectRepository.leadFormDetailsHeader.isDisplayed();
			return "Successfully Validated LeadForm ";
		}catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}
		
	}


	public String getMyOptionsEnablingCheck() {
		String value = null;
		try {
			dropdown = new Select(ObjectRepository.purposeOfLoan);
			dropdown.selectByValue("purchase");
			if(!ObjectRepository.getMyOptionsButton.isEnabled()){
				value = "Success";
			}else{
				value = "Failed";
			}
			return value;
		} catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}	
		
	}


	public String validateZipCodeLookupError() {
		String value = null;
		try{		
			ObjectRepository.zipCode.sendKeys("9999");
			if(ObjectRepository.zipCodeErrorMesage.isDisplayed()){
				value = "Success";
			}else{
				value = "Failed";
			}
			return value;
		}catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}		
		
	}


	public String validateZipCodeLookUpContainer() {
		String value = null;
		try{
			ObjectRepository.autocompleteTyper("1500", ObjectRepository.zipCode);
			if(ObjectRepository.zipCodeLookUpDropDown.isDisplayed()){
				value = "Success";
			}else{
				value = "Failed";
			}
			return value;
		}catch (Exception e) {	
			return ("Failed due to exception: "+ e.toString());
		}
	}

	

}
