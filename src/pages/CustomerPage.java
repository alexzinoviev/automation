package pages;

import org.openqa.selenium.WebDriver;
import utils.WebElementActions;

public class CustomerPage extends Page{

    public CustomerPage(WebDriver driver) {
        webElementActions = new WebElementActions(driver);
        driver = driver;
    }

    public boolean isRegistrationSuccessful() {
        if (webElementActions.isElementPresent("customer.page.sucessfulreg.text")) {
            return true;
        }
        return false;
    }
}
