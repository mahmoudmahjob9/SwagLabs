package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P02_Inventory extends PageBase {
    // TODO: define webdriver


    // TODO: constructor to intailize webdriver
    public P02_Inventory(WebDriver driver) {
        super(driver);

    }


    // TODO: define locators using By
    private final By SHOPPING_BUTTON = By.xpath("//a[@href='./cart.html']");
    private final By ADDTOCARD_BUTTON = By.xpath("(//div[@class='inventory_item']//button)");
    // private final By ITEM_Price = By.xpath("(//div[@class='inventory_item_price'])['+index+']");
    private final By ITEM_Price = By.xpath("//div[@class='inventory_item_price']");
    // TODO: public action methods
    public P02_Inventory clickShoppingCardButton() {
        driver.findElement(this.SHOPPING_BUTTON).click();

        return this;

    }
    public P02_Inventory clickAddToCardButton(int index) {
        List<WebElement> addToCartButtons = driver.findElements(ADDTOCARD_BUTTON);
        addToCartButtons.get(index).click();
        return this;
    }
    public double getPrice(int index) {

        List<WebElement> price = driver.findElements(ITEM_Price);
        String priceforitem = price.get(index).getText().trim().replace("$", "");
        double pr= Double.parseDouble(priceforitem);
        return pr;
    }

}