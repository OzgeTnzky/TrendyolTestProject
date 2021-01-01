package com.test.Test;
import com.test.BaseModel.BaseTest;
import com.test.Page.LoginPage;
import com.test.Page.AddToBasket;
import com.test.Page.ImageControlPage;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TrendyolTest extends BaseTest {

    final static Logger logger = Logger.getLogger(TrendyolTest.class);
    ImageControlPage imageControlPage;
    LoginPage loginPage;
    AddToBasket addToBasket;

    @Before
    public void beforeTest(){
        loginPage = new LoginPage(getDriver());
        imageControlPage = new ImageControlPage(getDriver());
        addToBasket = new AddToBasket(getDriver());
        getDriver().navigate().to("https://www.trendyol.com/");
        logger.info("Test Edilecek Sayfa : " + getDriver().getTitle());
    }

    @Test
    public void trendyolTest() throws InterruptedException {
        loginPage.loginPage();
        imageControlPage.imageControlPage();
        addToBasket.addToBasket();
    }

    @After
    public void afterTest(){
        getDriver().quit();
    }
}
