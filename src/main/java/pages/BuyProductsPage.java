package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class BuyProductsPage extends BasePage{


    public BuyProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//img[@src='imgs/Lumia_1520.jpg']")
    WebElement buyNokiaLumia1520;

    @FindBy(xpath ="//li[@class='nav-item active']")
    WebElement homeButton;

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    WebElement addToCartButton;

    @FindBy(xpath = "//img[@src='imgs/iphone_6.jpg']")
    WebElement iphone6;

    @FindBy(xpath = "//img[@src='imgs/Nexus_6.jpg']")
    WebElement nexus6;

    public void addToCartNokiaLumia1520() {
        buyNokiaLumia1520.click();
        Utils.waitInSeconds(2);
    }

    public void acceptAndReturnToHomePage() {
        Utils.acceptAlert(driver);
        homeButton.click();
        Utils.waitInSeconds(2);
    }

    public void addToCartButton() {
        addToCartButton.click();
        Utils.waitInSeconds(2);
    }

    public void addToCartIphone632Gb() {
        iphone6.click();
        Utils.waitInSeconds(2);
    }



    public void acceptAlertMessage() {
        Utils.acceptAlert(driver);
    }

    public void addToCartNexus6() {
        nexus6.click();
        Utils.waitInSeconds(2);
    }



}
