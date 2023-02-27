package swiatPOP;

import org.openqa.selenium.By;

public class ProductPage extends BaseSwiat {
    public void addToBasket() {
        driver.findElement(By.id("addtobasket_button")).click();
    }
}
