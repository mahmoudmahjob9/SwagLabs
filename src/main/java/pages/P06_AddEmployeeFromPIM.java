package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_AddEmployeeFromPIM extends PageBase {
    public P06_AddEmployeeFromPIM(WebDriver driver){
        super(driver);
    }
    // TODO: define locators using By
    private final By FIRST_NAme = By.name("firstName");
    private final By MIDDLE_NAME = By.name("middleName");
    private final By LAST_NAME = By.name("lastName");
    private final By EMPLOYEEID_TEXT = By.xpath("(//input[contains(@class, 'oxd-input')])[5]");
    private final By LOGINTOGELDETAILS_Button = By.xpath("//span[contains(@class, 'oxd-switch-input')]");
    private final By USERNAMEPIM_TEXT = By.xpath("(//input[contains(@class, 'oxd-input')])[6]");
    private final By PASSWIRDPIM_TEXT = By.xpath("(//input[@type='password'])[1]");
    private final By CONFIRMPASSWIRDPIM_TEXT = By.xpath("(//input[@type='password'])[2]");
    private final By SAVE_BUTTON = By.xpath("//button[@type='submit']");


    public P06_AddEmployeeFromPIM enterEmployeeFirstName(String name){
        driver.findElement(FIRST_NAme).sendKeys(name);
        return this;
    }
    public P06_AddEmployeeFromPIM enterEmployeeMiddleName(String name){
        driver.findElement(MIDDLE_NAME).sendKeys(name);
        return this;
    }
    public P06_AddEmployeeFromPIM enterEmployeeLastName(String name){
        driver.findElement(LAST_NAME).sendKeys(name);
        return this;
    }
    public P06_AddEmployeeFromPIM clickONLoginDetailsToggle(){
        driver.findElement(LOGINTOGELDETAILS_Button).click();
        return this;
    }
    public P06_AddEmployeeFromPIM clickONSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
        return this;
    }
    public P06_AddEmployeeFromPIM enterPIMUesrName(String name){
        driver.findElement(USERNAMEPIM_TEXT).sendKeys(name);
        return this;
    }
    public P06_AddEmployeeFromPIM enterPIMPassword(String name){
        driver.findElement(PASSWIRDPIM_TEXT).sendKeys(name);
        return this;
    }
    public P06_AddEmployeeFromPIM enterPIMEmployeeID(String employeeId){
        driver.findElement(EMPLOYEEID_TEXT).clear();
        driver.findElement(EMPLOYEEID_TEXT).sendKeys(employeeId);
        return this;
    }
    public P06_AddEmployeeFromPIM enterCofirmPIMPassword(String name){
        driver.findElement(CONFIRMPASSWIRDPIM_TEXT).sendKeys(name);
        return this;
    }

}
