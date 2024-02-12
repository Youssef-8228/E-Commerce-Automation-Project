import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage{
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    //----------------------------------------------------------------------------


    private By CheckOutButton = By.xpath("(//button[@title=\"Proceed to Checkout\"])[1]");
    private By QuantityField = By.xpath("(//input[@type=\"text\"])[1]");
    private By UpdateButton = By.xpath("(//button[@type=\"submit\"])[5]");
    private By TotalPrice = By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]");
    private By Coupon = By.id("coupon_code");
    private By ApplyButton = By.cssSelector("button[title=\"Apply\"]");
    private By ErrorMessage = By.cssSelector("p[class=\"item-msg error\"]");
    private By EmptyCartButton = By.cssSelector("button[title=\"Empty Cart\"]");
    private By TitlePage = By.cssSelector("div[class=\"page-title\"]");



    //----------------------------------------------------------------------------

    public CheckOutPage ClickOn_CheckOutButton (){
        ClickOn(CheckOutButton);
        return new CheckOutPage(driver);
    }
    public void ClearQuantityField (){
        Clear(QuantityField);
    }
    public void WriteQuantity (String quantity){
        Send_Value(QuantityField,quantity);
    }
    public void ClickOn_UpdateButton (){
        ClickOn(UpdateButton);
    }
    public String Get_grandprice (){
        return GetText(TotalPrice);
    }

    public void clearQuantity (){
        Clear(QuantityField);
    }
    public void WriteQuantityNumb (String key){
        Send_Value(QuantityField,key);
    }
    public void ClickOnUpdate(){
        ClickOn(UpdateButton);
    }
    public String GettingErrorMess (){
        return GetText(ErrorMessage);
    }
    public void ClickOnEmptyCart(){
        ClickOn(EmptyCartButton);
    }
    public String GettingTitlePage(){
        return GetText(TitlePage);
    }
    public void ClearCouponField (){
        Clear(Coupon);
    }
    public void SendCoupon (String cop){
        Send_Value(Coupon,cop);
    }
    public void ClickOnApply (){
        ClickOn(ApplyButton);
    }



}
