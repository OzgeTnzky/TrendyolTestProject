package com.test.Page;

import com.test.BaseModel.BasePage;
import org.openqa.selenium.WebDriver;
import static com.test.Constants.PageConstant.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginPage() {

        clickElement(CHOOSE_WOMAN);
        clickElement(LOGIN_BUTTON);
        sendKeys(EMAIL, "ozgee94@gmail.com");
        sendKeys(PASSWORD, "Testdeneme1");
        clickElement(LOGIN);
    }
}
