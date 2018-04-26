package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="To create a new lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd, String cName, String fName, String lName,String countryname,String statename) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typelastName(lName)
		.selectcountryname(countryname)
		.waitstate()
		.selectstatename(statename)		
		.clickCreateLeadBtn()
		.verifyFirstName(fName);

	}
}