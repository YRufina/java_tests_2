import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstBuy {
    //  private CssLocators cssLocators = new CssLocators();
    @Test
    public void userCanLoginByUsername() {
        open("https://navisale.ru");
        //каталог
        SelenideElement searchbox = $(By.id("rubrics-toggle"));
        searchbox.click();
        //джинсы
        SelenideElement findJeans = $(new ByAttribute("title", "Джинсы"));
        findJeans.click();
        //выбираем модель
        SelenideElement fullHeaderButton = $(By.cssSelector(".product-listing-card:nth-child(1) .product-listing-card__preview-link"));
        //находим элемент и его атрибут - наименование джинс
        SelenideElement titleNameJeans = $(By.cssSelector(".product-listing-card:nth-child(1) .product-listing-card__info-widget-wrapper:nth-child(2) .product-listing-card-info__content"));
        String nameJeans = titleNameJeans.text();
        fullHeaderButton.shouldBe(visible, Duration.ofSeconds(20))
                .click();//переходим в карточку товара
        // выбираем размер и его атрибут
        SelenideElement chooseSize = $(By.cssSelector("div.option-item.option-item_type_size label.option-item__label[for='param_item_344836_5_10499100']"));
        //Duration.ofSeconds(1000);
      //  String titleSize = chooseSize.getAttribute("title");

        chooseSize.shouldBe(enabled).click();
        String titleSize = chooseSize.getAttribute("title");



        SelenideElement chooseSizeRadio = $(By.cssSelector("input#param_item_344836_5_10499100"));
    //    chooseSizeRadio.setSelected(true).click();

        if (chooseSizeRadio.isSelected()){
            System.out.println(titleSize+"    selected !!!!!");
            chooseSize.click();
        }
        else {
            System.out.println(titleSize +"   dop_click");
            chooseSize.click();
   //         Duration.ofSeconds(10000);
        }
        SelenideElement plusCart = $(By.cssSelector("button.btn.btn_primary.btn_size_l.card-product-btns__btn"));
        plusCart.shouldBe(enabled).click();
        //Duration.ofSeconds(1000);


//добавить в корзину
       // plusCart.click();
// перейти в корзину
        SelenideElement goCart = $(By.cssSelector("a[href='/my/shopping-cart'],[class='btn btn_accent btn_size_l card-product-btns__btn']"));
        goCart.click();
        SelenideElement cartTitleJeans = $(By.cssSelector("a.cart-item-default__title"));

       // SelenideElement cartTitleJeans = $(By.cssSelector("div.cart-item-default.group-items__item[data-id='1410862']" ));
        String cartTitleJeansTxt = cartTitleJeans.text();
        SelenideElement cartSizeJeans = $(By.cssSelector("div.cart-item-default li.cart-item-default__props-item"));
        String cartSizeJeansTxt = cartSizeJeans.text();
        Assert.assertEquals(nameJeans, cartTitleJeansTxt);
        Assert.assertEquals(titleSize,cartSizeJeansTxt);
        Duration.ofSeconds(20);
        //       parent.click();

        System.out.println("VERY NICE");


    }
}

