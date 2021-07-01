package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("inside steps- browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is: " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("inside steps- user is on Google search page");
        driver.navigate().to("https://google.com");
    }


    @When("user enters with search key")
    public void user_enters_with_search_key() {
        System.out.println("inside steps- user enters with search key");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("java");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("inside steps- hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated search result page")
    public void user_is_navaigated_search_result_page() {
        System.out.println("inside steps- user is navigated search result page");
        driver.getPageSource().contains("Download Java for Windows");
        driver.close();
        driver.quit();
    }
}
