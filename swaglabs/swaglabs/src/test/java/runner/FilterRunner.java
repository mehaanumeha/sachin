package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={".//Feature//first.feature"}, 

          glue= {"codecucumber"} ,
       monochrome=true,
       dryRun=false,

   plugin={"pretty","html: target/test-output"}



)

public class FilterRunner {

}
