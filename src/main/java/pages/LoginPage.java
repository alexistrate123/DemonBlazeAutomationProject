package pages;

import constants.Constants;
import constants.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class LoginPage extends HomePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputLogInCredentials() {
        this.driver.findElement(By.xpath(Constants.LOG_IN_USERNAME)).sendKeys(Constants.USER_NAME);
        this.driver.findElement(By.xpath(Constants.LOG_IN_PASSWORD)).sendKeys(Constants.PASSWORD);
        Utils.waitInSeconds(2);
    }

    public void clickOnPopUpLoginButton() {
        this.driver.findElement(By.xpath(Constants.POP_UP_LOG_IN_BUTTON)).click();
        Utils.waitInSeconds(2);
    }

}
