package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MobilePage extends BasePage {
    public MobilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Sony Xperia']")
    private WebElement txtSonyXperia;
    @FindBy(xpath = "//span[@class='price']")
    private WebElement txtPriceOfSonyXperia;
    @FindBy(xpath = "//span[@id='product-price-1']/parent::div/following-sibling::div[@class='actions']//button")
    private WebElement addSonyXperiaToCard;

    public void clickTxtSonyXperia() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(txtSonyXperia)).click();
    }

    public String getTextOfTxtPriceOfSonyXperia() {
        return txtPriceOfSonyXperia.getText();
    }

    public void clickAddSonyXperiaToCard() {
        addSonyXperiaToCard.click();
    }


}
