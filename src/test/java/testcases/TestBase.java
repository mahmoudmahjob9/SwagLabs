package testcases;

import common.MyScreenRecorder;
import drivers.DriverFactory;
import org.testng.annotations.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;
import static pages.PageBase.quitBrowser;
import static util.Utility.openBrowserNetworkTab;


public class TestBase {
    //   static   WebDriver driver;
    String username = "standard_user";
    String password = "secret_sauce";

    @BeforeSuite
    public void beforeSuite() throws Exception {
        MyScreenRecorder.startRecording("SwagLabs-TestCases");
    }

    @Parameters("browsername")
    @BeforeTest
    public void OpenBrower(@Optional String browsername) throws AWTException {
        setDriver(DriverFactory.getNewInstance(""));

        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        getDriver().get("https://www.saucedemo.com/v1/");

        // open browser network
        openBrowserNetworkTab();

    }

    @AfterTest
    public void TearDown() {
        //   quitBrowser(getDriver());
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        MyScreenRecorder.stopRecording();

    }
}
