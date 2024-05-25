import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest {
    WebDriver driver;
    @Test
    public void logInTest() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        Utils.maximizeWindow(driver);
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        Utils.maximizeWindow(driver);
        driver.findElement(By.xpath(Constants.LOG_IN_BUTTON)).click();
        Utils.waitInSeconds(1);
        driver.findElement(By.xpath(Constants.LOG_IN_USERNAME)).sendKeys(Constants.USER_NAME);
        driver.findElement(By.xpath(Constants.LOG_IN_PASSWORD)).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath(Constants.LOG_IN_BUTTON2)).click();
        Utils.waitInSeconds(2);
        String actualMessage = driver.findElement(By.xpath(Constants.POP_UP_ALLERT_MESSAGE2)).getText();
        //String actualMessage = driver.findElement(By.cssSelector("#nameofuser")).getText();
        System.out.println(actualMessage);
        String expectedMessage = Constants.EXPECTED_MESSAGE_AFTER_SIGN_UP;
        Assert.assertTrue(actualMessage.contains(Constants.FIRST_WORD_IN_POP_UP));
    }
}
