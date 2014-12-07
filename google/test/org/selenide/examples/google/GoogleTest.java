package org.selenide.examples.google;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
  @Test
  public void search_selenide_in_google() {
    open("http://google.com");
    $(By.name("q")).val("selenide").pressEnter();
    $$("#ires li.g").shouldHave(size(10));
    $("#ires li.g").shouldBe(visible).shouldHave(
        text("Selenide: concise UI tests in Java"),
        text("selenide.org"));
  }
}
