package shorts;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P32_LoginPractice {
    @Test
    public void practicePageLoginTest(){
        Driver.getDriver().get("https://practice.cydeo.com/login");
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("tomsmith");

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("SuperSecretPassword");

        BrowserUtils.sleep(4);

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        loginBtn.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Secure Area";

        Assert.assertEquals(actualTitle,expectedTitle,"Secure area message did not appear");


        BrowserUtils.sleep(3);

        WebElement logOut = Driver.getDriver().findElement(By.linkText("Logout"));
        logOut.click();
    }
}
