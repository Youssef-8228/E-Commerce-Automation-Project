import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CheckOutPage extends BasePage{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    //------------------------------------------------------------------

    private By Adress = By.xpath("(//input[@title=\"Street Address\"])[1]");
    private By City = By.xpath("(//input[@title=\"City\"])[1]");
    private By State_DropDown = By.cssSelector("select[id=\"billing:region_id\"]");
    private By ZIP = By.xpath("(//input[@title=\"Zip\"])[1]");
    private By Country_Dropdown = By.xpath("(//select[@class=\"validate-select\"])[1]");
    private By Telepone = By.xpath("(//input[@type=\"tel\"])[1]");
    private By Continue_Butoon = By.xpath("(//button[@title=\"Continue\"])[1]");
    private By ShippingCost = By.cssSelector("label[for=\"s_method_flatrate_flatrate\"]");
    private By Shipping_Continue = By.xpath("(//button[@type=\"button\"])[3]");
    private By Select_Payment = By.xpath("(//input[@value=\"checkmo\"])[1]");
    private By Continue_3 = By.xpath("(//button[@type=\"button\"])[4]");
    private By PlaceHolder_Button = By.cssSelector("button[title=\"Place Order\"]");
    private By Reorder_continue = By.xpath("(//button[@title = \"Continue\"])[1]");
    private By OrderNumber = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a");


    //------------------------------------------------------------------

    public void Clear_Adress (){
        Clear(Adress);
    }
    public void Sending_Adress (String adres){
        Send_Value(Adress,adres);
    }
    public void Clear_City (){
        Clear(City);
    }
    public void Sending_City (String cit){
        Send_Value(City,cit);
    }
    public void Sending_State (String name){
       SelectingDropDownByText(State_DropDown,name);
    }
    public void Clear_zip (){
        Clear(ZIP);
    }
    public void Sending_zip (String z){
        Send_Value(ZIP,z);
    }
    public void Sending_Country (String cont){
        SelectingDropDownByText(Country_Dropdown,cont);
    }
    public void Clear_telephone (){
        Clear(Telepone);
    }
    public void Sending_telephone (String tel){
        Send_Value(Telepone,tel);
    }
    public void ClickOn_Continue (){
        ClickOn(Continue_Butoon);
    }
    public String Get_ShippingCost (){
        return GetText(ShippingCost);
    }
    public void ClickOn_Shippingcontinue (){
        ClickOn(Shipping_Continue);
    }
    public void ClickOn_PaymentMethode (){
        ClickOn(Select_Payment);
    }
    public void ClickOn_ContinuePayment (){
        ClickOn(Continue_3);
    }
    public void TakeScreenShootFor_TotalPrice_OrderID (String url) throws IOException {
        TakeingScreenShot(driver,url);
    }
    public void ClickOn_PlaceHolder (){
        ClickOn(PlaceHolder_Button);
    }
    public void ClickOn_ReorderContinue (){
        ClickOn(Reorder_continue);
    }
    public String GetOrderNumber (){
        return GetText(OrderNumber);
    }



}
