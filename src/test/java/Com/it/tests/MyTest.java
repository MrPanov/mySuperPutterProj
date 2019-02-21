package Com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest{


    @Test()
    public void testMyTest () {
        app.login.login( validUser.userName,validUser.password);
        Assert.assertEquals(app.dashboard.getUserEmail(), validUser.email);
    }


}
