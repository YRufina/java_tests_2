package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainBuy extends BasePage{

   // private static SelenideElement chooseSizeRadio = $(By.cssSelector("input#param_item_344836_5_10499100"));

    public static void  findClick(SelenideElement selenideElement){
        selenideElement.shouldBe(Condition.visible, Duration.ofSeconds(200)).click();
    }

    public static void  findSubmit(SelenideElement selenideElement){
        selenideElement.shouldBe(Condition.visible, Duration.ofSeconds(200)).click();
    }

    public static ListProductAtributs selectSizeJeans(SelenideElement selenideElement) throws InterruptedException {
        selenideElement.shouldBe(Condition.enabled,Duration.ofSeconds(20)).click();
        ListProductAtributs listProductAtributs = new ListProductAtributs();
        //поиск на карточке товара
        SelenideElement titleName = $(By.cssSelector("h1#name"));
       // SelenideElement titleColor = $(By.cssSelector("h1#name"));
        SelenideElement titlePriceJeans = $(By.cssSelector("div.price__regular"));
        listProductAtributs.setName(titleName.text());
        listProductAtributs.setSize(selenideElement.text());
        listProductAtributs.setColor(selenideElement.text());
        listProductAtributs.setPrice(titlePriceJeans.text());
       // selenideElement.shouldBe(Condition.enabled,Duration.ofSeconds(200)).click();
       return listProductAtributs;

    }
    public static void checkAtributs(String titleAtrubut, String cartAtribut) {
      boolean  expName =  titleAtrubut.contains(cartAtribut);
      System.out.println(expName);
      //  Assert.assertEquals(titleJeans, cartTitleJeansTxt);
    }
    public static void checkAtributsPrice(String titlePrice, String cartAtributPrice) {
        Assert.assertEquals(titlePrice, cartAtributPrice);
        System.out.println(cartAtributPrice);

    }
    /**
     * check количствf выбранных товаров в корзине c итоговой в sidebar
     * */
    public static void assertCountInCart(String cssCountCheckbox, SelenideElement cartCountProduct) {
        ElementsCollection cartCountActiveCheckbox = $$(By.cssSelector("input.checkbox__input[checked='true']"));
        int rezult = cartCountActiveCheckbox.size();
        //   int aa =  cartCountProduct.text().indexOf("шт");
        //String bb = cartCountProduct.text().substring(0,aa).trim();
        int sumCart = Integer.valueOf(cartCountProduct.text().substring(0,cartCountProduct.text().indexOf("шт")).trim());
        Assert.assertEquals(rezult,sumCart);
//        int j=1;
//        double sum=0;
//        for(SelenideElement i : cartCountActiveCheckbox ){
//
//            SelenideElement cartPrice = $(By.cssSelector(".group-items:nth-child("+j+") .cart-item-default__price"));
//            cartPrice.text();
//
//String aa = cartPrice.text().trim().substring(0, cartPrice.text().length()-1);
//double bb= Double.valueOf(aa.replace(" ",""));
//sum = sum+bb;
//        System.out.println("цена в корзине "+ cartPrice.text()+" + " + bb+" + "+ sum);
//j++;
//        }
    //    System.out.println(rezult +"="+ sumCart);

    }
//    public static void checkAtributs(String titleJeans, String cartTitleJeansTxt) {
//        boolean  expName1 =  titleJeans.contains(cartTitleJeansTxt);
//        System.out.println(expName1);
//        //  Assert.assertEquals(titleJeans, cartTitleJeansTxt);
//    }
}







