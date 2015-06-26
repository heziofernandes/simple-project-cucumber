package testexecution;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * 
 * @author Hezio D. Fernandes - QA Automation Engineer
 *
 *class execute feature in Portugues.
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@cadastro", format = { "pretty", "html:target/cucumber" }, monochrome = true, glue = "classpath:simpleproject/stepsdefinitions", features = "classpath:features")
public class TestRegistrationFormPt {
	
}
