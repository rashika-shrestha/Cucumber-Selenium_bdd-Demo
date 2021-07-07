package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_PF {

    WebDriver driver;
    LoginPage_PF loginPage;
    HomePage_PF home;


    @Given("chrome browser is open")
    public void chrome_browser_is_open() {
        System.out.println("=========inside LoginDemoSteps_PF=========");
        System.out.println("inside steps- chrome browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is: " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage_PF(driver);
    }

    @And("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        System.out.println("inside steps- user is on login page");
        loginPage.openBrowser();
        Thread.sleep(2000);
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        System.out.println("inside steps- user enters username and password");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        Thread.sleep(2000);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        System.out.println("inside steps- user clicks on login button");
        loginPage.clickLogin();
        Thread.sleep(2000);
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() throws InterruptedException {
        System.out.println("inside steps- user is navigated to home page");
        home = new HomePage_PF(driver);
        home.isHomePageDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
