package Com.it;

import Com.it.helpers.CommonHelper;
import Com.it.helpers.DashBoardHelper;
import Com.it.helpers.LoginHelper;
import Com.it.helpers.MailHelper;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashBoardHelper dashboard;
    public MailHelper mail;

    public App(CommonHelper common, LoginHelper login, DashBoardHelper dashboard, MailHelper mail) {
        this.common = common;
        this.login = login;
        this.dashboard = dashboard;
        this.mail = mail;
    }
    public App(){
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashBoardHelper();
        mail = new MailHelper();
    }
}
