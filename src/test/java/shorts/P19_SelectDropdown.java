package shorts;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P19_SelectDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void selectDropdown(){
        driver.get("https://practice.cydeo.com/dropdown");

        Select simpleSelect = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        simpleSelect.selectByVisibleText("option 2");
    }
}
