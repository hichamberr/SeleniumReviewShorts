package shorts;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class P31_ExplicitWaitPractice {
    @Test
    public void explicitWaitTest(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/2");
        Driver.getDriver().findElement(By.xpath("//button[.='Start']")).click();

        WebDriverWait wait;
        wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));

        WebElement loadingBar = Driver.getDriver().findElement(By.id("loading"));

        wait.until(ExpectedConditions.invisibilityOf(loadingBar));

        WebElement helloWorld = Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));
        Assert.assertTrue(helloWorld.isDisplayed());

    }
}
