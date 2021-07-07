package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_PF {


    @FindBy(id = "logout")
    WebElement btn_logout;
    WebDriver driver;

    public HomePage_PF(WebDriver driver){
        this.driver = driver;
    }

    public void isHomePageDisplayed(){
        btn_logout.isDisplayed();
    }
}
