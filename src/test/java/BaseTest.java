import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import seleniumPOPTables.BasePage;
import swiatPOP.BaseSwiat;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        BasePage.driver = driver;
        BaseSwiat.driver = driver;
    }


    @AfterClass
    public void teardownDriver() {
        driver.quit();
    }
}
