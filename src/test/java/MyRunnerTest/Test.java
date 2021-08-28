package MyRunnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E:\\AutomationProjects\\Sample\\Features\\login.feature"
        , glue = {"StepDef", "Config"},
        dryRun = false,
        monochrome = true)

public class Test {

}
