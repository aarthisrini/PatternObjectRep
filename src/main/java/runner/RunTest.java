package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/login.feature",glue= {"steps","pages"},tags= {"@smoke,@Regression"})
public class RunTest {

}
