package Com.it.tests;

import Com.it.App;
import Com.it.Mail.Mail;
import Com.it.Mail.MailFactory;
import Com.it.users.User;
import Com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {

   protected static User validUser = UserFactory.getValidUser();
    protected static Mail validMail = MailFactory.getValidSendMail();
   protected static App app = new App();

    @AfterSuite
    public void tearDownSuite(){
        app.common.stopApp();
    }


}
