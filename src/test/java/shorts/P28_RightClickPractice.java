package shorts;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P28_RightClickPractice {
    @Test
    public void RightClickTest(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        WebElement abTesting = Driver.getDriver().findElement(By.linkText("A/B Testing"));

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(abTesting)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.RETURN).perform();
    }
}
