package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class CartPage extends BasePage {


    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='cart.html']")
    WebElement cartButton;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    WebElement placeOrderButton;

    @FindBy(xpath ="//input[@id='name']")
    WebElement nameField;

    @FindBy(xpath ="//input[@id='country']")
    WebElement countryField;

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;

    @FindBy(xpath = "//input[@id='card']")
    WebElement creditCardField;

    @FindBy(xpath = "//input[@id='month']")
    WebElement monthField;

    @FindBy(xpath ="//input[@id='year']")
    WebElement yearField;

    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    WebElement purchaseButton;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    WebElement okButton;

    public void clickOnCartButton() {
        cartButton.click();
        Utils.waitInSeconds(2);
    }

    public void clickOnPlaceOrderButton() {
        placeOrderButton.click();
        Utils.waitInSeconds(2);
    }

    public void inputPlaceOrderCredentials() {
        nameField.sendKeys(Constants.NAME);
        countryField.sendKeys(Constants.COUNTRY);
        cityField.sendKeys(Constants.City);
        creditCardField.sendKeys(Constants.CREDIT_CARD);
        monthField.sendKeys(Constants.MONTH);
        yearField.sendKeys(Constants.YEAR);
        Utils.waitInSeconds(2);
    }

    public void clickOnPurchaseAndOkButton() {
        purchaseButton.click();
        Utils.waitInSeconds(2);
        okButton.click();
        Utils.waitInSeconds(2);
    }
}
