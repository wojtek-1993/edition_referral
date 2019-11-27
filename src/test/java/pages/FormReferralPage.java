package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.*;

public class FormReferralPage extends BasePage {

    private static WebDriver driver;

    public FormReferralPage(WebDriver driver){super(driver); this.driver = driver;}

    @FindBy(id = "data_oryginal_skierowania")
    private WebElement dateOfReferralInput;

    @FindBy(xpath = "//div[@class=\"DynarchCalendar-hover-bottomBar-today DynarchCalendar-bottomBar-today DynarchCalendar-pressed-bottomBar-today\"]")
    private WebElement selectDateInput;

    @FindBy(css = "#podmiot button")
    private WebElement principalInput;

    @FindBy(css = "#podmiot input[value=\"809\"]")
    private WebElement selectIdInstitutionInput;

    @FindBy(id = "AMBULATORY_STATUS")
    private WebElement generalCommentsInput;

    @FindBy(css = "#AMBULATORY_STATUS  option[value=\"A0\"]")
    private WebElement selectNoCommentsInput;

    @FindBy(id = "zmien")
    private WebElement updateButtonInput;

    public FormReferralPage fillInFormReferral() {

        click(dateOfReferralInput);
        windowHandleSwitchTo(driver);
        setDatePicker(driver);
        click(principalInput);
        click(selectIdInstitutionInput);
        click(generalCommentsInput);
        click(selectNoCommentsInput);
        return this;
    }

    public FormReferralPage updateButtonClick() {

        waitForElementToBeClickable(updateButtonInput);
        click(updateButtonInput);
        return this;
    }

}
