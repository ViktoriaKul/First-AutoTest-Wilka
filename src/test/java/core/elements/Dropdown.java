package core.elements;
import org.openqa.selenium.By;

public class Dropdown extends BaseElement{
    public Dropdown(By locator, String elementName){
        super(locator, elementName);
    }
    public BaseElementsCollection getOptions(){
        return findAll(By.xpath("./ul/li"),
                String.format("Dropdown %s options", getName()));
    }

    public BaseElementsCollection getSubOptions(int optionId){
        System.out.println(String.format("Get sub options of dropdown %s", getName()));

        return getOptions().get(optionId)
                .findAll(By.xpath("./ul/li"),
                        String.format("Sub options of option [%d] of dropdown %s", optionId, getName()));
    }

    public void expand(){
        hover();
    }

    public void selectOption(int optionId){
        getOptions().get(optionId).click();
    }

    public void expandOption(int optionId){
        getOptions().get(optionId).hover();
    }

    public void selectSubOption(int optionId, int subOptionId){
        getSubOptions(optionId).get(subOptionId).click();
    }

}
