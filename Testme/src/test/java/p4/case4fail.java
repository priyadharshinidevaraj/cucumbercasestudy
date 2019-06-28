package p4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,tags= {"@pass"},plugin= {"pretty","html:payement report"})

public class case4fail {

}
