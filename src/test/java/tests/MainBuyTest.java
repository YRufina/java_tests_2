package tests;

import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.ListProductAtributs;
import pages.MainBuy;

import static constans.Constants.CssLocators.*;
import static constans.Constants.CssLocatorsOfCart.*;
import static constans.Constants.Urls.URL_SHOP;


public class MainBuyTest{
    /*
    * покупка товаров в количестве 4шт
    * */
    @Test
    public void firsTest() throws InterruptedException {
        // arrange
        BasePage basePage = new BasePage();

        // act
        basePage.goToUrl(URL_SHOP);
        MainBuy.findClick(findRubrics);
        MainBuy.findClick(findJeans);
        MainBuy.findClick(findModelJeans);
        Thread.sleep(1000);
        ListProductAtributs listAtributsJeans = MainBuy.selectSizeJeans(chooseSize);
        Thread.sleep(1000);

        MainBuy.findSubmit(plusCart);
        Thread.sleep(1000);



        MainBuy.findClick(findRubrics);
        MainBuy.findClick(forWoman);
        MainBuy.findClick(findHomeClothes);
        MainBuy.findClick(findModelHomeClothes);
        ListProductAtributs listAtributsHomeClothes = MainBuy.selectSizeJeans(chooseSizeHomeClothes);
        //MainBuy.selectSizeJeans(chooseSizeHomeClothes);
        Thread.sleep(2000);
        MainBuy.findSubmit(plusCart_2);
        Thread.sleep(2000);

        MainBuy.findClick(menuAksessuary);
        MainBuy.findClick(findModelBag);
        Thread.sleep(1000);
        ListProductAtributs listAtributsBag = MainBuy.selectSizeJeans(chooseSizeBag);
        MainBuy.findSubmit(plusCart_2);
        Thread.sleep(1000);
        MainBuy.findClick(doublePlusCart);

        MainBuy.findClick(goCart);
/*
* проверка
* */
        MainBuy.checkAtributs(listAtributsJeans.getName(), cartTitleJeans.text());
        MainBuy.checkAtributs( cartSizeJeans.text(),listAtributsJeans.getSize());
        MainBuy.checkAtributsPrice(listAtributsJeans.getPrice(),cartPriceJeans.text());

        MainBuy.checkAtributs(listAtributsHomeClothes.getName(), cartTitleHomeClothes.text());
        MainBuy.checkAtributs( cartSizeHomeClothes.text(),listAtributsHomeClothes.getSize());
        MainBuy.checkAtributsPrice(listAtributsHomeClothes.getPrice(),cartPriceHomeClothes.text());

        MainBuy.checkAtributs(listAtributsBag.getName(), cartTitleBag.text());
        MainBuy.checkAtributs( cartSizeBag.text(),listAtributsBag.getSize());
      //  MainBuy.checkAtributs( cartColorBag.text(),listAtributsBag.getColor());
        MainBuy.checkAtributsPrice(listAtributsBag.getPrice(),cartPriceBag.text());

       MainBuy.assertCountInCart(cssCountCheckbox,cartCountProduct);

       Thread.sleep(6000);

    }

}
