import constants.Constants;
import constants.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class EndToEndFrameworkTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        Utils.maximizeWindow(driver);
    }

    @AfterMethod
    public void closeDriver() {
        Utils.closeWindow(driver);
    }

    @Test
    public void endToEndFrameworkTest() {
        // LOGIN :

        HomePage homePage = new HomePage(driver);
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

        // BUY PRODUCTS :

        Utils.waitInSeconds(1);
        BuyProductsPage nokiaLumia1520Page = new BuyProductsPage(driver);
        nokiaLumia1520Page.addToCartNokiaLumia1520();
        String actualMessajeAddToCartButtonColor1 = driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).getCssValue("background-color");
        String expectedGreenColor1 = Constants.ADD_TO_CART_BUTTON_GREEN_COLOUR;
        Assert.assertEquals(actualMessajeAddToCartButtonColor1, expectedGreenColor1, ErrorMessages.GREEN_COLOUR_FROM_ADD_TO_CART_BUTTON_ERROR);
        nokiaLumia1520Page.addToCartButton();
        String actualMessage1 = Utils.getAlertMessage(driver);
        String expectedMessage = Constants.POP_UP_MESSAGE1;
        Assert.assertEquals(actualMessage1, expectedMessage);
        nokiaLumia1520Page.acceptAndReturnToHomePage();

        // Buy Nexus6;

        BuyProductsPage nexus6 = new BuyProductsPage(driver);
        nexus6.addToCartNexus6();
        String actualMessajeAddToCartButtonColor = driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).getCssValue("background-color");
        String expectedGreenColor = Constants.ADD_TO_CART_BUTTON_GREEN_COLOUR;
        Assert.assertEquals(actualMessajeAddToCartButtonColor, expectedGreenColor, ErrorMessages.GREEN_COLOUR_FROM_ADD_TO_CART_BUTTON_ERROR);
        nexus6.addToCartButton();
        String actualMessageNexus6 = Utils.getAlertMessage(driver);
        String expectedMessage1 = Constants.POP_UP_MESSAGE1;
        Assert.assertEquals(actualMessageNexus6, expectedMessage1);
        nexus6.acceptAndReturnToHomePage();

        //Buy Iphone6;

        BuyProductsPage iphone632Gb = new BuyProductsPage(driver);
        iphone632Gb.addToCartIphone632Gb();
        System.out.println();
        String actualMessajeAddToCartButtonColour = driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).getCssValue("background-color");
        String expectedGreenColour = Constants.ADD_TO_CART_BUTTON_GREEN_COLOUR;
        Assert.assertEquals(actualMessajeAddToCartButtonColour, expectedGreenColour, ErrorMessages.GREEN_COLOUR_FROM_ADD_TO_CART_BUTTON_ERROR);
        iphone632Gb.addToCartButton();
        String actualMessageIphone = Utils.getAlertMessage(driver);
        String expectedMessage2 = Constants.POP_UP_MESSAGE1;
        Assert.assertEquals(actualMessageIphone, expectedMessage2);
        iphone632Gb.acceptAlertMessage();

        //Cart;
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnCartButton();
        cartPage.clickOnPlaceOrderButton();
        cartPage.inputPlaceOrderCredentials();
        cartPage.clickOnPurchaseAndOkButton();

    }

}
