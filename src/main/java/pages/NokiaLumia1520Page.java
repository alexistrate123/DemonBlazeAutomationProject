package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class NokiaLumia1520Page extends HomePage{
    public NokiaLumia1520Page(WebDriver driver) {
        super(driver);
    }

    public void addToCartNokiaLumia1520() {
        this.driver.findElement(By.xpath(Constants.BUY_NOKIA_LUMIA_1520)).click();
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
