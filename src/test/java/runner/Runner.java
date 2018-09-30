package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = {"src/test/java/features"},
				glue = {"steps"}
)
@RunWith(Cucumber.class)
public class Runner {

}
