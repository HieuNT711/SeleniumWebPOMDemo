package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Account Information']")
    public WebElement btnAccountInformation;

    public void clickBtnAccountInformation(){
        btnAccountInformation.click();
    }

}
