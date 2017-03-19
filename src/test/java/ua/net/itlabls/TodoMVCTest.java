package ua.net.itlabls;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSelector;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.getWebDriverLogs;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Itachik on 01.03.2017.
 */
public class TodoMVCTest {
    @Test
    public void testCreateTask(){


        open("https://www.fredperry.com/shop");
        $("#header > div > div.skip-links > ul.skip-links-right > li:nth-child(4) > div").click();
        $("#email_panel").setValue("itachik22@i.ua");
        $("#pass_panel").setValue("itachik66666");
        $("#send2_panel").click();
        $("#login-form > div > div.col-2.new-users > div.buttons-set > a").click();
        $("#prefix");
        $("#prefix").selectOptionByValue("Mr");       //.val("Mr").click();
                                                                                               //селлекторы,код в файле блокнот
        $("#firstname").setValue("Vlad");
        $("#lastname").setValue("Kostenko");
        $("#email_address").setValue("itachik22@i.ua");
        $("#email_address_confirm").setValue("itachik22@i.ua");
        $("#day").setValue("26");
        $("#month").setValue("12");
        $("#year").setValue("1989");
        $("#password").setValue("itachik66666");
        $("#confirmation").setValue("itachik66666");
        $("#form-validate > div.buttons-set > button").click();
       // $("").click();








    }
}
