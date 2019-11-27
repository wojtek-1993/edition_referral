package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utils.Actions.click;
import static utils.Actions.sendKeys;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {super(driver);}

    @FindBy(className = "gwt-TextBox")
    private WebElement usernameInput;

    @FindBy(className = "gwt-PasswordTextBox")
    private WebElement passwordInput;

    @FindBy(className = "gwt-Button")
    private WebElement loginButton;

    public LoginPage fillInLoginForm(String username, String password) {

        sendKeys(usernameInput, username);
        sendKeys(passwordInput, password);
        return this;
    }

    public LoginPage loginButtonClick(){

        click(loginButton);
        return this;
    }
}
