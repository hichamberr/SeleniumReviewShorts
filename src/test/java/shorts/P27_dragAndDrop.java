package shorts;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P27_dragAndDrop {
    @Test
    public void dragDropTest(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        Actions actions = new Actions(Driver.getDriver());

       // actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.moveToElement(smallCircle).pause(3000).clickAndHold().pause(3000)
                .moveToElement(bigCircle).pause(3000).release().perform();



    }
}
