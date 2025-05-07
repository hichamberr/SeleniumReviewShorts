package shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P0_SeleniumTest {
    public static void main(String[] args) {

        //1-setting up the web driver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        //driver.navigate().to("https://www.etsy.com");
        driver.manage().window().maximize();

    }
}
