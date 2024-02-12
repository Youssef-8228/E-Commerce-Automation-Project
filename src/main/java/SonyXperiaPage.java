import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SonyXperiaPage extends BasePage {

    public SonyXperiaPage(WebDriver driver) {
        super(driver);
    }

//----------------------------------------------------------------------------------------

    private By Xperia_Price = By.cssSelector("span[class=\"price\"]");

//------------------------------------------------------------------------------------


    public String GetingXperiaPrice (){
       return GetText(Xperia_Price);
    }

}
