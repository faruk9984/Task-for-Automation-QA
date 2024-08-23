package Pages;

import Locator.LoginLocator;
import credential.LoginCredential;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Set;

public class LoginPage extends LoginLocator {
    WebDriver driver;
    LoginCredential loginCredential=new LoginCredential();
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void doLogin()throws InterruptedException{
        System.out.println("Start Login");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://myalice-automation-test.netlify.app/";
        Assert.assertEquals(actualURL, expectedURL, "login page is displayed");

        LoginLocator.username.sendKeys(loginCredential.ustername);
        Thread.sleep(1000);
        LoginLocator.password.sendKeys(loginCredential.loginpassword);
        Thread.sleep(1000);
        LoginLocator.clickloginbutton.click();
        Thread.sleep(3000);

        Assert.assertTrue(verifytest.isDisplayed(), "Manga You Should Read");
        System.out.println("User is redirected to the manga search page");

    }
}
