package hooksdemosteps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/hooksdemo/hooksdemo.feature",
        glue = "hooksdemosteps"
)
public class HooksTestRunner {
}
