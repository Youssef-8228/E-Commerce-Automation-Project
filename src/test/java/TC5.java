import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC5 extends TestBase{

    private HomePage homePage;
    private TvPage tvPage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private WishListPage wishListPage;
    private DashboardPage dashboardPage;
    private AddToCartPage addToCartPage;
    private CheckOutPage checkOutPage;
    private MyOrdersPage myOrdersPage;

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
    /*@Test (dependsOnMethods = {"TC_5"})
    public void TC6 () throws IOException, InterruptedException {
        homePage = new HomePage(driver);
        loginPage =homePage.ClickOnMAccount();
        loginPage.Clearing_username();
        loginPage.Sending_username(Email);
        loginPage.Clearing_Password();
        loginPage.Sending_Password(Password);
        dashboardPage = loginPage.ClickOn_LoginButton();
        Thread.sleep(1000);
        wishListPage = dashboardPage.ClickOn_MyWishlist();
        Thread.sleep(1000);
        addToCartPage = wishListPage.ClickOn_AddToCart();
        Thread.sleep(1000);
        checkOutPage = addToCartPage.ClickOn_CheckOutButton();
        Thread.sleep(1000);
        checkOutPage.Clear_Adress();
        checkOutPage.Sending_Adress("ABC");
        checkOutPage.Clear_City();
        checkOutPage.Sending_City("New York");
        checkOutPage.Sending_State("New York");
        checkOutPage.Clear_zip();
        checkOutPage.Sending_zip("542896");
        checkOutPage.Sending_Country("United States");
        checkOutPage.Clear_telephone();
        checkOutPage.Sending_telephone("12345678");
        checkOutPage.ClickOn_Continue();
        Thread.sleep(2000);
        checkOutPage.ClickOn_Shippingcontinue();
        Thread.sleep(2000);
        checkOutPage.ClickOn_PaymentMethode();
        Thread.sleep(2000);
        checkOutPage.ClickOn_ContinuePayment();
        Thread.sleep(2000);
        checkOutPage.TakeScreenShootFor_TotalPrice_OrderID("E:\\youssef mohamed\\Guru\\TC6-1.png");
        checkOutPage.ClickOn_PlaceHolder();
        Thread.sleep(2000);
        checkOutPage.TakeScreenShootFor_TotalPrice_OrderID("E:\\youssef mohamed\\Guru\\TC6-2.png");

    }
    @Test (dependsOnMethods = {"TC_5"})
    public void TC7 () throws InterruptedException, IOException {
        homePage = new HomePage(driver);
        loginPage =homePage.ClickOnMAccount();
        loginPage.Clearing_username();
        loginPage.Sending_username(Email);
        loginPage.Clearing_Password();
        loginPage.Sending_Password(Password);
        dashboardPage = loginPage.ClickOn_LoginButton();
        Thread.sleep(1000);
        myOrdersPage =dashboardPage.ClickOn_MyOrders();
        myOrdersPage.ClickOn_ViewOrder();
        Thread.sleep(1000);
        myOrdersPage.TakeScreenShoot_order("E:\\youssef mohamed\\Guru\\TC7-1.png");
        String title = myOrdersPage.GetTitleOFOrderPage();
        String expected = "Pending";
        softAssert.assertTrue(title.contains(expected));
        String Main = driver.getWindowHandle();
        myOrdersPage.ClickOnPrintOrder();
        Set<String> windows = driver.getWindowHandles();
        for (String n : windows){

            if (!n.equals(Main)) {
                driver.switchTo().window(n);
            }
        }


    }
    @Test (dependsOnMethods = {"TC_5"})
    public void TC8() throws InterruptedException, IOException {
        homePage = new HomePage(driver);
        loginPage =homePage.ClickOnMAccount();
        loginPage.Clearing_username();
        loginPage.Sending_username(Email);
        loginPage.Clearing_Password();
        loginPage.Sending_Password(Password);
        dashboardPage = loginPage.ClickOn_LoginButton();
        Thread.sleep(1000);
        addToCartPage = dashboardPage.ClickOn_ReorderLink();
        Thread.sleep(1000);
        String OldPrice = addToCartPage.Get_grandprice();
        addToCartPage.ClearQuantityField();
        addToCartPage.WriteQuantity("10");
        addToCartPage.ClickOn_UpdateButton();
        Thread.sleep(3000);
        String NewPrice = addToCartPage.Get_grandprice();
        Assert.assertFalse(OldPrice.contains(NewPrice));
        System.out.println("Grand Total is = " + NewPrice);
        checkOutPage = addToCartPage.ClickOn_CheckOutButton();
        Thread.sleep(1000);
        checkOutPage.ClickOn_ReorderContinue();
        Thread.sleep(3000);
        checkOutPage.ClickOn_Shippingcontinue();
        Thread.sleep(3000);
        checkOutPage.ClickOn_PaymentMethode();
        Thread.sleep(1000);
        checkOutPage.ClickOn_ContinuePayment();
        Thread.sleep(1000);
        checkOutPage.ClickOn_PlaceHolder();
        Thread.sleep(3000);
        checkOutPage.TakeScreenShootFor_TotalPrice_OrderID("E:\\youssef mohamed\\Guru\\TC8.png");
        String ordernumb = checkOutPage.GetOrderNumber();
        System.out.println("your order number is: " + ordernumb);


    }*/


}
