package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    plugin = "json:target/jsonReports/cucumber-report.json",
    glue = "stepDefinations"
    //tags = "@DeletePlace"
)
public class TestRunner {
    // to integrate cucumber reports in your code, go to the link below and copy POM.xml code and add version as mentioned above
    // https://github.com/damianszczepanik/maven-cucumber-reporting
    // If we have multiple feature files, then add the feature file name too in cucumberOptions fearture path
}
