package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class BasePage {
    private static final int TIMEOUT = 10;
    private final WebDriver driver;
    private final WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    public void verifyElementPresent(By locator) {
        int check = 0;
        if (webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .isDisplayed()) {
            check = 1;
        }
        Assert.assertEquals(check, 1, String.format("Not found locator %s", locator));
    }

}

