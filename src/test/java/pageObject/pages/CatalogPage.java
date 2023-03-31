package pageObject.pages;
import core.elements.BaseElement;
import org.openqa.selenium.By;
import pageObject.components.ProductItem;

public class CatalogPage {
    public BaseElement cartIcon = new BaseElement(By.xpath("//a[@class='action showcart']"),
            "Cart Icon");
    private ProductItem getProduct(int id){
        return new ProductItem(By.xpath(String.format("(//div[@class='product-item-info'])[%d]", id)),
                String.format("Store product <%d>", id));
    }

    public void selectSize (int productId, String size){
        getProduct(productId).selectSize(size);
    }

    public void selectColor(int productId, String color){
        getProduct(productId).selectColor(color);
    }

    public void addProductToCart(int productId){
        getProduct(productId).hover();
        getProduct(productId).addToCart();
    }

    public void clickCartIcon(){
        cartIcon.click();
    }

}
