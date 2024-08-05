package pages;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
   // private final SelenideElement findRubrics = $(By.id("rubrics-toggle"));


    public void goToUrl(String url){
        open(url);
    }

}
