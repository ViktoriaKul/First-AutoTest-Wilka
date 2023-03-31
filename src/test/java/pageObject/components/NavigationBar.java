package pageObject.components;
import core.elements.Dropdown;
import org.openqa.selenium.By;

public class NavigationBar {
    public Dropdown MenCategory = new Dropdown(By.xpath("//span[text()='Men']/../.."),
            "Men category");
    public Dropdown WomenCategory = new Dropdown(By.xpath("//span[text()='Women']/../.."),
            "Women category");


    public void expandMenCategory(){
    MenCategory.expand();
}
    public void expandWomenCategory(){
        WomenCategory.expand();
    }
public void selectJacketsSubCategory(){
    MenCategory.expandOption(0);
    MenCategory.selectSubOption(0,0);
}

public void selectTeesSubCategory(){
        WomenCategory.expandOption(0);
        WomenCategory.selectSubOption(0,2);
}

public void selectPantsSubCategory(){
    MenCategory.expandOption(1);
    MenCategory.selectSubOption(1,0);
}
}
