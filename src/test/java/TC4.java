import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class TC4 extends TestBase {

    private HomePage homePage;
    private MobilePage mobilePage;

    @Test (groups = {"Together"})
    public void PopUpHandling () throws IOException {
        homePage = new HomePage(driver);
        String Main = driver.getWindowHandle();// mobile page handle
        mobilePage = homePage.clickOnMobile();
        mobilePage.ClickOnCompareXperia();
        mobilePage.ClickOnCompareIphone();
        mobilePage.ClickOnCompareButton();
        Set <String> Windows = driver.getWindowHandles();

       for (String n : Windows){

            if (!n.equals(Main)) {
                driver.switchTo().window(n);
                driver.manage().window().maximize();
            }
       }

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"std\"])[1]")));
        mobilePage.TakeCapture("E:\\youssef mohamed\\Guru\\TC4.png");
        driver.close();
    }



}
