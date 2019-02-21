package Com.it.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Com.it.common.Constant.BASE_URl;

public class DriverFactory {
    static public WebDriver getDriver(){
        WebDriver driver = null;
        String driverType = System.getProperty("driver");
        if (driverType ==null || "chrome".equals(driverType)){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if ("gecko".equals(driverType)){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(BASE_URl);
        driver.manage().window().maximize();
        return driver;
    }

}
