package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='signin2']")
    WebElement signInButton;

    @FindBy(xpath = "//a[@id='login2']")
    WebElement logInButton;


    public void clickSignUpButton() {
        signInButton.click();
        Utils.waitInSeconds(1);
    }

    public void clickOnLogInButton() {
        logInButton.click();
        Utils.waitInSeconds(1);
    }


}
