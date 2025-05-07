package shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_Getting_Page_Title {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cydeo.com");

        //check if the title of the page is cydeo
        if (driver.getTitle().equals("Cydeo")){
            System.out.println("title verification is passed");
        }else {
            System.out.println("Title verification is failed");
        }
        System.out.println(driver.getTitle());


        driver.quit();
    }
}
