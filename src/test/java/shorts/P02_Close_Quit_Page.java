package shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Close_Quit_Page {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com/open_new_tab");
        Thread.sleep(5000);

        //to close only the current page we use driver.close
        driver.close();

        //for closing all windows we use driver.quit
        driver.quit();
    }
}
