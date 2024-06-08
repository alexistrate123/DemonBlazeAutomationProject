package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    // Pentru a putea folosi variabilele de tip WebElement trebuie sa aplicam PageFactory in constructorul fiecarei clase care declara WebElements;
    /*
    Converted id/class to css (DOM);

   -) //a[@id='login2'] - xpath;
   -) #login2 - css id;
   -) id='btn btn-primary' - #btn.btn-primary - css id;
   -) class='signup2' - .signup2 - css class
   -) class='btn btn-primary' - .btn.btn-primary - css class;
     */
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
