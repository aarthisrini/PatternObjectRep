package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
//import wdMethods.SeMethods;

public class MyLeadsPage extends ProjectMethods{

	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT, using = "Create Lead")
	private WebElement eleCreateLead;
	@And ("click on create lead")
	public CreateLeadsPage clickCreateLeads() {
		click(eleCreateLead);
		return new CreateLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindLead;
	@And ("Click on Findlead Link in Mylead")
	public FindLeadPage clickFindLeads() {
		click(eleFindLead);
		return new FindLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Merge Leads")
	private WebElement eleMergeLead;
	@And ("click on mergelead button")
	public MergeLeadPage clickMergeLeads() {
		click(eleMergeLead);
		return new MergeLeadPage();
	}
	
}