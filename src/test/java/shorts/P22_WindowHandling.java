package shorts;

import Utilities.Driver;
import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P22_WindowHandling {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

    @Test
    public void windowHandlingTest(){
        driver.get("https://practice.cydeo.com/windows");

        String currentWindowHandle = driver.getWindowHandle();

        System.out.println("currentWindowHandle = " + currentWindowHandle);

        driver.findElement(By.linkText("Click Here")).click();

         Set<String> allWindows = driver.getWindowHandles();

       System.out.println("allWindows = " + allWindows);

        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
          System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }
}
