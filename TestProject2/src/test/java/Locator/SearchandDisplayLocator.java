package Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.x500.X500Principal;

public class SearchandDisplayLocator {
    @FindBy(xpath = "//input[@placeholder='Search Manga']")
    public static WebElement searchname1;
    @FindBy(xpath = "//button[contains(.,'Search')]")
    public static WebElement clicksearch1;
    @FindBy(xpath = "//h3[contains(.,'Naruto')]")
    public static WebElement narutotext;
    @FindBy(xpath = "//h3[contains(.,'One Piece')]")
    public static WebElement onepiecetext;
    @FindBy(xpath = "//h3[contains(.,'Death Note')]")
    public static WebElement deathnotetext;
    @FindBy(xpath = "//p[contains(.,'No manga found')]")
    public static WebElement nomangafoundtext;

}
