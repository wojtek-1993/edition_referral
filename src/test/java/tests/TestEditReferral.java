package tests;

import org.junit.Assert;
import org.junit.Test;

public class TestEditReferral extends TestBase {

    @Test
    public void popTest() {

        loginPage.fillInLoginForm("****", "****");
        loginPage.loginButtonClick();
        institutionPage.selectInstitutionClick();
        institutionPage.selectReferralClick();
        editReferralPage.editButtonClick();
        formReferralPage.fillInFormReferral();
        formReferralPage.updateButtonClick();

        String url = "http://localhost/****/";
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
