package groovy.page.object.models

import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.testng.Assert
import resources.webUtils.Wrappers

class LoginPage extends BaseClass {
    LoginPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//input[@id='j_username']")
    private WebElement inputEmailAddress

    @FindBy(xpath = "//input[@id='j_password']")
    private WebElement inputPassword

    @FindBy(xpath = "//button[contains(.,'Log In')]")
    private WebElement loginButton

    @FindBy(xpath = "//button[contains(.,'Register')]")
    private WebElement registerButton

    @FindBy(xpath = "//a[contains(.,'Forgot your password?')]")
    private WebElement forgotPasswordLink


    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    private WebElement signOutButton

    @FindBy(xpath = "//li[@class='liOffcanvas']/a")
    private WebElement successfulLogin

    @FindBy(xpath = "//button[@class='close']/..")
    private WebElement messageBox

    WebElement getMessageBox()
    {
        return messageBox
    }

    public loginAction(String email, String password)
    {
        this.inputEmailAddress.sendKeys(email)
        this.inputPassword.sendKeys(password)
    }

    public clickLogin()
    {
        Wrappers.click(driver,loginButton)
    }
    public clickSignOut()
    {
        Wrappers.click(driver,signOutButton)
    }

    public void checkLogin()
    {
        Assert.assertTrue(successfulLogin.getText().contains("SIGN OUT"))

    }
    public void logIn(String email, String password)
    {
        this.loginAction(email, password)
        this.clickLogin()
    }



}