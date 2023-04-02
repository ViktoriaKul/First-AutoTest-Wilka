package tests;

import core.elements.BaseElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class LoginTest extends BasicTest {
    String email = "v.kul@godeltech.com";
    String password = "$RFV4rfv";

    public BaseElement welcomeText = new BaseElement(By.xpath("//span[contains(@class,'logged-in')]" ), "");

    @Test
    void loginTest(){
        mainPage.open();
        mainPage.clickSignIn();
        loginPage.loginAsUser(email, password);
        Assertions.assertTrue(welcomeText.getElement().isDisplayed());
    //    Assertions.assertEquals("Welcome, Viktoryia Kul!", welcomeText.getText());
    }
}
