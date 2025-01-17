package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05_CheckoutStep2 extends PageBase {


    // TODO: constructor to intailize webdriver
    public P05_CheckoutStep2(WebDriver driver) {

        super(driver);
    }

    // TODO: define locators using By
    private final By FINISH_BUTTON = By.xpath("//a[@href='./checkout-complete.html']");
    private final By Total_Price = By.xpath("//div[@class='summary_subtotal_label']");

    public P05_CheckoutStep2 clickOnFinish(){
        driver.findElement(this.FINISH_BUTTON).click();
        return this;
    }
    public double gettextofTotal_Price(){
        String totalPrice = driver.findElement(this.Total_Price).getText().trim().replace("Item total: $", "");
        double Price= Double.parseDouble(totalPrice);
        return Price;
    }



}
