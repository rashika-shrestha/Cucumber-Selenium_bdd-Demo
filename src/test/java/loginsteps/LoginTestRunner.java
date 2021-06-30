package loginsteps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "loginsteps",
        monochrome = true,
        plugin = {
                "pretty", "html:target/htmlreports/reports.html",
                "pretty", "json:target/jsonreports/reports.json",
                "pretty", "junit:target/xmlreports/reports.xml"
        }

)
public class LoginTestRunner {
}
