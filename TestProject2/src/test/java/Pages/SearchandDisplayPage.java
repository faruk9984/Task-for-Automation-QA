package Pages;

import Locator.SearchandDisplayLocator;
import credential.LoginCredential;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchandDisplayPage extends SearchandDisplayLocator {
    WebDriver driver;
    LoginCredential loginCredential=new LoginCredential();
    public SearchandDisplayPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void searchanddisplay()throws InterruptedException{
        SearchandDisplayLocator.searchname1.sendKeys("Naruto");
        Thread.sleep(1000);
        SearchandDisplayLocator.clicksearch1.click();
        Thread.sleep(2000);
        Assert.assertTrue(narutotext.isDisplayed(), "Naruto");
        System.out.println("Naruto - are displayed");

        SearchandDisplayLocator.searchname1.sendKeys(Keys.CONTROL+"a");
        SearchandDisplayLocator.searchname1.sendKeys(Keys.CLEAR);
        Thread.sleep(1000);
        SearchandDisplayLocator.searchname1.sendKeys("One Piece");
        Thread.sleep(1000);
        SearchandDisplayLocator.clicksearch1.click();
        Thread.sleep(1000);
        Assert.assertTrue(onepiecetext.isDisplayed(), "One Piece");
        System.out.println("One Piece - are displayed");
        Thread.sleep(2000);

        SearchandDisplayLocator.searchname1.sendKeys(Keys.CONTROL+"a");
        SearchandDisplayLocator.searchname1.sendKeys(Keys.CLEAR);
        Thread.sleep(1000);
        SearchandDisplayLocator.searchname1.sendKeys("Death Note");
        Thread.sleep(1000);
        SearchandDisplayLocator.clicksearch1.click();
        Thread.sleep(1000);
        Assert.assertTrue(deathnotetext.isDisplayed(), "Death Note");
        System.out.println("Death Note - are displayed");
        Thread.sleep(2000);


        SearchandDisplayLocator.searchname1.sendKeys(Keys.CONTROL+"a");
        SearchandDisplayLocator.searchname1.sendKeys(Keys.CLEAR);
        Thread.sleep(1000);
        SearchandDisplayLocator.searchname1.sendKeys("No manga found");
        Thread.sleep(1000);
        SearchandDisplayLocator.clicksearch1.click();
        Thread.sleep(1000);
        Assert.assertTrue(nomangafoundtext.isDisplayed(), "No manga found");
        System.out.println("No manga found - are displayed");
        Thread.sleep(2000);


    }
}
