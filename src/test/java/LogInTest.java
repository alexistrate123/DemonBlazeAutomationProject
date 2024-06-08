import constants.Constants;
import constants.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.Utils;

public class LogInTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        Utils.maximizeWindow(driver);
    }

    @AfterMethod
    public void closeDriver() {
        utils.Utils.closeWindow(driver);
    }

    @Test
    public void logInTest() {
        HomePage homePage = new HomePage(driver);
        System.out.println();
        homePage.clickOnLogInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLogInCredentials();
        loginPage.clickOnPopUpLoginButton();
        System.out.println();
        String actualMessajePopUpLoginButton = driver.findElement(By.xpath(Constants.POP_UP_LOG_IN_BUTTON)).getCssValue("background-color");
        String expectedColour = Constants.POP_UP_LOG_IN_BUTTON_BLUE_COLOUR;
        Assert.assertEquals(actualMessajePopUpLoginButton, expectedColour, ErrorMessages.BLUE_COLOUR_FROM_POP_UP_LOG_IN_BUTTON_ERROR);
        String actualMessage = driver.findElement(By.xpath(Constants.POP_UP_ALLERT_MESSAGE2)).getText();
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage.contains(Constants.FIRST_WORD_IN_POP_UP), ErrorMessages.WELCOME_MESSAGE_NOT_DISPLAYED_ERROR);

    }
}
