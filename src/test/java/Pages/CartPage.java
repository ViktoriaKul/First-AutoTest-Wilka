package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage{
    String cartEmptyText = "You have no items in your shopping cart.";
    private SelenideElement deleteFirstItemIcon = $("a.action-delete");
    private SelenideElement cartIsEmpty = $("div.cart-empty");

    public CartPage(String pageUrl){
        super(pageUrl);
    }

    public void deleteFirstItem(){
        deleteFirstItemIcon.click();
    }
    public void checkEmptyCartTitle(){
        cartIsEmpty.shouldHave(text(cartEmptyText));
    }


}
