package tests;

import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.Test;


public class LogoutTest {
    String email = "v.kul@godeltech.com";
    String password = "$RFV4rfv";
    LoginPage loginPage = new LoginPage("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
    MainPage mainPage = new MainPage("https://magento.softwaretestingboard.com/customer/account/index/");
    @Test
    void loginTest(){
        loginPage.open();
        loginPage.loginAsUser(email, password);
        mainPage.logout();
    }
}
