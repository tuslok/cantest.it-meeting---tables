package swiatPOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasketItemPO {
    String name;
    WebElement qty;

    public String getName() {
        return name;
    }

    public BasketItemPO(WebElement row) {
        this.name = parseName(row.findElement(By.cssSelector("td:nth-of-type(2)")).getText());
        this.qty = row.findElement(By.cssSelector("input"));
    }

    private String parseName(String text) {
        String[] temp = text.split("\n");
        return temp[1];
    }

    public void changeQty(int n) {
        qty.clear();
        qty.sendKeys("" + n);
    }

    public int getQty(){
        return Integer.parseInt(qty.getAttribute("value"));
    }
}
