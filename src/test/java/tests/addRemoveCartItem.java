//package tests;
//
//import pageObject.*;
//import com.codeborne.selenide.Configuration;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import pageObject.pages.MainPage;
//
//public class addRemoveCartItem {
//    String email = "v.kul@godeltech.com";
//    String password = "$RFV4rfv";
//    LoginPage loginPage = new LoginPage("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
//    MainPage mainPage = new MainPage("https://magento.softwaretestingboard.com/customer/account/index/");
//    MenCatalogPage menCatalogPage = new MenCatalogPage("https://magento.softwaretestingboard.com/men.html");
//    MenTopsCatalogPage menTopsCatalogPage = new MenTopsCatalogPage("https://magento.softwaretestingboard.com/men/tops-men.html");
//    CartPage cartPage = new CartPage("https://magento.softwaretestingboard.com/checkout/cart/");
//
//
//    @BeforeAll
//    static void beforeAll(){
//        Configuration.holdBrowserOpen = true;
//    }
//
//    @Test
//    void addRemoveCartItem1(){
//        loginPage.open();
//        loginPage.loginAsUser(email, password);
//        mainPage.goToMenCatalog();
//        menCatalogPage.goToTopsCatalog();
//        menTopsCatalogPage.setStyleRainCoat();
//        menTopsCatalogPage.selectViewList();
//        menTopsCatalogPage.sortByPrice();
//        menTopsCatalogPage.selectFirstCoatSize();
//        menTopsCatalogPage.selectFirstCoatColor();
//        menTopsCatalogPage.addToCartFirstCoat();
//        menTopsCatalogPage.checkCartIcon1();
//        menTopsCatalogPage.checkCartTitle1();
//        menTopsCatalogPage.deleteCartItem();
//        menTopsCatalogPage.checkPopupText();
//        menTopsCatalogPage.submitPopup();
//        menTopsCatalogPage.checkDeleteAfterNote();
//        mainPage.logout();
//    }
//
//    @Test
//    void addRemoveCartItem2(){
//        loginPage.open();
//        loginPage.loginAsUser(email, password);
//        mainPage.goToMenCatalog();
//        menCatalogPage.goToTopsCatalog();
//        menTopsCatalogPage.setStyleRainCoat();
//        menTopsCatalogPage.selectViewList();
//        menTopsCatalogPage.sortByPrice();
//        menTopsCatalogPage.selectFirstCoatSize();
//        menTopsCatalogPage.selectFirstCoatColor();
//        menTopsCatalogPage.addToCartFirstCoat();
//        menTopsCatalogPage.sortByProductName(); // sort by Product name
//        menTopsCatalogPage.selectSecondCoatSize(); //select second coat size
//        menTopsCatalogPage.selectSecondCoatColor(); //select color
//        menTopsCatalogPage.addToCartSecondCoat(); // add to cart
//        menTopsCatalogPage.checkCartIcon2(); // check cart icon value has changed to 2
//        menTopsCatalogPage.checkCartTitle2(); // check cart title
//        cartPage.open(); //open cart
//        cartPage.deleteFirstItem(); //remove first item
//        cartPage.deleteFirstItem(); // remove second item
//        cartPage.checkEmptyCartTitle(); //check that cart is empty
//        mainPage.logout();
//    }
//
//}
