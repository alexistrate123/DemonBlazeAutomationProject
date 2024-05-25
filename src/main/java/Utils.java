import org.openqa.selenium.WebDriver;

public class Utils {
    // UTILE
    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void acceptAlert(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    public static void dismissAlert(WebDriver driver) {
        driver.switchTo().alert().dismiss();
    }

    public static String getAlertMessage(WebDriver driver) {
       return driver.switchTo().alert().getText();
    }

    public static void sendKeys(WebDriver driver, String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public static void maximizeWindow(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void closeWindow(WebDriver driver) {
        driver.close();
    }
}
