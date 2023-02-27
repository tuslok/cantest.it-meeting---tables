package swiatPOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseSwiat {
    public static WebDriver driver;
    public static MainPage mainPage;
    public static BasketPage basketPage;
    public static ProductPage productPage;

    public static void goHome() {
        driver.findElement(By.cssSelector("#navtopdefault li:first-of-type")).click();
        mainPage = new MainPage();
    }

    public static void openBasket() {
        driver.findElement(By.cssSelector("#basket_link>a")).click();
        basketPage = new BasketPage();
    }
}
