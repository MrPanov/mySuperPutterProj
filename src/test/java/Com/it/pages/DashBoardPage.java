package Com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class DashBoardPage extends BasePage {



    @FindBy(xpath = "//span[@class='sn_menu_title']")
	public WebElement labelUserMail;

    @FindBy(xpath = "(//li[@class='sn_menu_item '])[1]")
	public WebElement buttonCreateMail;

    @FindBy(xpath = "//li[@class='new']")
	public WebElement inbox;

    @FindBy(css = ".sbj")
	public List<WebElement> tblSbj;





	public String getUserEmail(){
        return labelUserMail.getText();
    }

}
