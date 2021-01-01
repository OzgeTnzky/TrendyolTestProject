package com.test.Page;
import com.test.BaseModel.BasePage;
import org.openqa.selenium.WebDriver;
import static com.test.Constants.PageConstant.*;

public class ImageControlPage extends BasePage {

    public ImageControlPage(WebDriver driver) {
        super(driver);
    }

    public void imageControlPage() throws InterruptedException {

        controlBoutiqueImage(WOMAN,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(MAN,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(KIDS,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(HOME,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(SUPERMARKET,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(COSMETIC,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(SHOE_BAG,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(CLOCK_ACCESSORIES,BOUTIQUES,PLACE_HOLDER);
        controlBoutiqueImage(ELECTRONIC,BOUTIQUES,PLACE_HOLDER);
    }
}
