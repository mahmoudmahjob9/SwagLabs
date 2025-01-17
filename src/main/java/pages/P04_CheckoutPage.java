package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_CheckoutPage extends PageBase{



    // TODO: constructor to intailize webdriver
    public P04_CheckoutPage(WebDriver driver) {

        super(driver);

    }

    // TODO: define locators using By
    private final By FIRSTNAME_TEXT = By.id("first-name");
    private final By LASTNAME_TEXT = By.id("last-name");
    private final By POSTAL_TEXT = By.id("postal-code");
    private final By CONTINUE_BUTTON = By.xpath("//input[@value='CONTINUE']");

    public P04_CheckoutPage enterFirstName(String firstName){
        driver.findElement(this.FIRSTNAME_TEXT).sendKeys(firstName);
        return this;
    }
    public P04_CheckoutPage enterLastName(String lastName){
        driver.findElement(this.LASTNAME_TEXT).sendKeys(lastName);
        return this;
    }
    public P04_CheckoutPage enterPostalCode(String postalCode){
        driver.findElement(this.POSTAL_TEXT).sendKeys(postalCode);
        return this;
    }
    public P04_CheckoutPage clickOnContinue(){
        driver.findElement(this.CONTINUE_BUTTON).click();
        return this;
    }
}
