import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {
    WebDriver driver;
    @Test
    public void signUpTest() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        Utils.maximizeWindow(driver);
        driver.findElement(By.xpath(Constants.SIGN_IN_BUTTON)).click();
        Utils.waitInSeconds(1);
        driver.findElement(By.xpath(Constants.USER_NAME_FIELD)).sendKeys(Constants.USER_NAME);
        driver.findElement(By.xpath(Constants.PASSWORD_FIELD)).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath(Constants.SIGN_UP_BUTTON)).click();
        Utils.waitInSeconds(2);
        String actualMassage = Utils.getAlertMessage(driver);
        String expectedMassage = Constants.POP_UP_MESSAGE;
        Assert.assertEquals(actualMassage, expectedMassage);
        Utils.acceptAlert(driver);
    }
}
