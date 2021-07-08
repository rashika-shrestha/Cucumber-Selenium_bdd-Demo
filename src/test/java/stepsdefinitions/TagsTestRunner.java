package stepsdefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/tags.feature",
        glue = "stepsdefinitions",
        tags = "@featuredemo"
)
public class TagsTestRunner {
}
