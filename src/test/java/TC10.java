import org.testng.annotations.Test;

public class TC10 extends TestBase  {

   private BackendPage backendPage;

    @Test
    public void BackEnd () throws InterruptedException {
        backendPage = new BackendPage(driver);
        backendPage.Clear_Usename();
        backendPage.Clear_Password();
        backendPage.Send_Username("user01");
        backendPage.Send_Password("guru99com");
        backendPage.ClickOn_Login();
        Thread.sleep(2000);
        backendPage.CloseTap();
        Thread.sleep(1000);
        backendPage.ClickOn_sales();
        backendPage.ClickOn_Orders();
        Thread.sleep(1000);
        backendPage.SelectDropDown("CSV");
        backendPage.ClickOn_Export();
        Thread.sleep(2000);

    }

}
