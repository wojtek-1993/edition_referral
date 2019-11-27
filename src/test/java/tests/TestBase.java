package tests;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.EditReferralPage;
import pages.FormReferralPage;
import pages.InstitutionPage;
import pages.LoginPage;
import utils.WebDriverSingleton;

import java.io.File;

public class TestBase {

    protected WebDriver driver;
    LoginPage loginPage;
    InstitutionPage institutionPage;
    EditReferralPage editReferralPage;
    FormReferralPage formReferralPage;

    @Before
    public void setUp() {
        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.get("http://localhost/***.php");
        loginPage = new LoginPage(driver);
        institutionPage = new InstitutionPage(driver);
        editReferralPage = new EditReferralPage(driver);
        formReferralPage = new FormReferralPage(driver);
    }

    @After
    public void quit() throws Exception {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // przechwytywanie screenów z przeglądarki
        FileUtils.copyFile(scrFile, new File("./picture/" + System.currentTimeMillis() +  ".png")); // ścieżka zapisu z plikiem

        WebDriverSingleton.quit();
    }
}
