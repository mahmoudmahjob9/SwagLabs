package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_PIM extends PageBase{
    public P05_PIM(WebDriver driver){
        super(driver);
    }
    // TODO: define locators using By
    private final By ADD_BUTTON=By.xpath("(//button[@type='button'])[5]");
    private final By SEARCHEMPLOYEENAME_TEXT=By.xpath("//div/input[@placeholder='Type for hints...']");
    //private final By SEARCHEMPLOYEEID_TEXT=By.xpath("(//div[contains(@class, 'oxd-autocomplete-text-input')])[2]");
    private final By SEARCH_BUTTON=By.xpath("//button[@type='submit']");
    private final By COLLAPSE_BUTTON=By.xpath("//button/i[@class='oxd-icon bi-caret-down-fill']");

    public P05_PIM cLickOnPIMAddButton(){
        driver.findElement(this.ADD_BUTTON).click();
        return this;
    }
    public P05_PIM cLickOnPIMCollapseButton(){
        driver.findElement(this.COLLAPSE_BUTTON).click();
        return this;
    }

    public P05_PIM enterPIMEmployeeNameText(String name) {
//        if (name == null || name.trim().isEmpty()) {
//            throw new IllegalArgumentException("Employee name cannot be null or empty");
//        }
//
//        // Trim the name and get the first three characters
//        name = name.trim();
//        name = name.length() > 3 ? name.substring(0, 3) : name;
//
//        // Enter the processed name into the search field
        driver.findElement(this.SEARCHEMPLOYEENAME_TEXT).sendKeys(name);

        return this;
    }


    public P05_PIM clickONPIMSearchButton(){
        driver.findElement(this.SEARCH_BUTTON).click();
        return this;
    }



}
