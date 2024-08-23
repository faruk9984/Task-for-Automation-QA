package RunTest;

import Pages.LoginPage;
import base.SetUp;
import credential.LoginCredential;
import org.testng.annotations.Test;

public class LoginPageRun extends SetUp {
    LoginCredential loginCredential= new LoginCredential();

    @Test(priority = 1)
    public void userLogin() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        driver.get(loginCredential.base_url);
        Thread.sleep(3000);
        loginPage.doLogin();

    }
}
