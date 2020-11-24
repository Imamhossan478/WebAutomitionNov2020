package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.ExtentTestManager;


public class LoginPage {

    private WebElement emailField;


    private WebElement continueBtn;

    private WebElement passwordField;

    public void typeOnEmailField(String username) {
        emailField.sendKeys(username);
    }

    public void clickOnContinueButton() {
        continueBtn.click();
        ExtentTestManager.log("Clicked on continue button");

    }

    public void typeOnPasswordField(String password) {
        passwordField.sendKeys(password);
    }

}
