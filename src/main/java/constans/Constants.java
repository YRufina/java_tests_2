package constans;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Constants {
    public static class Urls {
        public static final String URL_SHOP = "https://navisale.ru";
        public static final String URL_PRODUCT_PAGE = "https://navisale.ru/p-new-balance-unisex-kirmizi-sirt-cantasi-V94373094";
    }

    public static class CssLocators {
        public static SelenideElement findRubrics = $(By.id("rubrics-toggle"));
        public static SelenideElement findJeans = $(new ByAttribute("title", "Джинсы"));
        public static SelenideElement findModelJeans = $(By.cssSelector(".product-listing-card:nth-child(1) .product-listing-card__preview-link"));//модель

        public static SelenideElement chooseSize = $(By.cssSelector("div.option-item.option-item_type_size label.option-item__label[for='param_item_344836_5_10499100']"));
        public static SelenideElement plusCart = $(By.cssSelector("button.btn.btn_primary.btn_size_l.card-product-btns__btn"));
        public static SelenideElement goCart = $(By.cssSelector("a[href='/my/shopping-cart'],[class='btn btn_accent btn_size_l card-product-btns__btn']"));

        /**
         * второй товар-женская пижама
         **/
        public static SelenideElement forWoman = $(new ByAttribute("title", "Женщинам"));
        public static SelenideElement findHomeClothes = $(By.cssSelector(".rubrics-catalog__sub-item:nth-child(6) > .rubrics-catalog__sub-link"));
        public static SelenideElement findModelHomeClothes = $(By.cssSelector("a[href='/p-flora-by-flora-nikrooz-kit-heart-lace-matte-charmeuse-wrap-robe-V71136086']"));
        public static SelenideElement chooseSizeHomeClothes = $(By.cssSelector("div.option-item.option-item_type_size label.option-item__label[for='param_item_344836_2_11092577']"));
        public static SelenideElement plusCart_2 = $(By.cssSelector("button.btn.btn_primary.btn_size_l.card-product-btns__btn"));
        /**
         * 3 товар-Аксессуары+2 шт
        **/
        public static SelenideElement menuAksessuary = $(new ByAttribute("title", "Аксессуары"));
        public static SelenideElement findModelBag = $(By.cssSelector("a.product-listing-card__preview-link[href='/p-new-balance-unisex-kirmizi-sirt-cantasi-V94373094']"));
        public static SelenideElement chooseSizeBag = $(By.cssSelector("div.option-item.option-item_type_size label.option-item__label[for='param_item_344836_5_82030']"));
        public static SelenideElement doublePlusCart =  $(By.cssSelector("button.btn_only-icon:nth-child(3)"));

    }
        public static class CssLocatorsOfCart{
        public static SelenideElement cartTitleJeans = $(By.cssSelector(".group-items:nth-child(1) .cart-item-default__title"));
        public static SelenideElement cartSizeJeans = $(By.cssSelector(".group-items:nth-child(1) .cart-item-default__props-item"));
        public static SelenideElement cartPriceJeans = $(By.cssSelector(".group-items:nth-child(1) .cart-item-default__price"));

        public static SelenideElement cartTitleHomeClothes = $(By.cssSelector(".group-items:nth-child(2) .cart-item-default__title"));
        public static SelenideElement cartSizeHomeClothes = $(By.cssSelector(".group-items:nth-child(2) .cart-item-default__props-item"));
        public static SelenideElement cartPriceHomeClothes = $(By.cssSelector(".group-items:nth-child(2) .cart-item-default__price"));

        public static SelenideElement cartTitleBag = $(By.cssSelector(".group-items:nth-child(3) .cart-item-default__title"));
        public static SelenideElement cartSizeBag = $(By.cssSelector(".group-items:nth-child(3) .cart-item-default__props-item:nth-child(1)"));
        //public static SelenideElement cartColorBag = $(By.cssSelector(".group-items:nth-child(3) .cart-item-default__props-item:nth-child(2)"));
        public static SelenideElement cartPriceBag = $(By.cssSelector(".group-items:nth-child(3) .cart-item-default__price"));
        public static String cssCountCheckbox = "input.checkbox__input[checked='true']";
        public static SelenideElement cartCountProduct = $(By.cssSelector("span.js-more"));
    }

    public static class CssLocatorsOfProductPage{
     //   $x("//dd[contains(.,'Large Size')]")
     //   public static SelenideElement productPageSize = $(By.cssSelector(".parameters-list-group:nth-child(3) .parameters-list__detail"));
        public static SelenideElement productPageBrend = $(By.cssSelector(".parameters-list-group:nth-child(3) .parameters-list__item:nth-child(1) > .parameters-list__detail"));
        public static SelenideElement productPageColor = $(By.cssSelector(".parameters-list-group:nth-child(2) .parameters-list__item:nth-child(1) > .parameters-list__detail"));
        public static SelenideElement productPageSidebarSize = $(By.cssSelector(".options-group__list-item:nth-child(2) .option-item__label"));
        public static SelenideElement productTitleName = $(By.cssSelector("h1#name"));
}
    public static class UrlApiRequest{
        public  static String UrlPostDelay ="https://httpbin.org/delay/";
    }
}
