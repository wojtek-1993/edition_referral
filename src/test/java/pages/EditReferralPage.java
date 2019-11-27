package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;
import static utils.Actions.waitForElementToBeClickable;

public class EditReferralPage extends BasePage {

    public EditReferralPage(WebDriver driver){super(driver);}

    @FindBy(id = "NXT_FormLink")
    private WebElement editButtonInput;

    public EditReferralPage editButtonClick(){

        waitForElementToBeClickable(editButtonInput);
        click(editButtonInput);
        return this;
    }
}
