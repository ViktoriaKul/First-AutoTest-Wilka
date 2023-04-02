package pageObject.pages;

import com.codeborne.selenide.Condition;
import core.Constants;
import core.Navigation;
import core.elements.BaseElement;
import org.openqa.selenium.By;
import pageObject.components.NavigationBar;

public class MainPage {
    public NavigationBar navigationBar = new NavigationBar();
    public BaseElement dropdownIcon = new BaseElement(By.xpath("//span[contains(@class,'ui-menu-icon')]"),
            "Dropdown Icon");
    public BaseElement signInLink = new BaseElement(By.xpath("//li[contains(@class, 'authorization-link')]"), "Sign in");

     public void open(){
        Navigation.open(Constants.BASE_URL);
        waitForPageToLoad();
    }

    private void waitForPageToLoad(){
        dropdownIcon.getElement().shouldBe(Condition.visible);
    }

    public void clickSignIn(){
        signInLink.click();
    }
    public void selectMenJackets(){
        navigationBar.expandMenCategory();
        navigationBar.selectJacketsSubCategory();
    }

    public void selectWomenTees(){
        navigationBar.expandWomenCategory();
        navigationBar.selectTeesSubCategory();
    }

    public void selectMenPants(){
        navigationBar.expandMenCategory();
        navigationBar.selectPantsSubCategory();
    }



}

