import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackendPage extends BasePage{
    public BackendPage(WebDriver driver) {
        super(driver);
    }

    //---------------------------------------------------------------------------------------------------


    private By UserName_Field = By.id("username");
    private By Password_Field = By.id("login");
    private By LoginButton = By.cssSelector("input[value=\"Login\"]");
    private By ExitButton = By.linkText("close");
    private By SalesTap = By.linkText("Sales");
    private By OrderLink = By.linkText("Orders");
    private By ExportDropDown = By.cssSelector("select[name=\"sales_order_grid_export\"]");
    private By Export_Button = By.cssSelector("button[title=\"Export\"]");

//---------------------------------------------------------------------------------------------------

    public void Clear_Usename (){
        Clear(UserName_Field);
    }
    public void Clear_Password (){
        Clear(Password_Field);
    }
    public void Send_Username (String user){
        Send_Value(UserName_Field , user);
    }
    public void Send_Password (String pass){
        Send_Value(Password_Field , pass);
    }
    public void ClickOn_Login (){
        ClickOn(LoginButton);
    }
    public void CloseTap (){
        ClickOn(ExitButton);
    }
    public void ClickOn_sales (){
        ClickOn(SalesTap);
    }
    public void ClickOn_Orders (){
        ClickOn(OrderLink);
    }
    public void SelectDropDown (String text){
        SelectingDropDownByText(ExportDropDown , text);
    }
    public void ClickOn_Export (){
        ClickOn(Export_Button);
    }


}
