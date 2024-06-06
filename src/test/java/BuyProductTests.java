import constants.Constants;
import constants.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.Iphone632GbPage;
import pages.Nexu6Page;
import pages.NokiaLumia1520Page;
import utils.Utils;

public class BuyProductTests {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        Utils.maximizeWindow(driver);
        Utils.waitInSeconds(1);
    }

    @AfterMethod
    public void closeDriver() {
        Utils.closeWindow(driver);
    }

    @Test
    public void buyProductsTest() {
        //Buy Nokia Lumia 1520;

        NokiaLumia1520Page nokiaLumia1520Page = new NokiaLumia1520Page(driver);
        nokiaLumia1520Page.addToCartNokiaLumia1520();
        String actualMessajeAddToCartButtonColor1 = driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).getCssValue("background-color");
        String expectedGreenColor1 = Constants.ADD_TO_CART_BUTTON_GREEN_COLOUR;
        Assert.assertEquals(actualMessajeAddToCartButtonColor1, expectedGreenColor1, ErrorMessages.GREEN_COLOUR_FROM_ADD_TO_CART_BUTTON_ERROR);
        nokiaLumia1520Page.addToCartButton();
        String actualMessage = Utils.getAlertMessage(driver);
        String expectedMessage = Constants.POP_UP_MESSAGE1;
        Assert.assertEquals(actualMessage, expectedMessage);
        nokiaLumia1520Page.acceptAndReturnToHomePage();

        // Buy Nexus6;

        Nexu6Page nexu6Page = new Nexu6Page(driver);
        nexu6Page.addToCartNexus6();
        String actualMessajeAddToCartButtonColor = driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).getCssValue("background-color");
        String expectedGreenColor = Constants.ADD_TO_CART_BUTTON_GREEN_COLOUR;
        Assert.assertEquals(actualMessajeAddToCartButtonColor, expectedGreenColor, ErrorMessages.GREEN_COLOUR_FROM_ADD_TO_CART_BUTTON_ERROR);
        nexu6Page.addToCartButton();
        String actualMessage1 = Utils.getAlertMessage(driver);
        String expectedMessage1 = Constants.POP_UP_MESSAGE1;
        Assert.assertEquals(actualMessage1, expectedMessage1);
        nexu6Page.acceptAndReturnToHomePage();

        //Buy Iphone6;

        Iphone632GbPage iphone632GbPage = new Iphone632GbPage(driver);
        iphone632GbPage.addToCartIphone632Gb();
        System.out.println();
        String actualMessajeAddToCartButtonColour = driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).getCssValue("background-color");
        String expectedGreenColour = Constants.ADD_TO_CART_BUTTON_GREEN_COLOUR;
        Assert.assertEquals(actualMessajeAddToCartButtonColour, expectedGreenColour, ErrorMessages.GREEN_COLOUR_FROM_ADD_TO_CART_BUTTON_ERROR);
        iphone632GbPage.addToCartButton();
        String actualMessage2 = Utils.getAlertMessage(driver);
        String expectedMessage2 = Constants.POP_UP_MESSAGE1;
        Assert.assertEquals(actualMessage2, expectedMessage2);
        iphone632GbPage.acceptAlertMessage();

        //Cart;

        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnCartButton();
        cartPage.clickOnPlaceOrderButton();
        cartPage.inputPlaceOrderCredentials();
        cartPage.clickOnPurchaseAndOkButton();

    }



}
