package pageObject.components;
import core.elements.BaseElement;
import org.openqa.selenium.By;
public class FilterOption{
    public BaseElement filterOption = new BaseElement( By.xpath("./div[contains(@class, 'filter-options-title')]"),
            "Style");

    public void selectFilterOptionStyle(){
        filterOption.click();
    }


    }


