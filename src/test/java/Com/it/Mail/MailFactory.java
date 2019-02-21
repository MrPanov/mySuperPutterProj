package Com.it.Mail;

import java.util.ResourceBundle;

public class MailFactory {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("mail");
    public static Mail getValidSendMail(){
        return new Mail(resourceBundle.getString("validMailAdres"),
                resourceBundle.getString("validTextLetter"));
    }
}
