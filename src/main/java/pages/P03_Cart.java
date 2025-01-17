package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_Cart extends PageBase {



    // TODO: constructor to intailize webdriver
    public P03_Cart(WebDriver driver) {

        super(driver);

    }

    // TODO: define locators using By
    private final By CHECKOUT_BUTTON = By.xpath("//a[@href='./checkout-step-one.html']");

    public P03_Cart clickOnCheckoutButton() {
        driver.findElement(this.CHECKOUT_BUTTON).click();
        return this;
    }
}
