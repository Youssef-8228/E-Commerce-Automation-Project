import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {
    protected WebDriver driver;
    protected String Email = "layav95749@oprevolt.com";
    protected String Password = "Youssef@8228";
    protected String FirstName = "Youssef";
    protected String LastName = "Mohamed";



    @BeforeTest
    @Parameters({"browser","URL"})
    public  void Setup_Browser (String browser, String url) throws Exception {

        if (browser.equalsIgnoreCase("firefox")) {
driver = new FirefoxDriver();
} else if (browser.equalsIgnoreCase("chrome")) {
driver = new ChromeDriver();
}
        else {
            throw new Exception("enter the browser type");
        }

        if (url.equalsIgnoreCase("user")) {
            driver.get("http://live.techpanda.org/index.php/");
        } else if (url.equalsIgnoreCase("admin")) {
            driver.get("http://live.techpanda.org/index.php/backendlogin/index/index/key/ed397f609b1e8e4c8ea972286f4fa48f/");
        }
        else {
            throw new Exception("enter the browser type");
        }
        Thread.sleep(1000);


    }


    @AfterTest
    public void quit () throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    }

