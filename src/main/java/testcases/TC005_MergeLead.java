package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="To merge two  a created lead";
		testNodes="Leads";
		category="Smoke";
		authors="Aarthi";
		browserName="chrome";
		dataSheetName="TC005";
	}

	@Test(dataProvider="fetchData")
	public void MergeLead(String uName, String pwd,String LeadId1,String LeadId2, String ErrMsg) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		
		.clickFromLeadBtn()
		.SwitchWindow(2)
		.typeLeadID(LeadId1)
		.clickFindLeadBtn()
		.waitfirstcell()
		.clickFindFirstcell()
		.SwitchWindowOrginal(0)
		
		.clickToLeadBtn()
		.SwitchWindow(2)
		.typeLeadID(LeadId2)
		.clickFindLeadBtn()
		.waitfirstcell()
		.clickFindFirstcell()
		.SwitchWindowOrginal(0)
		
		.clickMergeLeadbtn()
		.clickFindLeads()
		.typeLeadID(LeadId1)
		.clickFindLeadBtn()
		.getErrMsg()
		.verifyErrMsg(ErrMsg);
		

	}
}