package vn.samsung.testing.page;

import core.BasePage;
import core.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    CommonPage commonPage = new CommonPage(getDriver());

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement txtPass;

    @FindBy(xpath = "//button[@id='send2']")
    private WebElement btnLogin;

    public void loginToLiveGuru99() {
        commonPage.clickBtnAccount();
        commonPage.clickBtnLogin();
        txtEmail.sendKeys(GlobalVariables.EMAIL_ADDRESS);
        txtPass.sendKeys(GlobalVariables.PASS_WORD);
        btnLogin.click();
    }

}
