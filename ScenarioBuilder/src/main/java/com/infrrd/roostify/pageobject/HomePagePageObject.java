package com.infrrd.roostify.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.kroakyhub.testfrog.base.BasePageObjectRepository;

public class HomePagePageObject extends BasePageObjectRepository{

	public HomePagePageObject(EventFiringWebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public final String otherOptimizationsTextXpath = "//h3[contains(text(),'Other Optimizations')]";
	public final String vetranCheckBoxXpath = "//*[@for ='military_service']";
	public final String firstTimeHomeBuyerXpath = "//*[@for ='first_time_home_buyer']";
	public final String getThisLoanButtonXpath = "//*[(@type ='button')and(contains(text(),'Get This Loan'))]";
	public final String otherOptionsPlaceholdersXpath = "//*[(@class='result-card')]";
	public final String graphXpath = "//*[@id='result-graph']";
	public final String purposeOfLoanPath = "//*[@aria-label='Purpose of Loan']";
	public final String purchasePricePath = "//*[@aria-label ='Purchase Price']";
	public final String downPaymentPath = "//*[@aria-label ='Down Payment']";
	public final String zipCodepath = "//*[@aria-label='Where is the property?']";
	public final String zipCodeDropdownPath = "//*[@aria-label='Where is the property?']/following-sibling::div[@class='sb-zipcode-wrapper']//*[@role='option'][1]//li";
	public final String whatIsYourGoalForThisLoanPath = "//*[@aria-label ='What is your goal for this loan?']";
	public final String howsYourCreditPath ="//*[@aria-label='Excellent(740+)']/..";
	public final String CTALinkPath = "//*[@class='sb-advance-wrapper']";
	public final String propertyTypeDropDownPath = "//*[@aria-label ='Property Type']";
	public final String propertyUseDropDownPath = "//*[@aria-label='Property Use']";
	public final String annualPropertyTaxPath = "//*[@aria-label='Property Tax']";
	public final String homeOwnerInsurancePath = "//*[@aria-label='Monthly Homeowner’s Insurance']";
	public final String hoaFeesPath = "//*[@aria-label='Monthly HOA Fees']";
	public final String getMyOptionsButtonPath = "//button[contains(text(),'Get My options')]";
	public final String currentMortgageBalancePath = "//*[@aria-label='Current Mortgage Balance']";
	public final String currentPropertyValuePath = "//*[@aria-label='Current Property Value']";
	public final String desiredCashOutPath = "//*[@aria-label='Desired Cashout Amount']";
	public final String principleAndInterestXpath = "//*[@class='sb-graph-legend-block']/p";
	public final String propertyTaxXpath = "//*[@class='sb-graph-legend-block']/p[contains(text(),'Property Tax')]";
	public final String homeInsuranceXpath = "//*[@class='sb-graph-legend-block']//p[contains(text(),'Insurance + HOA')]";
	public final String PMIXpath = "//*[@class='sb-graph-legend-block']/p[contains(text(),'PMI')]";
	public final String PrincipalInterestXpath = "//*[@class='sb-graph-legend-block']/p[contains(text(),'Principal & Interest')]";
	public final String OtherOptionsXpath = "//*[@class = 'options-heading sb-other-options']/h3[contains(text(),'Other options')]";
	public final String zipCodeErrorMesageXpath = "//*[@class='sb-zipcode-error-block']";
	public final String calculatedDownPaymentXpath = "//*[@class='sb-percent-value']";
	public final String zipCodeLookUpDropDownXpath = "//*[@class = 'sb-zipcode-wrapper']";
	public final String pieChartProductNameXpath = "//*[@class= 'sb-main-name']";
	public final String pieChartProductEMIXpath = "//*[@class= 'sb-main-principal']";
	public final String pieChartProductTypeXpath    = "//*[@class= 'sb-main-product-type']";
	public final String leadFormDetailsHeaderXpath = "//*[@class= 'sb-lead-form-heading']";
	public final String leadFormFirstNameXpath = "//*[@aria-label= 'First Name']";
	public final String leadFormLastNameXpath = "//*[@aria-label= 'Last Name']";
	public final String leadFormEmailXpath = "//*[@aria-label= 'Email']";

	@FindBy(xpath = leadFormDetailsHeaderXpath)
	public WebElement leadFormDetailsHeader;

	@FindBy(xpath = leadFormEmailXpath)
	public WebElement leadFormEmailField;

	@FindBy(xpath = leadFormFirstNameXpath)
	public WebElement leadFormFirstNameField;

	@FindBy(xpath = leadFormLastNameXpath )
	public WebElement leadFormLastNameField;

	@FindBy(xpath = pieChartProductEMIXpath)
	public WebElement pieChartProductEMI;

	@FindBy(xpath = pieChartProductTypeXpath)
	public WebElement pieChartProductType;

	@FindBy(xpath = pieChartProductNameXpath )
	public WebElement pieChartProductName;

	@FindBy(xpath = zipCodeLookUpDropDownXpath)
	public WebElement zipCodeLookUpDropDown;

	@FindBy(xpath = calculatedDownPaymentXpath)
	public WebElement calculatedDownPayment;

	@FindBy(xpath = zipCodeErrorMesageXpath )
	public WebElement zipCodeErrorMesage;

	@FindBy(xpath = otherOptionsPlaceholdersXpath)
	public WebElement otherOptionsPlaceholders;

	@FindBy(xpath = OtherOptionsXpath)
	public WebElement otherOptionSection;

	@FindBy(xpath = principleAndInterestXpath)
	public WebElement principleAndInterestField;

	@FindBy(xpath = propertyTaxXpath)
	public  WebElement propertyTextField;

	@FindBy(xpath = homeInsuranceXpath)
	public WebElement homeInsuranceField;

	@FindBy(xpath = PMIXpath)
	public WebElement PMIField;
	
	
	@FindBy(xpath = PrincipalInterestXpath)
	public WebElement PrincipalInterest;

	@FindBy(xpath = graphXpath)
	public WebElement  pieChartGraph;

	@FindBy(xpath = desiredCashOutPath)
	public WebElement desiredCashOut;

	@FindBy(xpath = currentMortgageBalancePath)
	public WebElement currentMortgageBalance;

	@FindBy(xpath = currentPropertyValuePath)
	public WebElement currentPropertyValue;

	@FindBy(xpath = purposeOfLoanPath)
	public WebElement purposeOfLoan;

	@FindBy(xpath = purchasePricePath)
	public WebElement purchasePrice;

	@FindBy(xpath = downPaymentPath)
	public WebElement downPayment;

	@FindBy(xpath = zipCodepath)
	public WebElement zipCode;
	
	@FindBy(xpath = zipCodeDropdownPath)
	public WebElement zipCodeDropdown;

	@FindBy(xpath = whatIsYourGoalForThisLoanPath)
	public WebElement whatIsYourGoalForThisLoan;

	@FindBy(xpath = howsYourCreditPath )
	public WebElement  howsYourCredit;

	@FindBy(xpath = CTALinkPath)
	public WebElement CTALink;

	@FindBy(xpath = annualPropertyTaxPath )
	public WebElement annualPropertyTax;

	@FindBy(xpath = hoaFeesPath )
	public WebElement hoaFees;

	@FindBy(xpath = homeOwnerInsurancePath )
	public WebElement homeOwnerInsurance;

	@FindBy(xpath = propertyTypeDropDownPath )
	public WebElement propertyType;

	@FindBy(xpath = propertyUseDropDownPath )
	public WebElement propertyUse;

	@FindBy(xpath =  getMyOptionsButtonPath)
	public WebElement getMyOptionsButton;

	@FindBy(xpath = vetranCheckBoxXpath)
	public WebElement  veteranCheckBox;

	@FindBy(xpath = firstTimeHomeBuyerXpath)
	public WebElement firstTimeHomeBuyerCheckBox;

	@FindBy(xpath = getThisLoanButtonXpath)
	public WebElement getThisLoanButton;

	@FindBy(xpath = otherOptimizationsTextXpath)
	public WebElement otherOptimizationText;

}
