package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class LoginPage_PF {

    @FindBy(id = "name")
//    @CacheLookup
    WebElement txt_username;
    @FindBy(id = "password")
    WebElement txt_password;
    @FindBy(id = "login")
    WebElement btn_login;
    WebDriver driver;

    @FindBy(how = How.ID, using = "name")
    WebElement abc;

    @FindBy(partialLinkText = "rashi")
    List<WebElement> elements;

    String url = "https://example.testproject.io/web/";

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this);
//        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 40);
//        PageFactory.initElements(factory, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40),this);
    }

    public void openBrowser() {
        driver.navigate().to(url);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void clickLogin() {
        btn_login.click();
    }
}
