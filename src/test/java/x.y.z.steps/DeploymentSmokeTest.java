package x.y.z.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "x.y.z.steps",
    plugin = {
        "pretty",
        "html:build/cucumber-reports/cucumber-pretty.html",
        "json:build/cucumber-reports/CucumberTestReport.json"
    }
)
public class DeploymentSmokeTest {
}
