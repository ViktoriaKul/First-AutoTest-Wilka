package pageObject.components;
import core.elements.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
public class Popup {
    public BaseElement acceptActionButton = new BaseElement(By.xpath("/html/body/div[3]/aside[2]/div[2]/footer/button[2]"), "");
    public BaseElement declineActionButton = new BaseElement(By.xpath("//button[@class='action-decline']"), "");

    public BaseElement popupText = new BaseElement(By.xpath("//*[@id=\"modal-content-186\"]/div"), "");
    public void confirmRemoving(){
        acceptActionButton.click();
    }
    public void cancelRemoving(){
        declineActionButton.click();
    }
    public void getPopupText(){
        popupText.getText();
    }
}
