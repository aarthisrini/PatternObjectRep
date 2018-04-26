package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	@Then ("Verify the name of the created lead as (.*)")
	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(eleFirstName, data);
		return this;		
	}
	@And ("verify the viewlead title as (.*)")
	public ViewLeadPage verifytitle(String data) {
		verifyTitle(data);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Edit")
	private WebElement eleEditLeadBtn;
	@And ("click on Editlead button")
	public EditLeadPage clickEditLeadBtn() {

		click(eleEditLeadBtn);
		return new EditLeadPage();	
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Delete")
	private WebElement eleDelLeadBtn;
	@And ("Click DeleteLead Btn")
	public MyLeadsPage clickDelLeadBtn() {

		click(eleDelLeadBtn);
		return new MyLeadsPage();	
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyname;
	@Then ("verify newcompany in viewlead as (.*)")
	public ViewLeadPage verifyCompanyName(String data) {
		verifyPartialText(eleCompanyname, data);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindLeadLink;
	@And ("click on findlead btn in viewlead")
	public FindLeadPage clickFindLeadLink() {

		click(eleFindLeadLink);
		return new FindLeadPage();	
	}

}