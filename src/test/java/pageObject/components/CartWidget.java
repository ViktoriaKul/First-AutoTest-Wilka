package pageObject.components;
import core.elements.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;

public class CartWidget {
    public BaseElement proceedToCheckout = new BaseElement(By.xpath("//button[@id='top-cart-btn-checkout']"),
            "Proceed To Checkout button");
    public BaseElement removeItemIcon = new BaseElement(By.xpath("//a[@title='Remove item']"),
            "Remove Item icon");

    public void removeItemFromCart(){
        removeItemIcon.click();
    }

    private BaseElement cartTitle = new BaseElement(By.xpath("//span[@class='counter-number']"), "");

    private BaseElement cartIcon = new BaseElement(By.xpath("//span[@class='counter qty']"), "");

    public String getCartQty(){
        cartIcon.getElement().should(appear);
        return cartTitle.getText();
    }
}
