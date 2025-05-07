package shorts;

import Pages.PracticePageLogin;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P33_POM_PracticePageLoginTest {
    @Test
    public void practicePageLoginTest(){
        Driver.getDriver().get("https://practice.cydeo.com/login");
        PracticePageLogin practicePageLogin = new PracticePageLogin();

        practicePageLogin.username.sendKeys("tomsmith");
        practicePageLogin.password.sendKeys("SuperSecretPassword");
        practicePageLogin.loginBtn.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Secure Area";

        Assert.assertEquals(actualTitle,expectedTitle,"Secure area message did not appear");



    }
}
