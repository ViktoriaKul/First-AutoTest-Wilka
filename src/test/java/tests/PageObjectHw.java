package tests;
import core.elements.BaseElement;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class PageObjectHw extends BasicTest{
    String email = "v.kul@godeltech.com";
    String password = "$RFV4rfv";
  //  public BaseElement popupText = new BaseElement(By.xpath("//*[@id=\"modal-content-186\"]/div"), "");
    @Test
    public void AddRemoveCartItemTest() {
        Logger logger = Logger.getLogger(ProductItemTest.class.getName());
        logger.info("Test started");
        mainPage.open();
        mainPage.clickSignIn();
      //  loginPage.loginAsUser(email, password);
      //  mainPage.selectMenJackets();
        catalogPage.selectSize(1, "XS");
        catalogPage.selectColor(1, "Blue");
        catalogPage.addProductToCart(1);
        Assertions.assertEquals("1",cartWidget.getCartQty());
        logger.info("1 item in cart");
        mainPage.selectWomenTees();
        catalogPage.selectSize(2, "S");
        catalogPage.selectColor(2, "Yellow");
        catalogPage.addProductToCart(2);
        Assertions.assertEquals("2",cartWidget.getCartQty());
        logger.info("2 items in cart");
        logger.info("expand cart");
        cartWidget.openCartWidget();
        logger.warning("removing first cart item");
        cartWidget.removeItemFromCart();
        popup.confirmRemoving();
        Assertions.assertEquals("1",cartWidget.getCartCounter());
        logger.info("1 item in cart");
    }
}
