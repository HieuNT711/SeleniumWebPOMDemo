package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformationPage extends BasePage {
    public AccountInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement txtFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement txtLastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement txtEmailAddress;

    public String getFirstName() {
        return txtFirstName.getAttribute("value");
    }

    public String getLastName() {
        return txtLastName.getAttribute("value");
    }

    public String getEmailAddress() {
        return txtEmailAddress.getAttribute("value");
    }

}
