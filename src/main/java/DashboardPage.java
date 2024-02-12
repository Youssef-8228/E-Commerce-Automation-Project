import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    //---------------------------------------------------------------

    private By Wishlist_Link = By.linkText("MY WISHLIST");
    private By MyOrders = By.linkText("MY ORDERS");
    private By ReorderLink = By.linkText("REORDER");

    //---------------------------------------------------------------

    public WishListPage ClickOn_MyWishlist (){
        ClickOn(Wishlist_Link);
        return new WishListPage(driver);
    }

    public MyOrdersPage ClickOn_MyOrders (){
        ClickOn(MyOrders);
        return new MyOrdersPage(driver);
    }
    public AddToCartPage ClickOn_ReorderLink (){
        ClickOn(ReorderLink);
        return new AddToCartPage(driver);
    }


}
