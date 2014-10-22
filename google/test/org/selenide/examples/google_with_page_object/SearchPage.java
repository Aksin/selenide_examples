package org.selenide.examples.google_with_page_object;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage {
  public ResultsPage search(String keyword) {
    $(By.name("q")).val("selenide").pressEnter();
    return page(ResultsPage.class);
  }
}
