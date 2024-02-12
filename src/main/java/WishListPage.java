import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage{
    public WishListPage(WebDriver driver) {
        super(driver);
    }

//-------------------------------------------------------------------------------
    private By ShareButton = By.cssSelector("button[title=\"Share Wishlist\"]");
    private By EmailShare = By.cssSelector("textarea[name=\"emails\"]");
    private By MessShare = By.cssSelector("textarea[id=\"message\"]");
    private By Sucessmess = By.cssSelector("li[class=\"success-msg\"]");
    private By AddToCart_Button = By.cssSelector("button[title=\"Add to Cart\"]");

//-----------------------------------------------------------------------------------------------
    public void ClickOnShareButton (){
        ClickOn(ShareButton);
    }
    public void SendEmailToShare (String email){
        Send_Value(EmailShare,email);
    }
    public void SendMessageToShare (String text){
        Send_Value(MessShare,text);
    }
    public String GettingSucessMessage (){
        return GetText(Sucessmess);
    }
    public AddToCartPage ClickOn_AddToCart (){
        ClickOn(AddToCart_Button);
        return new AddToCartPage(driver);

    }

}
