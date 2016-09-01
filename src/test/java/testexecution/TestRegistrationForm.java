package testexecution;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@registration" }, format = { "pretty",
		"html:target/cucumber" }, monochrome = true, glue = "classpath:simpleproject/stepsdefinitions", features = "classpath:features")
public class TestRegistrationForm {

}
