package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;
//import wdMethods.SeMethods;

public class CreateLeadsPage extends ProjectMethods{

	public CreateLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;
@And ("enter the company name as (.*)")
	public CreateLeadsPage typeCompanyName(String companyName) {

		type(eleCompanyName, companyName);
		return this;		
	}

	@FindBy(how=How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;
	@And ("enter the last name as (.*)")
	public CreateLeadsPage typelastName(String lastName) {

		type(eleLastName, lastName);
		return this;
	}

	@FindBy(how=How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;
	@And ("enter the first name as (.*)")
	public CreateLeadsPage typeFirstName(String firstName) {

		type(eleFirstName, firstName);
		return this;		
	}

	@FindBy(how=How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNum;
	@And ("enter the phone num as (.*)")
	public CreateLeadsPage typePhoneNum(String phoneNum) {

		type(elePhoneNum, phoneNum);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalCountryGeoId")
	private WebElement elecountrytName;
	public CreateLeadsPage selectcountryname(String countryname) {

		selectDropDownUsingText(elecountrytName,countryname);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalStateProvinceGeoId")
	private WebElement elestatetName;
	
	public CreateLeadsPage waitstate() {
		WebWait("createLeadForm_generalStateProvinceGeoId");
		return this;		
	}
	
	public CreateLeadsPage selectstatename(String statename) {

		selectDropDownUsingText(elestatetName,statename);
		return this;		
	}

	@FindBy(how=How.NAME, using = "submitButton")
	private WebElement eleCreateLeadBtn;
@When ("click on submit button")
	public ViewLeadPage clickCreateLeadBtn() {

		click(eleCreateLeadBtn);
		return new ViewLeadPage();	
	}

}