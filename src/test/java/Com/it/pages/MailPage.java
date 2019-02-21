package Com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage extends BasePage {

	@FindBy(id="to")
	private WebElement inputMailAdres;

	@FindBy(xpath="//input[@tabindex='5']")
	private WebElement inputSubject;

	@FindBy(id="text")
	private WebElement inputTextLetter;

	@FindBy(xpath="(//input[@name='send'])[1]")
	private WebElement btnSendMail;

	public void sendMail (String mailAdres, String subject ,String textLetter )
    {
        inputMailAdres.sendKeys(mailAdres);
        inputSubject.sendKeys(subject);
        inputTextLetter.sendKeys(textLetter);
        btnSendMail.click();
    }




}
