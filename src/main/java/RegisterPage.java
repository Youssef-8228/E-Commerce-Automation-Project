import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

//------------------------------------------------------------------------------------------
    private By Fname = By.id("firstname");
    private By Lname = By.id("lastname");
    private By Email = By.id("email_address");
    private By Password = By.id("password");
    private By RePassword = By.id("confirmation");
    private By RegistrationButton = By.cssSelector("button[title=\"Register\"]");
    private By Sucessmess = By.cssSelector("li[class=\"success-msg\"]");

//--------------------------------------------------------------------------------------------------
    public void Send_Fname (String fn){
        Send_Value(Fname,fn);
    }
    public void Send_Lname (String ln){
        Send_Value(Lname,ln);
    }
    public void Send_Email (String email){
        Send_Value(Email,email);
    }
    public void Send_Password (String password){
        Send_Value(Password,password);
    }
    public void Send_ConfirmPass (String repassword){
        Send_Value(RePassword,repassword);
    }
    public HomePage ClickOnRegisterButton (){
        ClickOn(RegistrationButton);
        return new HomePage(driver);
    }
    public String GettingSucessMessage (){
        return GetText(Sucessmess);
    }

}
