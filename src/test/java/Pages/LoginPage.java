package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private SelenideElement loginField =$("#email");
    private SelenideElement passwordField =$("#pass");
    private SelenideElement loginButton =$("#send2");

    public LoginPage(String pageUrl){
        super(pageUrl);
    }

    public void loginAsUser(String email, String password){
        loginField.setValue(email);
        passwordField.setValue(password);
        loginButton.click();
    }
}
