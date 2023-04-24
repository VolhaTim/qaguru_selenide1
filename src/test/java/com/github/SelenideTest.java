package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.holdBrowserOpen=true;
    }

    @Test
    void SuccessSelenideTest(){
        open ("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $(byTagAndText("a","SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("JUnit5"));

    }

}
