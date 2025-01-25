package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  P03_Admin extends PageBase{
    public P03_Admin(WebDriver driver){
        super(driver);
    }
    // TODO: define locators using By
    private final By ADD_Button=By.xpath("//button[normalize-space()='Add']");
    private final By USERNAME_TEXT=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By SEARCH_Button=By.xpath("//button[@type='submit']");
    private final By ICON_Button=By.xpath("//button/i[@class='oxd-icon bi-caret-down-fill']");

    // TODO: public action methods
    public P03_Admin cLickOnAddButton(){
        driver.findElement(this.ADD_Button).click();
        return this;
    }

    public P03_Admin cLickOnIconButton(){
        driver.findElement(this.ICON_Button).click();
        return this;
    }

    public P03_Admin enterUserName(String name){
        driver.findElement(this.USERNAME_TEXT).sendKeys(name);
        return this;
    }
    public P03_Admin cLickOnSearchButton(){
        driver.findElement(this.SEARCH_Button).click();
        return this;
    }

}
