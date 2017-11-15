package groovy.stepdefinitions

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovy.Config

import groovy.DriverManager
import groovy.general.page.object.models.MegaMenu
import groovy.page.object.models.OrderForms
import groovy.page.object.models.LoginPage
import org.openqa.selenium.WebDriver
import resources.webUtils.Wrappers


/**
 * Created by pawel on 20.10.2017.
 */
public class LoginFeatureSteps {

    LoginPage loginPage
    WebDriver driver;
    MegaMenu megaMenu
    OrderForms orderForms

    public LoginFeatureSteps() {

        driver = DriverManager.getInstance().getWebDriver()

        loginPage = new LoginPage(driver)

    }

        @Given("^Enter valid Email address and password\$")
        public void inputLoginData()
        {
            loginPage.loginAction(Config.getPropValue("customerLogin"), Config.getPropValue("customerPassword"))

        }
        @Given("^Do not fill Email address and password\$")
        public void emptyLoginData()
        {
            loginPage = new LoginPage(driver)
        }

        @Given("^Enter valid Email address and wrong password\$")
        public void inputWrongLoginPassword()
        {
            loginPage.loginAction(Config.getPropValue("customerLogin"), Config.getPropValue("wrongPassword"))
        }
        @When("^Click on log in button\$")
        public void clickLoginButton()
        {
            loginPage.clickLogin()
        }

        @Then("^Log in as registered customer\$")
        public void verifyLogin()
        {
            loginPage.checkLogin()
        }
        @Then("^Failed log in and appriopriate comment\$")
        public void failedLogin()
        {
            Wrappers.checkMessage(driver,loginPage.getMessageBox(), Config.getPropValue("failedLogin"))
        }
        @Then("^Logout\$")
        public void clickSignOutButton()
        {
            loginPage.clickSignOut()
        }
}
