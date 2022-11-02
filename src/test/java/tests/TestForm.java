package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestForm {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void happyPath(){
        String firstName = "John";
        String lastName = "Snow";
        String userEmail = "JohnSnow@gmail.com";
        String userPhone = "1234567890";
        String currentAddress = "Wroclaw";


        open("/automation-practice-form");

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("[id=firstName]").setValue(firstName);
        $("[id=lastName]").setValue(lastName);
        $("[id=userEmail]").setValue(userEmail);
        $("[for=gender-radio-1]").click();
        //тут были попытки выбрать дату на дейтпикере, но активные там только элементы года и месяца, а день не получает фокус табами
        //$("[id=dateOfBirthInput]").click();
       // $("[class=react-datepicker-ignore-onclickoutside]").clear();
        //click().clear().setValue("01 May 1999");
        //$("[class=react-datepicker__month-select]").setValue("May");
       // $("[class=react-datepicker__year-select]").setValue("1999");
       // $("[class=react-datepicker__day--028").click();
        // рабочий вариант выбора даты!
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1999");
        $(".react-datepicker__month-select").selectOption("May");
        $("[aria-label = 'Choose Saturday, May 1st, 1999']").click();


        $("[id=userNumber]").setValue(userPhone);
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("[id=currentAddress]").setValue(currentAddress);

       $("[id=submit]").click();

        $("[class=modal-content]").shouldHave(text(firstName + " " + lastName), text(userEmail), text(userPhone), text("Music"), text(currentAddress), text("01 May,1999"));
        $("[id=closeLargeModal]").shouldBe(visible);

        System.out.println("Passed");
    }
}
