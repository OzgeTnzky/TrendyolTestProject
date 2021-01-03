package com.test.Page;

import com.test.BaseModel.BasePage;
import org.openqa.selenium.WebDriver;
import static com.test.Constants.PageConstant.*;

public class AddToBasket extends BasePage {

    public AddToBasket(WebDriver driver) {
        super(driver);
    }

    public void addToBasket() throws InterruptedException {

        selectBoutique(BOUTIQUES);
        productPageLoad(PRODUCTS);
        isProductExist(PRODUCTS_PLACE_HOLDER);
        selectBoutique(PRODUCTS);
        clickElement(ADD_BASKET);
        clickElement(BASKET);
    }
}
