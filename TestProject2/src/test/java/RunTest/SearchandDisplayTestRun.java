package RunTest;

import Pages.LoginPage;
import Pages.SearchandDisplayPage;
import credential.LoginCredential;
import org.testng.annotations.Test;

public class SearchandDisplayTestRun extends LoginPageRun{
    LoginCredential loginCredential= new LoginCredential();

    @Test(priority = 2,enabled = true)
    public void searchdisplay() throws InterruptedException {
        SearchandDisplayPage searchandDisplayPage=new SearchandDisplayPage(driver);
        searchandDisplayPage.searchanddisplay();

    }
}
