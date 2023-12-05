package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\SeleniumEcl\\workspace\\CucumberFW\\src\\main\\java\\features"
		,glue= {"stepDefinitions"}
		,dryRun=false
		,plugin = {"pretty", "json:target/myReports/report.json", "junit:target/myReports/report.xml"}
	
		
		
		)

public class TestRunner {

}
