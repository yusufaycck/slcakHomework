package Tests;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class TestBase {



    public static WebDriver driver;
    public static SoftAssert softAssert;

    @Parameters("driverName")
    @BeforeTest(alwaysRun = true)
    public static void setUp(String driverName) {


        softAssert = new SoftAssert();
        driver = Driver.getDriver(driverName);
        driver.manage().window().maximize();


    }
}