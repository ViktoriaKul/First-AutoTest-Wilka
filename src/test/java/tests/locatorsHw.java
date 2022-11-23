package tests;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class locatorsHw {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://magento.softwaretestingboard.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void happyPath(){
        //Step 1
        open("/men/tops-men/jackets-men.html");

        //Step 2.	Open tab Men - > Tops
        $(By.cssSelector("a#ui-id-5")).hover();
        $(By.cssSelector("a[href^='https://magento.softwaretestingboard.com/men/tops-men.html']")).click();

        //Step 3.	Select Style -> Rain coat
        $(By.cssSelector("div#narrow-by-list>div+div")).click(); //expand style section
        $(By.cssSelector("a[href^='https://magento.softwaretestingboard.com/men/tops-men.html?style_general=122']")).click();

        //Step 4.	Select via as List
        $(By.xpath("//*[@id=\"mode-list\"]")).click();

        //Step 5.	Sort by Price
        $(By.cssSelector("select#sorter")).click();
        $(By.cssSelector("select#sorter")).selectOption(2);

        //Step 6.	Select size of first coat (M)
        $(By.cssSelector("div#option-label-size-143-item-168")).click();

        //Step 7.	Select color of fist coat (yellow)
        $(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();

        //Step 8.	Click "Add to cart" button
        $(By.cssSelector("li div.product-item-info button")).click();
    }
}
