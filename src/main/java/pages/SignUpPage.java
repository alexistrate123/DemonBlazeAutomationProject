package pages;
import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class SignUpPage extends BasePage {


    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@onclick='register()']")
    WebElement popUpSignUpButton;

    public void inputCredentials() {
        userNameField.sendKeys(Constants.USER_NAME);
        passwordField.sendKeys(Constants.PASSWORD);
    }

    public void clickOnPopUpSignUpButton() {
        popUpSignUpButton.click();
        Utils.waitInSeconds(2);
    }
}
