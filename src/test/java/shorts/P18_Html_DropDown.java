package shorts;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P18_Html_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void htmlDropDownTest(){

   driver.get("https://practice.cydeo.com/dropdown");

   driver.findElement(By.id("dropdownMenuLink")).click();

   driver.findElement(By.linkText("Yahoo")).click();

    }
}
