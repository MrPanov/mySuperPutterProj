package Com.it.helpers;

import Com.it.pages.BasePage;

public class CommonHelper extends BasePage {

    public void stopApp() {
        driver.quit();
    }
}
