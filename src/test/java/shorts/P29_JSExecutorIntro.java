package shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P29_JSExecutorIntro {

    @Test
    public void javaScriptExecutorIntroTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ((JavascriptExecutor)driver).executeScript("");

    }
}
