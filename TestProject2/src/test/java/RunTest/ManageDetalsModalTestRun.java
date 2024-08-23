package RunTest;

import Pages.ManageDetalsModalPage;
import Pages.SearchandDisplayPage;
import org.testng.annotations.Test;

public class ManageDetalsModalTestRun extends SearchandDisplayTestRun{
    @Test(priority = 3,enabled = true)
    public void managedetailsmodals() throws InterruptedException {
        ManageDetalsModalPage manageDetalsModalPage=new ManageDetalsModalPage(driver);
        manageDetalsModalPage.managedetaildisplay();

    }
}
