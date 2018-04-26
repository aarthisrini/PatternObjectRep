package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{

	public MergeLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using = "(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLeadBtn;
	@And ("Click on Mergefrom lead button")
	public FindLeadPage clickFromLeadBtn() {

		click(eleFromLeadBtn);
		return new FindLeadPage();	
	}
	
	@FindBy(how=How.XPATH, using = "(//img[@alt='Lookup'])[2]")
	private WebElement eleToLeadBtn;
	@And ("click on Mergeto lead button")
	public FindLeadPage clickToLeadBtn() {

		click(eleToLeadBtn);
		return new FindLeadPage();	
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	private WebElement eleMergeLead;
	@And ("click on Merge button")
	public MyLeadsPage clickMergeLeadbtn() {
		clickWithNoSnap(eleMergeLead);
		acceptAlert();
		return new MyLeadsPage();	
	}
	@And ("switch to originalwindow as (.*)")
	public MergeLeadPage SwitchWindowOrginal (int index) {
		switchToWindow(index);
		return this;
	}


}