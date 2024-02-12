import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class MyOrdersPage extends BasePage{
    public MyOrdersPage(WebDriver driver) {
        super(driver);
    }

    //----------------------------------------------------------

    private By ViewOrder = By.linkText("VIEW ORDER");
    private By Title = By.cssSelector("div[class=\"page-title title-buttons\"]");
    private By PrintOrder = By.linkText("Print Order");



    //-------------------------------------------------------------

    public void ClickOn_ViewOrder (){
        ClickOn(ViewOrder);
    }
    public String GetTitleOFOrderPage (){
        return GetText(Title);
    }
    public void TakeScreenShoot_order (String url) throws IOException {
        TakeingScreenShot(driver,url);
    }
    public void ClickOnPrintOrder (){
        ClickOn(PrintOrder);
    }




}
