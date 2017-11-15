package groovy.stepdefinitions

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovy.Config
import groovy.DriverManager
import groovy.page.object.models.LoginPage
import groovy.page.object.models.RegistrationPage
import org.openqa.selenium.WebDriver
import resources.webUtils.Wrappers

/**
 * Created by pawel on 20.10.2017.
 */
public class RegistrationFeatureSteps {

    LoginPage loginPage
    WebDriver driver;
    RegistrationPage registrationPage

    public RegistrationFeatureSteps()
    {
        driver = DriverManager.getInstance().getWebDriver();
    }

    @Given("^Enter New Customer registration through log in page\$")
    public void clickRegisterButton()
    {
        registrationPage = new RegistrationPage(driver)
        loginPage = new LoginPage(driver)
        registrationPage.clickRegister()
    }
    @Given("^Fill all mandatory data\$")
    public void registerDataInput()
    {

        registrationPage.fillMandatory()


    }
    @Given("^Fill all mandatory and optional data\$")
    public void registerOptionalDataInput()
    {

        registrationPage.fillMandatoryAndOptional()
    }
    @Given("^Leave at least one mandatory section unfilled\$")
    public void withoutNameDataInput()
    {
        registrationPage.missOneMandatory()

    }

    @When("^Click on register button\$")
    public void clickConfirmRegistrationButton()
    {
        registrationPage.clickRegister()
    }
    @Then("^Successful registration as a new customer\$")
    public void successfulRegistrationConfirmation()
    {
        Wrappers.checkMessage(driver,loginPage.getMessageBox(), Config.getPropValue("successRegistration"))
    }
    @Then("^Redirect to registration page with highlightened unfilled/invalid sections\$")
    public void failedRegistrationNotFilledMandatoryField()
    {
        Wrappers.checkMessage(driver,registrationPage.getSpanErrorRegistration(), Config.getPropValue("unfilledField"))
    }

    @Given("^I am on login page\$")
    public void iAmOnRegistrationPage() throws Throwable {
        driver.get("https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/login");
    }
}
