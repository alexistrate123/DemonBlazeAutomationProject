import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.Utils;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        Utils.maximizeWindow(driver);
    }
    @AfterMethod
    public void closeWindow() {
        Utils.closeWindow(driver);
    }


}
