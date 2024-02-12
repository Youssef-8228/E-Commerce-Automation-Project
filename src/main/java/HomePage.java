import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }

//------------------------------------------------------------------------------------
    private By MobileLink =  By.xpath("//li[@class=\"level0 nav-1 first\"]//a[@class=\"level0 \"]");
    private By HomePageTitle = By.tagName("h2");
    private  By MyAccountLink = By.linkText("MY ACCOUNT");
    private By TvLink = By.cssSelector("li[class=\"level0 nav-2 last\"]");

//------------------------------------------------------------------------------------------------
public MobilePage clickOnMobile (){
    ClickOn(MobileLink);
    return new MobilePage(driver);
}
public String GetingHomePageTitle (){
   return GetText(HomePageTitle);
}
public LoginPage ClickOnMAccount (){
    ClickOn(MyAccountLink);
    return new LoginPage(driver);
}
public TvPage ClickOnTV (){
    ClickOn(TvLink);
    return new TvPage(driver);
}

}
