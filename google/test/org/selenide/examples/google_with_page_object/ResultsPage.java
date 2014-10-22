package org.selenide.examples.google_with_page_object;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage {
  public ElementsCollection results() {
    return $$("#ires li.g");
  }
}
