package shorts;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P15_CheckBoxButton {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkBoxButton = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        checkBoxButton.click();

        System.out.println("checkBoxButton.isSelected() = " + checkBoxButton.isSelected());
        driver.close();



    }

    }

