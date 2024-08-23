package Pages;

import Locator.ManageDetalsModalLocator;
import Locator.SearchandDisplayLocator;
import credential.LoginCredential;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageDetalsModalPage extends ManageDetalsModalLocator {
    WebDriver driver;
    LoginCredential loginCredential=new LoginCredential();
    public ManageDetalsModalPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void managedetaildisplay()throws InterruptedException{
        ManageDetalsModalLocator.searchname2.sendKeys(Keys.CONTROL+"a");
//        ManageDetalsModalLocator.searchname2.sendKeys(Keys.CLEAR);
        ManageDetalsModalLocator.searchname2.sendKeys(Keys.CONTROL+"x");
        Thread.sleep(1000);
        ManageDetalsModalLocator.clicksearch2.click();
        Thread.sleep(1000);
        ManageDetalsModalLocator.selectdetails.get(0).click();
        Thread.sleep(2000);
        Assert.assertTrue(attacktitantext.get(1).isDisplayed(), "Attack on Titan");
        System.out.println("Modal appears");
        Thread.sleep(2000);
        ManageDetalsModalLocator.clickclosebutton.click();
        Thread.sleep(1000);
        System.out.println("Modal is successfully closed and not visible.");


    }
}
