package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{



	@BeforeTest
	public void setData() {
		testCaseName="TC006_DeleteLead";
		testDescription="To Delete a created lead";
		testNodes="Leads";
		category="Smoke";
		authors="Aarthi";
		browserName="chrome";
		dataSheetName="TC006";
	}

	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName, String pwd,String cName,String fName, String lName,String phoneNum,String errMsg) {
		//method 2
		//		FindLeadPage flp=new LoginPage()
		//		.enterUserName(uName)
		//		.enterPassword(pwd)
		//		.clickLogIn()
		//		.clickCRMSFA()
		//		.clickLeads()
		//		.clickCreateLeads()
		//		.typeCompanyName(cName)
		//		.typeFirstName(fName)
		//		.typelastName(lName)
		//		.typePhoneNum(phoneNum)
		//		.clickCreateLeadBtn()
		//		.clickFindLeadLink()
		//		.clickPhoneTab()
		//		.typePhoneNum(phoneNum)
		//		.clickFindLeadBtn()
		//		.waitfirstcell();
		//		String firstcellname = flp.getFirstcellname();
		//		flp.clickFirstcell()
		//		.clickDelLeadBtn()
		//		.clickFindLeads()
		//		.typeLeadID(firstcellname)
		//		.clickFindLeadBtn()
		//		.getErrMsg()
		//		.verifyErrMsg(errMsg);
		//method1
		FindLeadPage flp=new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typelastName(lName)
		.typePhoneNum(phoneNum)
		.clickCreateLeadBtn()
		.clickFindLeadLink()
		.clickPhoneTab()
		.typePhoneNum(phoneNum)
		.clickFindLeadBtn()
		.waitfirstcell();
		firstResleadId=flp.getFirstcellname();
		flp.clickFirstcell()
		.clickDelLeadBtn()
		.clickFindLeads()
		.typecapturedLeadID()
		.clickFindLeadBtn()
		.getErrMsg()
		.verifyErrMsg(errMsg);

	}
}