package shorts;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P25_uploadFile {
    @Test
    public void uploadFileTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        WebElement chooseFileBtn = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        chooseFileBtn.sendKeys("/Users/hichamberr/Downloads/berr FAMLI.pdf");
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']")).click();


    }
}
