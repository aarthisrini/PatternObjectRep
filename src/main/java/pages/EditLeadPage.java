package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID, using = "updateLeadForm_companyName")
	private WebElement elenewcompnyName;
	@And ("type new companyname in editlead as (.*)")
	public EditLeadPage typeCompanyName(String companyName) {
		type(elenewcompnyName, companyName);
		return this;		
	}

	@FindBy(how=How.NAME, using = "submitButton")
	private WebElement eleupdateBtn;
	@When ("click on update button in editlead")
	public ViewLeadPage clickUpdateBtn() {
		click(eleupdateBtn);
		return new ViewLeadPage();	
	}
	
	
	
	
	
	
	
	
	

}