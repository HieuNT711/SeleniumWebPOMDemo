package vn.samsung.testing.step;

import core.BaseTest;
import core.GlobalVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import vn.samsung.testing.page.*;


public class StepsDefinitions extends InjectionPage {

    @Given("I register account in LiveGuru99 successfully")
    public void registerAccount() {
        commonPage.clickBtnAccount();
        commonPage.clickBtnRegister();
        registerPage.setTxtFirstName(GlobalVariables.FIRST_NAME);
        registerPage.setTxtLastName(GlobalVariables.LAST_NAME);
        registerPage.setTxtEmailAddress(GlobalVariables.EMAIL_ADDRESS);
        registerPage.setTxtPassword(GlobalVariables.PASS_WORD);
        registerPage.setTxtConfirmPassword(GlobalVariables.PASS_WORD);
        registerPage.clickBtnRegister();
        registerPage.verifyTxtRegisterSuccessPresent();
    }

    @Given("I login to LiveGuru99")
    public void loginToLiveGuru99() {
        loginPage.loginToLiveGuru99();
    }

    @And("I go to common page")
    public void goToCommonPage() {
        commonPage.clickLogoCommonPage();
    }

    @And("I open my account page")
    public void openMyAccountPage() {
        commonPage.clickBtnAccount();
        commonPage.clickBtnMyAccount();
    }

    @And("I open account information page")
    public void openAccountInformationPage() {
        myAccountPage.clickBtnAccountInformation();
    }

    @Then("The data in account information page should be correct")
    public void verifyDataInformationPage() {
        Assert.assertEquals(accountInformationPage.getFirstName(), GlobalVariables.FIRST_NAME);
        Assert.assertEquals(accountInformationPage.getLastName(), GlobalVariables.LAST_NAME);
        Assert.assertEquals(accountInformationPage.getEmailAddress(), GlobalVariables.EMAIL_ADDRESS);
    }

    @Then("I should see header text {string} and message {string} after login system")
    public void verifyLoginSuccess(String headerText, String message) {
        Assert.assertEquals(mainPage.getTextOfHeaderMyDashboard(), headerText);
        Assert.assertEquals(mainPage.getTextOfHeaderHello(), message);
    }

    @Then("I go to mobile page")
    public void goToMobilePage() {
        commonPage.clickBtnMobile();
    }

    @And("I choose Sony Xperia product")
    public void chooseSonyXperiaProduct() {
        mobilePage.clickTxtSonyXperia();
    }

    @Then("The price of Sony Xperia should be math")
    public void verifyPriceOfSonyXperia() {
        Assert.assertEquals(productDetailPage.getTextOfTxtPriceOfProduct(), mobilePage.getTextOfTxtPriceOfSonyXperia());
    }

    @And("I add Sony Xperia to card")
    public void addSonyXperiaToCard() {
        mobilePage.clickAddSonyXperiaToCard();
    }

    @And("I apply discount code")
    public void applyDiscountCode() {
        detailCardPage.sendKeyToInputDiscount(GlobalVariables.DISCOUNT_CODE);
        detailCardPage.clickBtnApply();
    }

    @Then("Product is discounted from the discount code")
    public void verifyDiscountSuccess() {
        float discount = detailCardPage.getPriceOfDiscount();
        float subTotalPrice = detailCardPage.getSubTotalPrice();
        float grandTotalPrice = detailCardPage.getGrandTotalPrice();
        Assert.assertEquals(subTotalPrice - discount, grandTotalPrice);
    }

    @And("I set {string} quantity for product")
    public void setQuantityForProduct(String quantity) {
        detailCardPage.setInputQTY(quantity);
        detailCardPage.clickBtnUpdate();
    }

    @Then("I can see error message {string} and {string}")
    public void verifyErrorMess(String errorMess, String errorMaxQuantity) {
        Assert.assertEquals(detailCardPage.getTxtMessError(), errorMess);
        Assert.assertEquals(detailCardPage.getTxtMaxQuantityError(), errorMaxQuantity);
    }

    @Given("I navigate to URL {string}")
    public void navigateToURL(String url) {
        commonPage.navigateToURL(url);
    }

    @When("I go to empty card page")
    public void goToEmptyCardPage() {
        detailCardPage.clickBtnEmptyCart();
    }

    @Then("The notification {string} should be displayed")
    public void verifyCardEmpty(String notification) {
        Assert.assertEquals(emptyCardPage.getTextOfTxtNotification(), notification);
    }

}
