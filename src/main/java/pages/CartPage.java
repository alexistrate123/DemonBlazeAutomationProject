package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class CartPage extends HomePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCartButton() {
        this.driver.findElement(By.xpath(Constants.CART_BUTTON)).click();
        Utils.waitInSeconds(2);
    }

    public void clickOnPlaceOrderButton() {
        this.driver.findElement(By.xpath(Constants.PLACE_ORDER_BUTTON)).click();
        Utils.waitInSeconds(2);
    }

    public void inputPlaceOrderCredentials() {
        this.driver.findElement(By.xpath(Constants.NAME_FIELD)).sendKeys(Constants.NAME);
        this.driver.findElement(By.xpath(Constants.COUNTRY_FIELD)).sendKeys(Constants.COUNTRY);
        this.driver.findElement(By.xpath(Constants.CITY_FIELD)).sendKeys(Constants.City);
        this.driver.findElement(By.xpath(Constants.CREDIT_CARD_FIELD)).sendKeys(Constants.CREDIT_CARD);
        this.driver.findElement(By.xpath(Constants.MONTH_FIELD)).sendKeys(Constants.MONTH);
        this.driver.findElement(By.xpath(Constants.YEAR_FIELD)).sendKeys(Constants.YEAR);
        Utils.waitInSeconds(2);
    }

    public void clickOnPurchaseAndOkButton() {
        this.driver.findElement(By.xpath(Constants.PURCHASE_BUTTON)).click();
        Utils.waitInSeconds(2);
        this.driver.findElement(By.xpath(Constants.OK_BUTTON)).click();
        Utils.waitInSeconds(2);
    }
}
