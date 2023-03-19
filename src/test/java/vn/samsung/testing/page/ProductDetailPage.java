package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='price']")
    public WebElement txtPriceOfProduct;

    public String getTextOfTxtPriceOfProduct() {
        return txtPriceOfProduct.getText();
    }

}
