package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton() {
        this.driver.findElement(By.xpath(Constants.SIGN_IN_BUTTON)).click();
        Utils.waitInSeconds(1);
    }

    public void clickOnLogInButton() {
        this.driver.findElement(By.xpath(Constants.LOG_IN_BUTTON)).click();
        Utils.waitInSeconds(1);
    }
}
