package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubSolutionsTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.holdBrowserOpen=true;
    }
   @Test
   void githubSolutionsHoverTest(){
    open ("https://github.com/");
    $(byTagAndText("button","Solutions")).hover();
    $(byTagAndText("a","Enterprise")).click();
    //$(".h1-mktg").shouldHave(text("Build like the best")); один вариант
    $(withText("Build like the best")).shouldBe(visible);
    }
}
