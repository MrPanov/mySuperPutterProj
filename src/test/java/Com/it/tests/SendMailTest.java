package Com.it.tests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.UUID;

public class SendMailTest extends BaseTest{

    @Test()
    public void SendMailTest ()
            {
        app.login.login(validUser.userName, validUser.password);
        app.dashboard.buttonCreateMail.click();
        String guid = UUID.randomUUID().toString();
        app.mail.sendMail(validMail.mailAdres, guid, validMail.textLetter);
        app.dashboard.inbox.click();
        Assert.assertTrue(CheckSbj(guid), "letter not found in tbl");


    }

    private boolean CheckSbj(String guid) {
       List<WebElement> array = app.dashboard.tblSbj;
       if(array.size()==0)
           return false;
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).getText().trim().equals(guid.trim())){
                return true;
            }
        }
        return false;
    }
}
