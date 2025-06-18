package x.y.z.steps;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("x/y/z/steps")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME, value = "src/test/resources/features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "x.y.z.steps")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, 
    value = "html:build/cucumber-reports/cucumber-pretty.html")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, 
    value = "json:build/cucumber-reports/CucumberTestReport.json")
public class DeploymentSmokeTest {
}
