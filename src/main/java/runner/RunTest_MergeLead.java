package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/mergelead.feature",glue= {"steps","pages"})
public class RunTest_MergeLead {

}
