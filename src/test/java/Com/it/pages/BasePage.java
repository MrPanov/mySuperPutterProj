package Com.it.pages;

import Com.it.drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    static protected WebDriver driver = DriverFactory.getDriver();
    public BasePage() {
        PageFactory.initElements(driver,this);
    }

}
