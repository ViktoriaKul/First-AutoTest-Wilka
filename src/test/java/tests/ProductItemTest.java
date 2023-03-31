package tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Logger;

public class ProductItemTest extends BasicTest {
    @Test
    //Test1
    public void CheckAddingFirstItemToCart() {
        Logger logger = Logger.getLogger(ProductItemTest.class.getName());
        logger.info("Test started");
        mainPage.open();
        mainPage.selectMenJackets();
        logger.info("Selecting first item");
        catalogPage.selectSize(1, "XS");
        catalogPage.selectColor(1, "Blue");
        catalogPage.addProductToCart(1);
        Assertions.assertEquals("1",cartWidget.getCartQty());
        logger.info("Test completed");
    }

    //Test 2 Women>Tops>Tees>Second
    @Test
    public void CheckAddingSecondItemToCart() {
        mainPage.open();
        mainPage.selectWomenTees();
        catalogPage.selectSize(2, "S");
        catalogPage.selectColor(2, "Yellow");
        catalogPage.addProductToCart(2);
        Assertions.assertEquals("2",cartWidget.getCartQty());
        catalogPage.selectSize(4, "M");
        catalogPage.selectColor(4, "Green");
        catalogPage.addProductToCart(4);
        Assertions.assertEquals("3",cartWidget.getCartQty());
    }

    //Test3 Men>Bottoms>Pants>3
    @Test
    public void CheckAddingThirdItemToCart(){
        mainPage.open();
        mainPage.selectMenPants();
        catalogPage.selectSize(3, "36");
        catalogPage.selectColor(3, "Black");
        catalogPage.addProductToCart(3);
        Assertions.assertEquals("4",cartWidget.getCartQty());
    }
}
