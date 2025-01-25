package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_OrageHRMComponents;
import pages.P03_Admin;
import pages.P04_AddNewUserFromAdmin;

import static drivers.DriverHolder.getDriver;
import static util.Utility.generateComplexPassword;
import static util.Utility.generateRandomName;

public class TC03_AddNewUserFromAdmin extends TestBase{
    // String employeeName =generateRandomName(10);
    String usernameCreated =generateRandomName(10);
    String userPassword=generateComplexPassword(10);

    @Test(priority = 1,description = "Add new User From Admin")
    public void AddNewUserWithValidCredientials_P() throws InterruptedException {
        new P01_LoginPage(getDriver()).enterUsername(loginUsername).enterPassword(loginPassword).clickLoginButton();
        //click on admin
        new P02_OrageHRMComponents(getDriver()).cLickOnAdminButton();
        //click on add button
         new P03_Admin(getDriver()).cLickOnAddButton();
         Thread.sleep(3000);
         // create new user
         new P04_AddNewUserFromAdmin(getDriver()).selectUserRole()
               .enterUserName(usernameCreated);
         Thread.sleep(3000);
                new P04_AddNewUserFromAdmin(getDriver()).selectStatus()
                 .enterEmployeeUserName()
                 .enterPassword(userPassword);
         //Thread.sleep(5000);
        new P04_AddNewUserFromAdmin(getDriver()).enterConfirmPassword(userPassword).clickOnSaveButton();

     //   new P04_AddNewUserFromAdmin(getDriver()).selectStatus().selectUserRole().enterUserName(usernameCreated).enterPassword(userPassword).enterConfirmPassword(userPassword);
       // new P04_AddNewUserFromAdmin(getDriver()).enterPassword(userPassword).enterConfirmPassword(userPassword);
         //search
        Thread.sleep(5000);
        new P03_Admin(getDriver()).cLickOnIconButton();

        new P03_Admin(getDriver()).enterUserName(usernameCreated).cLickOnSearchButton();
        Thread.sleep(5000);
        Assert.assertTrue(getDriver().getPageSource().contains("(1) Record Found"));


    }
}