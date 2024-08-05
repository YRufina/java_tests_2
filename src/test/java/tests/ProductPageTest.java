package tests;

import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.ProductPage;

import static constans.Constants.CssLocatorsOfProductPage.*;
import static constans.Constants.Urls.URL_PRODUCT_PAGE;

public class ProductPageTest {
    @Test
    public void firsTest() {
        // arrange
        BasePage basePage = new BasePage();
        basePage.goToUrl(URL_PRODUCT_PAGE);
        ProductPage.assertSize(productPageSidebarSize,productTitleName);
        ProductPage.productContainsBrand(productPageBrend, productTitleName);
        ProductPage.productContainsColor(productPageColor, productTitleName);
    }
}
