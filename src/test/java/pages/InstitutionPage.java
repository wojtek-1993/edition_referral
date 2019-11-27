package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;
import static utils.Actions.waitForElementToBeClickable;

public class InstitutionPage extends BasePage {

    public InstitutionPage(WebDriver driver){super(driver);}

    @FindBy(css = "#WAW img")
    private WebElement selectInstitutionInput;

    @FindBy(css = "#newUserMenu a[href=\"/***/***.php\"]")
    private  WebElement selectReferralInput;

    public InstitutionPage selectInstitutionClick() {

        waitForElementToBeClickable(selectInstitutionInput);
        click(selectInstitutionInput);
        return this;
    }

    public InstitutionPage selectReferralClick(){

        waitForElementToBeClickable(selectReferralInput);
        click(selectReferralInput);
        return this;
    }

}
