package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement txtFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement txtLastName;

    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement txtEmailAddress;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//input[@id='confirmation']")
    public WebElement txtConfirmPassword;

    @FindBy(xpath = "//button[@title='Register']")
    public WebElement btnRegister;

    By txtRegisterSuccess = By.xpath("//span[normalize-space()='Thank you for registering with Main Website Store.']");

    public void setTxtFirstName(String text) {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(txtFirstName)).sendKeys(text);
    }

    public void setTxtLastName(String text) {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(txtLastName)).sendKeys(text);
    }

    public void setTxtEmailAddress(String text) {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(txtEmailAddress)).sendKeys(text);
    }

    public void setTxtPassword(String text) {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(text);
    }

    public void setTxtConfirmPassword(String text) {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(txtConfirmPassword)).sendKeys(text);
    }

    public void clickBtnRegister() {
        btnRegister.click();
    }

    public void verifyTxtRegisterSuccessPresent() {
        verifyElementPresent(txtRegisterSuccess);
    }

}
