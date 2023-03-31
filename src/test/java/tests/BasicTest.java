package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pageObject.pages.LoginPage;
import pageObject.components.CartWidget;
import pageObject.pages.CatalogPage;
import pageObject.pages.MainPage;

public class BasicTest {
    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();
    CartWidget cartWidget = new CartWidget();

    LoginPage loginPage = new LoginPage();

@BeforeAll
static void beforeAll(){
    Configuration.browserSize="1920x1080";
    Configuration.holdBrowserOpen = true;
}
}
