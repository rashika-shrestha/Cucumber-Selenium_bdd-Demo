package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By txt_username = By.id("name");
    By txt_password = By.id("password");
    By btn_login = By.id("login");
    By btn_logout = By.id("logout");
    String url = "https://example.testproject.io/web/";

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser(){
        driver.navigate().to(url);
    }
    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void displayHomePage(){
        driver.findElement(btn_logout).isDisplayed();
    }

    public void login(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }

}
