package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="To EEdit a created lead";
		testNodes="Leads";
		category="Smoke";
		authors="Aarthi";
		browserName="chrome";
		dataSheetName="TC004";
	}

	@Test(dataProvider="fetchData")
	public void EditLead(String uName, String pwd,String newcmpyname,String fName, String title) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLeadBtn()
		.waitfirstcell()
		.clickFirstcell()
		.verifytitle(title)
		.clickEditLeadBtn()
		.typeCompanyName(newcmpyname)
		.clickUpdateBtn()
		.verifyCompanyName(newcmpyname);

	}
}