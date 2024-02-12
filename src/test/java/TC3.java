import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3 extends TestBase {

    private HomePage homePage;
    private MobilePage mobilePage;
    private SonyXperiaPage sonyXperiaPage;
    AddToCartPage addToCartPage;

    @Test (groups = {"Together"})
    public void TC3_cartQuantity (){
        homePage = new HomePage(driver);
        mobilePage =  homePage.clickOnMobile();
         addToCartPage = mobilePage.ClickOnAddTocartButton_xperia();
        addToCartPage.clearQuantity();
        addToCartPage.WriteQuantityNumb("1000");
        addToCartPage.ClickOnUpdate();
        String errorMess_actual = addToCartPage.GettingErrorMess();
        String errorMess_expected = "The maximum quantity allowed for purchase is 500";
        Assert.assertTrue(errorMess_actual.contains(errorMess_expected));
        addToCartPage.ClickOnEmptyCart();
        String pageTitle = addToCartPage.GettingTitlePage();
        String expectedPagetitle = "SHOPPING CART IS EMPTY";
        Assert.assertTrue(pageTitle.contains(expectedPagetitle));
    }

}
