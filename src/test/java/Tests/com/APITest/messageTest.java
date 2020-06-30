package Tests.com.APITest;

import Pages.HomePage;
import Pages.LoginPage;
import Tests.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class messageTest extends TestBase {

    HomePage homePage;

    @BeforeClass
    public void setUpPage() {

        homePage=new HomePage(driver);
        driver.navigate().to("https://slack.com/signin");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void test1() throws InterruptedException {


//        Thread.sleep(500);
//        signPage.signPlace.sendKeys("techtorialbatch4");
//        signPage.continueButton.click();
//        homePage.emailButton.sendKeys("yusufaycck@gmail.com");
//        homePage.password.sendKeys("Ankara1974.");
//        homePage.signButton.click();
//
//        homePage.apiChannelButton.click();
//
//        homePage.messageButton.sendKeys("Test 12345...");
//        Actions actions=new Actions(driver);
//        actions.moveToElement(homePage.getLastMessage);
//




    }

}
