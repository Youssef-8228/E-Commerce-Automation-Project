import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC1 extends TestBase {

    private HomePage homePage;
    private MobilePage mobilePage;

    @Test (groups = {"Together"})
    public void TC1_sorting() throws IOException {
        homePage = new HomePage(driver);
        String Title = homePage.GetingHomePageTitle();
        String expected = "THIS IS DEMO SITE FOR";
        Assert.assertTrue(Title.contains(expected));
        mobilePage = homePage.clickOnMobile();
        String mobTitle =  mobilePage.GetingTitleOfMobilePage();
        String expecteed = "MOBILE";
        Assert.assertTrue(mobTitle.contains(expecteed));
        mobilePage.DropDownByText("Name");
        mobilePage.TakeCapture("E:\\youssef mohamed\\Guru\\youssef22.png");
    }






}
