package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static util.Utility.generateRandomName;
import static util.Utility.generateRandomNumber;

public class P04_AddNewUserFromAdmin extends PageBase{

    public P04_AddNewUserFromAdmin(WebDriver driver){
        super(driver);
    }

    // TODO: define locators using By
    private final By SELECT_USER_ROLE=By.xpath("(//div[text()='-- Select --'])[1]");
    private final By EMPLOYEE_NAME=By.xpath("//input[@placeholder='Type for hints...']");
    private final By STATUS=By.xpath("(//div[text()='-- Select --'])[1]");
    private final By USER_Name=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By PASSWORD=By.xpath("(//input[@type='password'])[1]");
    private final By CONFIRM_PASSWORD=By.xpath("(//input[@type='password'])[2]");
    private final By SAVE_Button=By.xpath("//button[@type='submit']");

    // TODO: public action methods
    public P04_AddNewUserFromAdmin selectUserRole() throws InterruptedException {
        driver.findElement(SELECT_USER_ROLE).click();
        List<WebElement> dro = driver.findElements(By.xpath("//div[@role='option']"));//listbox
       int x = generateRandomNumber(2);
       //x = 2 ;
       Thread.sleep(2000);
        System.out.println(x);

        dro.get(x).click();



        return this;

    }

//    public static void selectByText(WebDriver driver, By locator, String textToSelect) {
//        // Wait for the autocomplete suggestions to appear
//       // WebDriverWait wait = new WebDriverWait(driver,); // Adjust timeout as needed
//        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//
//        // Find all the suggested options
//        List<WebElement> options = driver.findElements(locator);
//
//        // Iterate through the options and select the one matching the text
//        for (WebElement option : options) {
//            if (option.getText().equals(textToSelect)) {
//                option.click();
//                break; // Exit the loop after selecting the option
//            }
//        }
//    }


    public P04_AddNewUserFromAdmin enterEmployeeUserName() throws InterruptedException {
       driver.findElement(EMPLOYEE_NAME).sendKeys("a");
       Thread.sleep(2000);

        List<WebElement> dro = driver.findElements(By.xpath("//div[@role='option']"));//listbox
        int x = generateRandomNumber(2);
        //x = 2 ;
        Thread.sleep(2000);
        System.out.println(x);

        dro.get(x).click();
       return this;
    }

    public P04_AddNewUserFromAdmin selectStatus(){
        driver.findElement(STATUS).click();
        List<WebElement> dro = driver.findElements(By.xpath("//div[@role='option']"));
        int x = generateRandomNumber(2);
        //x = 1 ;
//        Thread.sleep(2000);
        System.out.println(x);

        dro.get(x).click();
        return this;
    }
    public P04_AddNewUserFromAdmin enterUserName(String name){
        // String username =generateRandomName(10);
        driver.findElement(USER_Name).sendKeys(name);
        return this;
    }
    public P04_AddNewUserFromAdmin enterPassword(String pass) throws InterruptedException {
        driver.findElement(PASSWORD).sendKeys(pass);
        Thread.sleep(3000);
        return this;

    }
    public P04_AddNewUserFromAdmin enterConfirmPassword(String pass){
        driver.findElement(CONFIRM_PASSWORD).sendKeys(pass);
        return this;
    }
    public P04_AddNewUserFromAdmin clickOnSaveButton(){
        driver.findElement(SAVE_Button).click();
        return this;
    }
}
