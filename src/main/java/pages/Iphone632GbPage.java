package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class Iphone632GbPage extends HomePage {

    public Iphone632GbPage(WebDriver driver) {
        super(driver);
    }

    public void addToCartIphone632Gb() {
        this.driver.findElement(By.xpath(Constants.BUY_IPHONE_6)).click();
        Utils.waitInSeconds(2);
    }

    public void addToCartButton() {
        this.driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).click();
        Utils.waitInSeconds(2);
    }

    public void acceptAlertMessage() {
        Utils.acceptAlert(driver);
    }

}
