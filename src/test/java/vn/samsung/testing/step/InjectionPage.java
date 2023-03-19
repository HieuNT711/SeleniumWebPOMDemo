package vn.samsung.testing.step;

import core.BaseTest;
import vn.samsung.testing.page.*;

public class InjectionPage extends BaseTest {
    CommonPage commonPage = new CommonPage(getDriver());
    RegisterPage registerPage = new RegisterPage(getDriver());
    MyAccountPage myAccountPage = new MyAccountPage(getDriver());
    AccountInformationPage accountInformationPage = new AccountInformationPage(getDriver());
    LoginPage loginPage = new LoginPage(getDriver());
    MainPage mainPage = new MainPage(getDriver());
    MobilePage mobilePage = new MobilePage(getDriver());
    ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());
    DetailCardPage detailCardPage = new DetailCardPage(getDriver());
    EmptyCardPage emptyCardPage = new EmptyCardPage(getDriver());
}
