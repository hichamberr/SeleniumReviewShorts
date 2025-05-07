package shorts;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P30_JavaScriptExecutorScrolling {
    @Test
    public void JavaScriptExecutorScrollingTest(){
        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        BrowserUtils.sleep(3);

        Driver.closeDriver();

    }
}
