import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage (WebDriver driver) {
        super(driver);

    }

//--------------------------------------------------------------------------------
    private By CreatAccountLink = By.cssSelector("a[class=\"button\"]");
    private  By UserName = By.id("email");
    private By Password = By.id("pass");
    private By LoginButton = By.id("send2");

//-----------------------------------------------------------------------------------
    public RegisterPage ClickOnCreatAccount (){
        ClickOn(CreatAccountLink);
        return new RegisterPage(driver);
    }
    public void Clearing_username (){
       Clear(UserName);
    }
    public void Sending_username (String name){
        Send_Value(UserName,name);
    }
    public void Clearing_Password (){
        Clear(Password);
    }
    public void Sending_Password (String pas){
        Send_Value(Password,pas);
    }
    public DashboardPage ClickOn_LoginButton (){
        ClickOn(LoginButton);
        return new DashboardPage(driver);
    }



}
