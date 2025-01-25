package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_OrageHRMComponents;

import static drivers.DriverHolder.getDriver;
import static pages.PageBase.captureScreenshot;

public class TC01_Login extends TestBase{




    @Test(priority = 1,description = "Login to OrageHRM With Valid Credientials")
    public void loginToOrangHRMWithValidCredientials_P() throws InterruptedException {
        new P01_LoginPage(getDriver()).enterUsername(loginUsername).enterPassword(loginPassword).clickLoginButton();


        // capture screenshot
        captureScreenshot(getDriver(),"LoginSuccessfully");

        // assertion
       Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));

//     new P02_OrageHRMComponents(getDriver().cLickOnAdminButton());
        new P02_OrageHRMComponents(getDriver()).cLickOnAdminButton();
        new P02_OrageHRMComponents(getDriver()).cLickOnPIMButton();
    }

}
