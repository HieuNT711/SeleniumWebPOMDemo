package vn.samsung.testing.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[normalize-space()='My Dashboard']")
    private WebElement headerMyDashboard;

    @FindBy(xpath = "//strong[normalize-space()='Hello, Automation FC!']")
    private WebElement headerHello;

    public String getTextOfHeaderMyDashboard() {
       return headerMyDashboard.getText();
    }

    public String getTextOfHeaderHello() {
       return headerHello.getText();
    }

}
