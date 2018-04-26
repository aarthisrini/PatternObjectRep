package steps;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
@Before
	public void before(Scenario sc ) {
		startResult();
		startTestModule(sc.getId(), sc.getName());	
		test = startTestCase("Lead");
		test.assignCategory("Regression");
		test.assignAuthor("Aarthi");
		startApp("chrome");
	}
@After
	public void after() {
		endResult();
		closeAllBrowsers();
	}
}
