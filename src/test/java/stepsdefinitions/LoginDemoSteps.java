package stepsdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

//    WebDriver driver;
//
//    @Given("chrome browser is open")
//    public void chrome_browser_is_open() {
//        System.out.println("inside steps- chrome browser is open");
//        String projectPath = System.getProperty("user.dir");
//        System.out.println("project path is: " + projectPath);
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @And("user is on login page")
//    public void user_is_on_login_page() throws InterruptedException {
//        System.out.println("inside steps- user is on login page");
//        driver.navigate().to("https://example.testproject.io/web/");
//        Thread.sleep(2000);
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//        System.out.println("inside steps- user enters username and password");
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(2000);
//    }
//
//    @When("user clicks on login button")
//    public void user_clicks_on_login_button() throws InterruptedException {
//        System.out.println("inside steps- user clicks on login button");
//        driver.findElement(By.id("login")).click();
//        Thread.sleep(2000);
//    }
//
//    @Then("user is navigated to home page")
//    public void user_is_navigated_to_home_page() throws InterruptedException {
//        System.out.println("inside steps- user is navigated to home page");
//        driver.findElement(By.id("logout")).isDisplayed();
//        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
//    }
}
