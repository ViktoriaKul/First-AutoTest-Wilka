package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MenTopsCatalogPage extends BasePage{
    String cartTitleText1 = "1 Item in Cart";
    String cartTitleText2 = "2 Items in Cart";
    String deletePopupText = "Are you sure you would like to remove this item from the shopping cart?";
    String deleteAfterNote = "You have no items in your shopping cart";

    //Step 3.	Select Style -> Rain coat
    private SelenideElement styleSection = $("div#narrow-by-list>div+div");
    private SelenideElement rainCoat = $("a[href^='https://magento.softwaretestingboard.com/men/tops-men.html?style_general=122']");
    //Step 4.	Select via as List
    private SelenideElement displayViewList = $("#mode-list");
    private SelenideElement displayViewGrid = $("#mode-grid");

    //Step 5.	Sort by Price
    private SelenideElement sortByOptions = $("select#sorter");
    private SelenideElement sortByPrice = $("select#sorter");
    //Step 6.	Select size of first coat (M)
    private SelenideElement firstCoatSizeM = $("div#option-label-size-143-item-168");
    private SelenideElement secondCoatSizeS = $("ol > li + li div#option-label-size-143-item-167");
    //Step 7.	Select color of fist coat (yellow)
    private SelenideElement firstCoatColorYellow = $("div#option-label-color-93-item-60");
    private SelenideElement secondCoatColorGreen = $("div#option-label-color-93-item-53");
    //Step 8.	Click "Add to cart" button
    private SelenideElement firstCoatAddToCard = $("li div.product-item-info button");
    private SelenideElement secondCoatAddToCard = $("ol > li + li div.product-item-info button");
    //private SelenideElement secondCoatAddToCard = $("#maincontent > div.columns > div.column.main > div.products.wrapper.list.products-list > ol > li:nth-child(2) > div > div > div.product-item-inner > div.product.actions.product-item-actions > div.actions-primary > form > button");
    //Step 9.	Click to shopping cart
    private SelenideElement getIconCartValue = $("div.minicart-wrapper a span.counter");
    private SelenideElement cartIcon = $("a[href^='https://magento.softwaretestingboard.com/checkout/cart/']");
    //Step 10.	Check that coat is added
    private SelenideElement cartTitle = $("div.items-total");
    //Step 11.	Click delete item

    private SelenideElement deleteIcon = $("#mini-cart div.secondary > a");
    //Step 12.	Check that "Are you sure you would like to remove this item from the shopping cart?" is visible
    private SelenideElement popupText = $("#modal-content-104 > div");
    //Step 13.	Click on "Ok" button
    private SelenideElement popupButton = $("footer button.action-accept");
    //Step 14.	Check that cart provides the message "You have no items in your shopping cart".
    private SelenideElement deleteAfterCartNote = $("#minicart-content-wrapper > div.block-content > strong");
    public MenTopsCatalogPage(String pageUrl){
        super(pageUrl);
    }

    public void setStyleRainCoat() {
        styleSection.click();
        rainCoat.click();
    }

    public void selectViewList(){
        displayViewList.click();
    }
    public void selectViewGrid(){
        displayViewGrid.click();
    }

    public void sortByPosition(){
        sortByOptions.click();
        sortByOptions.selectOption(0);
    }
    public void sortByProductName(){
        sortByOptions.click();
        sortByOptions.selectOption(1);
    }
    public void sortByPrice(){
        sortByOptions.click();
        sortByOptions.selectOption(2);
    }
    public void selectFirstCoatSize(){
        firstCoatSizeM.click();
    }
    public void selectSecondCoatSize(){
        secondCoatSizeS.click();
    }
    public void selectFirstCoatColor(){
        firstCoatColorYellow.click();
    }
    public void selectSecondCoatColor(){
        secondCoatColorGreen.click();
    }

    public void addToCartFirstCoat(){
        firstCoatAddToCard.click();
    }
    public void addToCartSecondCoat(){
        secondCoatAddToCard.click();
    }

    public void checkCartIcon1(){
        getIconCartValue.shouldHave(text("1"));
        cartIcon.click();
    }
    public void checkCartIcon2(){
        getIconCartValue.shouldHave(text("2"));
        cartIcon.click();
    }

    public void checkCartTitle1(){
        cartTitle.shouldHave(text(cartTitleText1));
    }
    public void checkCartTitle2(){
        cartTitle.shouldHave(text(cartTitleText2));
    }

    public void deleteCartItem(){
        deleteIcon.click();
    }
    public void checkPopupText(){
        popupText.shouldHave(text(deletePopupText));
    }

    public void submitPopup(){
        popupButton.click();
    }

    public void checkDeleteAfterNote(){
        deleteAfterCartNote.shouldHave(text(deleteAfterNote));
    }


}
