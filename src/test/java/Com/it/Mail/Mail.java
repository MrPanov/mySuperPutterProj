package Com.it.Mail;

import java.util.Objects;

public class Mail {

    public String mailAdres;
    public String textLetter;

    public Mail(String mailAdres, String textLetter) {
        this.mailAdres = mailAdres;
        this.textLetter = textLetter;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mailAdres='" + mailAdres + '\'' +
                ", textLetter='" + textLetter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail = (Mail) o;
        return Objects.equals(mailAdres, mail.mailAdres) &&
                Objects.equals(textLetter, mail.textLetter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mailAdres, textLetter);
    }
}
