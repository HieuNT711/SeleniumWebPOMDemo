package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import until.HandleStringUtils;

public class DetailCardPage extends BasePage {
    public DetailCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='coupon_code']")
    public WebElement inputDiscount;

    @FindBy(xpath = "//span[contains(text(),'Apply')]")
    public WebElement btnApply;

    @FindBy(xpath = "//span[normalize-space()='-$5.00']")
    public WebElement txtPrintOfDiscount;

    @FindBy(xpath = "//tbody//td[@class='a-right']//span[@class='price'][normalize-space()='$100.00']")
    public WebElement txtSubTotal;

    @FindBy(xpath = "//strong//span[@class='price'][normalize-space()='$100.00']")
    public WebElement txtGrandTotalPrice;

    @FindBy(xpath = "//span[contains(text(),'Some of the products cannot be ordered in requeste')]")
    public WebElement txtMessError;

    @FindBy(xpath = "//p[@class='item-msg error']")
    public WebElement txtMaxQuantityError;

    @FindBy(xpath = "//input[@title='Qty']")
    public WebElement inputQTY;

    @FindBy(xpath = "//button[@title='Update']")
    public WebElement btnUpdate;

    @FindBy(xpath = "//span[contains(text(),'Empty Cart')]")
    public WebElement btnEmptyCart;

    public void sendKeyToInputDiscount(String discount) {
        inputDiscount.sendKeys(discount);
    }

    public void clickBtnApply() {
        btnApply.click();
    }

    public float getPriceOfDiscount() {
        String txtPriceDiscount = txtPrintOfDiscount.getText();
        return Float.parseFloat(HandleStringUtils.getStringByIndex(txtPriceDiscount, 2, 5));
    }

    public float getSubTotalPrice() {
        String txtSubTotalText = txtSubTotal.getText();
        return Float.parseFloat(HandleStringUtils.getStringByIndex(txtSubTotalText, 2, 5));
    }

    public float getGrandTotalPrice() {
        String txtGrandTotalText = txtGrandTotalPrice.getText();
        return Float.parseFloat(HandleStringUtils.getStringByIndex(txtGrandTotalText, 2, 5));
    }

    public String getTxtMessError() {
        return txtMessError.getText();
    }

    public String getTxtMaxQuantityError() {
        return txtMaxQuantityError.getText();
    }

    public void setInputQTY(String quantity) {
        inputQTY.sendKeys(quantity);
    }

    public void clickBtnUpdate() {
        btnUpdate.click();
    }

    public void clickBtnEmptyCart(){
        btnEmptyCart.click();
    }

}
