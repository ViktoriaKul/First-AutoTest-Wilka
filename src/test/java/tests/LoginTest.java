package tests;

import core.elements.BaseElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class LoginTest extends BasicTest {
    String email = "v.kul@godeltech.com";
    String password = "$RFV4rfv";

    public BaseElement warningText = new BaseElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div" ), "");

    @Test
    void loginTest(){
        mainPage.open();
        mainPage.clickSignIn();
        loginPage.loginAsUser(email, password);
        Assertions.assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", warningText.getText());
    }
}
