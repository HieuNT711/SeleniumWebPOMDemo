package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonPage extends BasePage {
    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='label'][normalize-space()='Account']")
    private WebElement btnAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    private WebElement btnRegister;

    @FindBy(xpath = "//img[@class='large']")
    private WebElement logoCommonPage;

    @FindBy(xpath = "//div[@id='header-account']//a[@title='My Account'][normalize-space()='My Account']")
    private WebElement btnMyAccount;

    @FindBy(xpath = "//a[normalize-space()='Log In']")
    private WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='Mobile']")
    private WebElement btnMobile;


    public void navigateToURL(String url) {
        getDriver().navigate().to(url);
    }

    public void clickBtnAccount() {
        btnAccount.click();
    }

    public void clickBtnRegister() {
        btnRegister.click();
    }

    public void clickLogoCommonPage() {
        logoCommonPage.click();
    }

    public void clickBtnMyAccount() {
        btnMyAccount.click();
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public void clickBtnMobile() {
        btnMobile.click();
    }

}
