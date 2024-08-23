package Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ManageDetalsModalLocator {
    @FindBy(xpath = "//input[@placeholder='Search Manga']")
    public static WebElement searchname2;
    @FindBy(xpath = "//button[contains(.,'Search')]")
    public static WebElement clicksearch2;
    @FindBy(xpath = "//span[contains(.,'Details')]")
    public static List<WebElement> selectdetails;
    @FindBy(xpath = "//h3[contains(text(),'Attack on Titan')]")
    public static List<WebElement> attacktitantext;
    @FindBy(xpath = "//button[contains(.,'Close')]")
    public static WebElement clickclosebutton;

}
