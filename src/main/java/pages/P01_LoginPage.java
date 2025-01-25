package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_LoginPage extends PageBase {

    // TODO: define webdriver


    // TODO: constructor to intailize webdriver
    public P01_LoginPage(WebDriver driver){
        super(driver);
    }

    // TODO: define locators using By
    private final By USERNAME_TEXT=By.name("username");
    private final By PASSWORD_TEXT=By.name("password");
    private final By LOGIN_BUTTON=By.xpath("//button[@type='submit']");

    // TODO: public action methods
    public P01_LoginPage enterUsername(String username){
        driver.findElement(this.USERNAME_TEXT).sendKeys(username);
        return this;
    }
    public P01_LoginPage enterPassword(String password){
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return this;
    }
    public P01_LoginPage clickLoginButton(){
        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }

}
