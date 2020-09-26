package dms.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\VENKATRAMAN\\workspace\\greenDms\\src\\main\\java\\dms\\featuresfiles\\signUp.feature",
		glue={"dms.stepDefination"},
		monochrome=true,
		dryRun=false,
		strict=true
		
		
		)


public class Runner {

}
