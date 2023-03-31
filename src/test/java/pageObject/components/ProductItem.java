package pageObject.components;
import core.elements.BaseElement;
import core.elements.BaseElementsCollection;
import org.openqa.selenium.By;


public class ProductItem extends BaseElement {
    public BaseElement productName = find(
            By.xpath("./div[contains(@class, 'details')]/strong[contains(@class,'product name')]/a"),
            "Product name");
    public BaseElementsCollection productSizes = findAll(
            By.xpath("./div[contains(@class, 'details')]//div[contains(@aria-describedby, 'option-label-size')]"),
            "Product sizes");
    public BaseElementsCollection productColors = findAll(
            By.xpath("./div[contains(@class, 'details')]//div[contains(@aria-describedby, 'option-label-color')]"),
            "Product colors");
    public BaseElement addToCartButton = find(
            By.xpath("./div[contains(@class, 'details')]//button[@type='submit']"),
            "Add to cart button");

    public ProductItem(By locator, String elementName) {
        super(locator, elementName);
    }

    public void selectSize(String size){
        productSizes.getByText(size).click();
    }

    public void selectColor(String color){
        productColors.getByAttribute("aria-label", color).click();
    }

    public void addToCart(){
        addToCartButton.click();
    }
}
