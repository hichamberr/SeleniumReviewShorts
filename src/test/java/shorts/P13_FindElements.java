package shorts;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P13_FindElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("all links size = " + allLinks.size());

        for (WebElement eachLink : allLinks) {
            System.out.println("eachLink = " + eachLink.getText());
            System.out.println(eachLink.getAttribute("href"));
        }


    }


}
