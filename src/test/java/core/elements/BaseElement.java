package core.elements;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;

public class BaseElement {
    private SelenideElement element;
    private String name;

    public BaseElement(By locator, String elementName){
        element = $(locator);
        name = elementName;
    }

    public BaseElement(SelenideElement element, String elementName){
        this.element = element;
        name = elementName;
    }

    public SelenideElement getElement(){
        return element;
    }

    public String getName(){
        return name;
    }

    public BaseElement find(By locator, String elementName){
        return new BaseElement(getElement().find(locator), elementName);
    }

    public BaseElementsCollection findAll(By locator, String collectionName){
        return new BaseElementsCollection(getElement().findAll(locator), collectionName);
    }

    public void click(){
        //simplified version of logging for demo purposes only, logger should be used instead
        System.out.println(String.format("Click %s", name));

        element.click();
    }

    public void hover(){
        System.out.println(String.format("Hover over elements %s", name));

        element.hover();
    }

    public void sendKeys(String value){
        System.out.println(String.format("Send <%s> value to %s elements", value, name));

        element.sendKeys(value);
    }

    public void sendKeys(Keys value){
        System.out.println(String.format("Send <%s> key to %s elements", value.name(), name));

        element.sendKeys(value);
    }

    public String getAttribute(String attributeName){
        System.out.println(String.format("Get attribute <%s> of elements %s", attributeName, name));

        return element.getAttribute(attributeName);
    }

    public String getText(){
        System.out.println(String.format("Get text of elements %s", name));

        return element.getText();
    }

}
