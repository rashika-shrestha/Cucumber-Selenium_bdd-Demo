package hooksdemosteps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoSteps {

    WebDriver driver;

    @Before(value = "@smoke", order = 1)
    public void browserOpen() {
        System.out.println("inside steps- chrome browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is: " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @Before(order = 1)
    public void setUp() {
        System.out.println("inside setup");
    }

    @BeforeStep
    public void beforeSteps() {
        System.out.println("-------inside before steps-----");
    }

    @AfterStep
    public void afterSteps() {
        System.out.println("-------inside after steps-----");
    }

    @Given("users is on login page")
    public void users_is_on_login_page() {
        System.out.println("inside steps--- users is on login page");
    }

    @When("users enters username and password")
    public void users_enters_username_and_password() {
        System.out.println("inside steps---users enters username and password");
    }

    @And("users clicks on login button")
    public void users_clicks_on_login_button() {
        System.out.println("inside steps---users clicks on login button");
    }

    @Then("users is navigated to home page")
    public void users_is_navigated_to_home_page() {
        System.out.println("inside steps---users is navigated to home page");
    }

    @After(order = 1)
    public void tearDown() {
        System.out.println("=======inside tear down =========");
        driver.close();
        driver.quit();
    }

    @After(order = 2)
    public void tearDown2() {
        System.out.println("=======inside tear down 2 =========");
    }
}
