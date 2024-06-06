import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;
import utils.Utils;

public class SignUpTest extends BaseTest {

    @Test
    public void signUpTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpButton();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputCredentials();
        signUpPage.clickOnPopUpSignUpButton();
        String actualMassage = Utils.getAlertMessage(driver);
        String expectedMassage = Constants.POP_UP_MESSAGE;
        Assert.assertEquals(actualMassage, expectedMassage);
        Utils.acceptAlert(driver);
    }
}
