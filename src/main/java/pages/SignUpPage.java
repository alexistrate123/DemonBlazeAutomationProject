package pages;
import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class SignUpPage extends HomePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputCredentials() {
        this.driver.findElement(By.xpath(Constants.USER_NAME_FIELD)).sendKeys(Constants.USER_NAME);
        this.driver.findElement(By.xpath(Constants.PASSWORD_FIELD)).sendKeys(Constants.PASSWORD);
    }

    public void clickOnPopUpSignUpButton() {
        this.driver.findElement(By.xpath(Constants.POP_UP_SIGN_UP_BUTTON)).click();
        Utils.waitInSeconds(2);
    }
}
