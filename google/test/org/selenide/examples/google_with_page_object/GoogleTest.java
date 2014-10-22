package org.selenide.examples.google_with_page_object;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
  @Test
  public void search_selenide_in_google() {
    SearchPage searchPage = open("http://google.com", SearchPage.class);
    ResultsPage resultsPage = searchPage.search("selenide");
    
    resultsPage.results().shouldHave(size(10));
    resultsPage.results().get(0).shouldHave(text("selenide.org"));
  }
}
