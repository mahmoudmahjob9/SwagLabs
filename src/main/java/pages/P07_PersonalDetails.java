package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P07_PersonalDetails extends PageBase{
    public P07_PersonalDetails(WebDriver driver){
        super(driver);
    }
    // TODO: define locators using By
    private final By FIRST_NAme = By.name("firstName");
}
