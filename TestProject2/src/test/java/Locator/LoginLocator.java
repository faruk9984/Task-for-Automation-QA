package Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginLocator {
    @FindBy(xpath = "//input[@placeholder='Username']")
    public static WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement password;
    @FindBy(xpath = "//button[contains(.,'Login')]")
    public static WebElement clickloginbutton;
    @FindBy(xpath = "//h1[contains(.,'Manga You Should Read')]")
    public static WebElement verifytest;

//    @FindBy(xpath = "//span[contains(text(),'Wind')]")
//    public static List<WebElement> selectwindtext;











}
