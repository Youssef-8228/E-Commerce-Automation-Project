import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TvPage extends HomePage{
    public TvPage(WebDriver driver) {
        super(driver);
    }

//----------------------------------------------------------------------------
    private By WishlistLG = By.xpath("(//a[@class=\"link-wishlist\"])[1]");

//-----------------------------------------------------------------------------------
    public WishListPage ClickOnAddWishlist_LG(){
        ClickOn(WishlistLG);
        return new WishListPage(driver);
    }
}
