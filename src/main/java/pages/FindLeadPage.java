package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH, using = "//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleFirstName;
	@And ("enter firstname in findlead as (.*)")
	public FindLeadPage typeFirstName(String firstName) {
		type(eleFirstName, firstName);
		return this;		
	}
	
	@FindBy(how=How.XPATH, using = "//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleLeadId;
	@And ("Type captured LeadID")
	public FindLeadPage typecapturedLeadID() {
		type(eleLeadId, firstResleadId);
		return this;		
	}
	@And ("type leadid in findlead as (.*)")
	public FindLeadPage typeLeadID(String leadID) {
		type(eleLeadId, leadID);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH, using = "(//div[@class= 'x-plain-body x-plain-body-noheader x-plain-body-noborder']/input)[13]")
	private WebElement elePhoneNum;
	@And ("Type Phone Number as (.*)")
	public FindLeadPage typePhoneNum(String phoneNum) {
		type(elePhoneNum, phoneNum);
		return this;		
	}
	@FindBy(how=How.XPATH, using = "(//span[@class='x-tab-strip-text '])[2]")
	private WebElement elePhoneTab;
	@And ("Click on Phone Tab")
	public FindLeadPage clickPhoneTab() {
		click(elePhoneTab);
		return this;	
	}
	
	@FindBy(how=How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadBtn;
    @And ("Click on FindLead button")
	public FindLeadPage clickFindLeadBtn() {
		click(eleFindLeadBtn);
		return this;	
	}
	
	@FindBy(how=How.XPATH,using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")
	private WebElement eleFirstcell;
	
	public FindLeadPage waitfirstcell() {
		WebWait("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]");
		return this;		
	}
	
//	public String getFirstcellname() {
//	  return getText(eleFirstcell);		
//	}
	@And ("Get LeadID")
	public String getFirstcellname() {
		firstResleadId =getText(eleFirstcell);
		return firstResleadId;
		}
	@And ("Click Firstcell")
	public ViewLeadPage clickFirstcell() {
		click(eleFirstcell);
		return new ViewLeadPage();	
	}
	@And ("click on firstresult cell in findlead")
	public MergeLeadPage clickFindFirstcell() {
		clickWithNoSnap(eleFirstcell);
		return new MergeLeadPage();	
	}
	@And ("switch to next window as (.*)")
	public FindLeadPage SwitchWindow (int index) {
		switchToWindow(index);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleErrMsg;
	@And ("get error message")
	public FindLeadPage getErrMsg() {
		getText(eleErrMsg);
		return this;		
	}
	@Then ("verify error Msg as (.*)")
	public FindLeadPage verifyErrMsg(String data) {
		verifyPartialText(eleErrMsg, data);
		return this;		
	}
	
	
	
	
	
	
	

}