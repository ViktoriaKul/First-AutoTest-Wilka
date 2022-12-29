package Pages;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class MenCatalogPage extends BasePage{
    private SelenideElement menuMenTops = $("a#ui-id-5");
    private SelenideElement menTopsCatalogLink = $("a[href^='https://magento.softwaretestingboard.com/men/tops-men.html']");

    public MenCatalogPage(String pageUrl){
        super(pageUrl);
    }

    public void goToTopsCatalog(){
        menuMenTops.hover();
        menTopsCatalogLink.click();
    }
}