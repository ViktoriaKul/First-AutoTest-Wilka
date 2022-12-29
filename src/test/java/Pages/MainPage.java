package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage{

    private SelenideElement menCatalogLink = $("a[href^='https://magento.softwaretestingboard.com/men.html']");
    private SelenideElement arrowMenuIcon = $("body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.customer-welcome > span > button");
    private SelenideElement signOut = $("a[href^='https://magento.softwaretestingboard.com/customer/account/logout/']");
    public MainPage(String pageUrl){
        super(pageUrl);
    }

    public void goToMenCatalog(){
        menCatalogLink.click();
    }
    public void logout(){
        arrowMenuIcon.click();
        signOut.click();
    }
}
