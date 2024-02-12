import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC5 extends TestBase{

    private HomePage homePage;
    private TvPage tvPage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private WishListPage wishListPage;

    private SoftAssert softAssert = new SoftAssert();

    @Test (priority = 1)
    public void TC_5() throws InterruptedException {
        homePage = new HomePage(driver);
        loginPage = homePage.ClickOnMAccount();
        Thread.sleep(1000);
        registerPage = loginPage.ClickOnCreatAccount();
        registerPage.Send_Fname(FirstName);
        registerPage.Send_Lname(LastName);
        registerPage.Send_Email(Email);//--------------------------------------
        registerPage.Send_Password(Password);
        registerPage.Send_ConfirmPass(Password);
        homePage =  registerPage.ClickOnRegisterButton();
        Thread.sleep(2000);
        String Sucessmess = registerPage.GettingSucessMessage();
        String expected = "Thank you for registering with Main Website Store.";
        softAssert.assertTrue(Sucessmess.contains(expected));
        System.out.println(Sucessmess);
        tvPage = homePage.ClickOnTV();
       wishListPage = tvPage.ClickOnAddWishlist_LG();
       wishListPage.ClickOnShareButton();
       wishListPage.SendEmailToShare(Email);//-------------------------------------------
       wishListPage.SendMessageToShare("Hello Every one, I would like to share my wish product");
       wishListPage.ClickOnShareButton();
       String mess = wishListPage.GettingSucessMessage();
       String expectedSucessMess = "Your Wishlist has been shared.";
        System.out.println(mess);
       softAssert.assertTrue(mess.contains(expectedSucessMess));
       softAssert.assertAll();

    }
}
