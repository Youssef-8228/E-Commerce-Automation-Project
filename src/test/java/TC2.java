import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 extends TestBase{

    private HomePage homePage;
    private MobilePage mobilePage;
    private SonyXperiaPage sonyXperiaPage;

    @Test (groups = {"Together"})
    public void TC2_mobValue (){
        homePage =new HomePage(driver);
        mobilePage = homePage.clickOnMobile();
        String value1 = mobilePage.GetingPrice();
        sonyXperiaPage = mobilePage.ClickOnXperia();
        String value2 = sonyXperiaPage.GetingXperiaPrice();
        Assert.assertEquals(value2,value1);
    }

}
