import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.Set;

public class TC7 extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private MyOrdersPage myOrdersPage;
     SoftAssert softAssert = new SoftAssert();
@Test
    public void Dawnload_PDF () throws InterruptedException, IOException {
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
}
