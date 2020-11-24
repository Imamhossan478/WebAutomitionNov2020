package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.ExtentTestManager;
import java.util.logging.Logger;

public class HomePage {
    private static Logger LOGGER = Logger.getLogger(String.valueOf(HomePage.class));

    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(id = "gh-btn")
    private WebElement searchBtn;

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;

    @FindBy(linkText = "register")
    private WebElement registerBtn;

    public void typeOnSearchBar(String data) {
        searchBar.sendKeys(data);
        ExtentTestManager.log("Typed on search bar : " + data);

    }

    public void clickOnSearchButton() {
        searchBtn.click();
        ExtentTestManager.log("Clicked on Search Button");

    }

    public void clickOnSignInButton() {
        signInBtn.click();
        ExtentTestManager.log("Clicked on Sign In Button");
    }

    public void clickOnRegisterButton() {
        registerBtn.click();
        ExtentTestManager.log("Clicked on Register Button");
    }

}
