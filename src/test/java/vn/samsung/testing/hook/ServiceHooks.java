package vn.samsung.testing.hook;

import core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class ServiceHooks {
    BaseTest baseTest = new BaseTest();

    @Before
    public void beforeSuite() throws MalformedURLException {
        baseTest.openBrowser();
    }

    @After
    public void afterSuite(Scenario scenario) throws IOException {
        //validate if scenario has failed then Screenshot
        if (scenario.isFailed()) {
            File image = ((TakesScreenshot) baseTest.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(image, new File("E:\\SamSungSDS\\src\\test\\java\\resources\\data\\image" + scenario.getName() + "Error.png"));
        }
        System.out.println("Stop Driver: " + scenario.getName());
        baseTest.getDriver().quit();
    }
}
