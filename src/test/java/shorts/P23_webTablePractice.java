package shorts;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P23_webTablePractice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void webTableTest() {
        driver.get("https://practice.cydeo.com/tables");
        WebElement FrankCell = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[2]//td[2]"));
        System.out.println("FrankCell = " + FrankCell.getText());

        List<WebElement> bodyRow = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        for (WebElement eachCell : bodyRow) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }
    }
}