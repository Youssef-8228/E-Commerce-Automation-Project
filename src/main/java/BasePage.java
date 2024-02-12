import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class BasePage {

    protected WebDriver driver;
    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    //----------------------------------------------------------------------------------

    protected void ClickOn(By by){
        driver.findElement(by).click();
    }
    protected String GetText(By by){
         return driver.findElement(by).getText();
    }
    protected void Send_Value (By by , String key){
        driver.findElement(by).sendKeys(key);
    }
    protected void Clear (By by){
        driver.findElement(by).clear();
    }
    protected void SelectingDropDownByText (By by,String text){
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    protected static void TakeingScreenShot (WebDriver driver,String URL) throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Dist = new File(URL);
        FileUtils.copyFile(file,Dist);
    }


}
