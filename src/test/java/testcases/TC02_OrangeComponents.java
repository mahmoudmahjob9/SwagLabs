package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_OrageHRMComponents;
import pages.P03_Admin;

import static drivers.DriverHolder.getDriver;

public class TC02_OrangeComponents extends TestBase{
    @Test(priority = 1,description = "click Orane components")
    public void navigateBetweenComponentsOfOrangHRMWithValidCredientials_P() throws InterruptedException {
        new P01_LoginPage(getDriver()).enterUsername(loginUsername).enterPassword(loginPassword).clickLoginButton();

        new P02_OrageHRMComponents(getDriver()).cLickOnAdminButton();
        Thread.sleep(2000);
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"));
        new P02_OrageHRMComponents(getDriver()).cLickOnPIMButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"));
        new P02_OrageHRMComponents(getDriver()).cLickOnLeaveButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList"));
        new P02_OrageHRMComponents(getDriver()).cLickOnTimeButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet"));
        new P02_OrageHRMComponents(getDriver()).cLickOnRecruitmentButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates"));
        new P02_OrageHRMComponents(getDriver()).cLickOnMyInfoButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7"));
        new P02_OrageHRMComponents(getDriver()).cLickOnPerformanceButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchEvaluatePerformanceReview"));
        new P02_OrageHRMComponents(getDriver()).cLickOnDashboardButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
        new P02_OrageHRMComponents(getDriver()).cLickOnDirectoryButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory"));
        Thread.sleep(3000);
        new P02_OrageHRMComponents(getDriver()).cLickOnMaintenanceButton();
        getDriver().findElement(By.name("password")).sendKeys("admin123");
        getDriver().findElement(By.xpath("//button[contains(@class, 'oxd-button')][2]")).click();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/maintenance/purgeEmployee"));
        new P02_OrageHRMComponents(getDriver()).cLickOnClaimButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewAssignClaim"));
        new P02_OrageHRMComponents(getDriver()).cLickOnBuzzButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz"));



    }
}
