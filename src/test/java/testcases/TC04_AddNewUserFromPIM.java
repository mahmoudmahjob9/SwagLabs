package testcases;

import org.testng.annotations.Test;
import pages.*;

import static drivers.DriverHolder.getDriver;
import static util.Utility.*;

public class TC04_AddNewUserFromPIM extends TestBase{
    String createdPIMusername =generateRandomName(10);
    String employeeId = String.valueOf(generateRandomNumber(9999));
    @Test(priority = 1,description = "Add new User From Admin")
    public void AddNewPIMUserWithValidCredientials_P() throws InterruptedException {
        //login
        new P01_LoginPage(getDriver()).enterUsername(loginUsername).enterPassword(loginPassword).clickLoginButton();
        //clickOnPIMButton
        new P02_OrageHRMComponents(getDriver()).cLickOnPIMButton();
       //Click On add Button
        new P05_PIM(getDriver()).cLickOnPIMAddButton();
        //Enter first and middle and lastname
        new P06_AddEmployeeFromPIM(getDriver()).enterEmployeeFirstName(createdPIMusername)
                .enterEmployeeMiddleName(createdPIMusername).enterEmployeeLastName(createdPIMusername).enterPIMEmployeeID(employeeId)
                .clickONLoginDetailsToggle().enterPIMUesrName(createdPIMusername)
                .enterPIMPassword(loginPassword).enterCofirmPIMPassword(loginPassword)
                .clickONSaveButton();
        System.out.println(createdPIMusername);
        System.out.println(employeeId);
       // Click on PIM
        new P02_OrageHRMComponents(getDriver()).cLickOnPIMButton();
        Thread.sleep(5000);
        new P05_PIM(getDriver()).cLickOnPIMCollapseButton();
        //Search
        Thread.sleep(5000);
         new P05_PIM(getDriver()).enterPIMEmployeeNameText(createdPIMusername).clickONPIMSearchButton();
        //new P05_PIM(getDriver()).enterPIMEmployeeIDText(employeeId).clickONPIMSearchButton();
    }
    }
