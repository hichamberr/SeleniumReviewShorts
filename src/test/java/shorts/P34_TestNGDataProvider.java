package shorts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class P34_TestNGDataProvider {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "googleSearchData" )
    public void googleSearchTest(String keyword, String expectedResult) {
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys(keyword + Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), expectedResult);

    }

    @DataProvider(name = "googleSearchData")
    public Object[][] testData() {
        return new Object[][]{
                {"selenium", "selenium - Google Search"},
                {"java", "java - Google Search"},
                {"ruby","ruby - Google Search"}

        };
        }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
