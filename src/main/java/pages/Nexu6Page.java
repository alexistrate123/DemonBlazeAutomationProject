package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class Nexu6Page extends HomePage {
    public Nexu6Page(WebDriver driver) {
        super(driver);
    }

    public void addToCartNexus6() {
        this.driver.findElement(By.xpath(Constants.BUY_NEXUS_6)).click();
        Utils.waitInSeconds(2);
    }

    public void acceptAndReturnToHomePage() {
        Utils.acceptAlert(driver);
        this.driver.findElement(By.xpath(Constants.HOME_BUTTON)).click();
        Utils.waitInSeconds(2);
    }

    public void addToCartButton() {
        this.driver.findElement(By.xpath(Constants.ADD_CART_BUTTON)).click();
        Utils.waitInSeconds(2);
    }
}
