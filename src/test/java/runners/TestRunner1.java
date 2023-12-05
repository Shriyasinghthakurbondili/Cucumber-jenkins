package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\lokes\\eclipse-workspace\\CucumberTest1\\src\\test\\resources\\features\\Login7.feature",
		glue= {"steps"},
		plugin = {"pretty", "html:target/cucumber-reports"}

				          
		
		)

public class TestRunner1 {

}
