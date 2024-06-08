package pages;

import constants.Constants;
import constants.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='loginusername']")
    WebElement logInUsername;

    @FindBy(xpath = "//input[@id='loginpassword']")
    WebElement logInPassword;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    WebElement popUpLogInButton;

    public void inputLogInCredentials() {
        logInUsername.sendKeys(Constants.USER_NAME);
        logInPassword.sendKeys(Constants.PASSWORD);
        Utils.waitInSeconds(2);
    }

    public void clickOnPopUpLoginButton() {
        popUpLogInButton.click();
        Utils.waitInSeconds(2);
    }

}
