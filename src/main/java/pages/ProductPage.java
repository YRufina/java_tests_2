package pages;

import com.codeborne.selenide.SelenideElement;

public class ProductPage extends BasePage{
    //BasePage basePage = new BasePage();
 //   public static SelenideElement productPageSize = $(By.cssSelector(".parameters-list-group:nth-child(3) .parameters-list__detail"));
    public static void assertSize(SelenideElement productPageSidebarSize,  SelenideElement productTitleName) {
     //   Assert.assertEquals(productPageSize.text(), productPageSidebarSize.text());
      //  System.out.println(productPageSize.text()+" = "+ productPageSidebarSize.text());
        boolean  expName =  productTitleName.text().contains(productPageSidebarSize.text().trim());
        System.out.println("СВЕРКА ПО размеру  "+ expName);
    }
    public static void productContainsBrand(SelenideElement productPageBrend, SelenideElement productTitleName) {
        boolean  expName =  productTitleName.text().contains(productPageBrend.text().trim());
        System.out.println("СВЕРКА ПО наименованию "+ expName);
        //  Assert.assertEquals(titleJeans, cartTitleJeansTxt);
    }
    public static void productContainsColor(SelenideElement productPageColor, SelenideElement productTitleName) {
        boolean  expName =  productTitleName.text().contains(productPageColor.text().trim());
        System.out.println("СВЕРКА ПО цвету "+ expName);
        //  Assert.assertEquals(titleJeans, cartTitleJeansTxt);
    }


}

