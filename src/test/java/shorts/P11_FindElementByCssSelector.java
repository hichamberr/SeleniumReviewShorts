package shorts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_FindElementByCssSelector {
    public static void main(String[] args) {
      //  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("homeLink = " + homeLink.getText());

    }
}
