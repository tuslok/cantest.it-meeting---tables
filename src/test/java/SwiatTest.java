import org.testng.annotations.Test;
import swiatPOP.MainPage;

import static org.testng.Assert.assertEquals;
import static swiatPOP.BaseSwiat.*;

public class SwiatTest extends BaseTest {

    @Test
    public void verifyBasketCounts() {
        MainPage.open();
        mainPage.clickProductByName("Propel Advanced Disc 1 M");
        productPage.addToBasket();
        goHome();
        mainPage.clickProductByName("Wkładka antyprzebiciowa 50mm");
        productPage.addToBasket();
        goHome();
        mainPage.clickProductByName("Torba na ramę na smartfon");
        productPage.addToBasket();
        openBasket();
        basketPage.getBasketItem("Wkładka antyprzebiciowa 50mm").changeQty(5);
        basketPage.clickPrzelicz();
        assertEquals(basketPage.getTotalQty(), 7);
    }
}
