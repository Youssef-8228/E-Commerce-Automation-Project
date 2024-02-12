import org.testng.Assert;
import org.testng.annotations.Test;

public class TC9 extends TestBase{

    private HomePage homePage;
    private MobilePage mobilePage;
    private AddToCartPage addToCartPage;

    @Test
    public void Discount () throws InterruptedException {
        homePage = new HomePage(driver);
        mobilePage = homePage.clickOnMobile();
        Thread.sleep(1000);
        addToCartPage =mobilePage.ClickOnAddTocartButton_Iphone();
        Thread.sleep(1000);
        String price = addToCartPage.Get_grandprice();
        addToCartPage.ClearCouponField();
        addToCartPage.SendCoupon("GURU50");
        addToCartPage.ClickOnApply();
        Thread.sleep(1000);
        String Discountprice = addToCartPage.Get_grandprice();
        Assert.assertEquals(price,Discountprice,"Discount not apllied on the totla price");
    }
}
