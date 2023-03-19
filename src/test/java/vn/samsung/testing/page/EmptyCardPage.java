package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptyCardPage extends BasePage {
    public EmptyCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[normalize-space()='Shopping Cart is Empty']")
    public WebElement txtNotification;

    public String getTextOfTxtNotification() {
        return txtNotification.getText();
    }

}
