package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_OrageHRMComponents extends PageBase{
    // TODO: constructor to intailize webdriver
    public P02_OrageHRMComponents(WebDriver driver){
        super(driver);
    }
    // TODO: define locators using By
    private final By ADMIN_Button=By.xpath("//span[text()='Admin']");
    private final By PIM_Button=By.xpath("//span[text()='PIM']");
    private final By LEAVE_Button=By.xpath("//span[text()='Leave']");
    private final By TIME_Button=By.xpath("//span[text()='Time']");
    private final By RECRUITMENT_Button=By.xpath("//span[text()='Recruitment']");
    private final By MYINFO_Button=By.xpath("//span[text()='My Info']");
    private final By PERFORMANCE_Button=By.xpath("//span[text()='Performance']");
    private final By DASHBOARD_Button=By.xpath("//span[text()='Dashboard']");
    private final By DIRECTORY_Button=By.xpath("//span[text()='Directory']");
    private final By MAINTENANCE_Button=By.xpath("//span[text()='Maintenance']");
    private final By CLAIM_Button=By.xpath("//span[text()='Claim']");
    private final By BUZZ_Button=By.xpath("//span[text()='Buzz']");



    // TODO: public action methods
    public P02_OrageHRMComponents cLickOnAdminButton(){
        driver.findElement(this.ADMIN_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnPIMButton(){
        driver.findElement(this.PIM_Button).click();
        return this;
    }

    public P02_OrageHRMComponents cLickOnLeaveButton(){
        driver.findElement(this.LEAVE_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnTimeButton(){
        driver.findElement(this.TIME_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnRecruitmentButton(){
        driver.findElement(this.RECRUITMENT_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnMyInfoButton(){
        driver.findElement(this.MYINFO_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnPerformanceButton(){
        driver.findElement(this.PERFORMANCE_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnDashboardButton(){
        driver.findElement(this.DASHBOARD_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnDirectoryButton(){
        driver.findElement(this.DIRECTORY_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnMaintenanceButton(){
        driver.findElement(this.MAINTENANCE_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnClaimButton(){
        driver.findElement(this.CLAIM_Button).click();
        return this;
    }
    public P02_OrageHRMComponents cLickOnBuzzButton(){
        driver.findElement(this.BUZZ_Button).click();
        return this;
    }

}
