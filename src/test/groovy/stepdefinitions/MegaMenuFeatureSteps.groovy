package groovy.stepdefinitions

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovy.Config

import groovy.page.object.models.LoginPage
import groovy.general.page.object.models.MegaMenu
import groovy.page.object.models.OrderForms
import groovy.page.object.models.ProductCategory
import org.openqa.selenium.WebDriver
import org.testng.Assert


public class MegaMenuFeatureSteps {
    Config config
    LoginPage loginPage
    WebDriver driver;
    MegaMenu megaMenu
    OrderForms orderForms
    ProductCategory productCategory


    MegaMenuFeatureSteps() {

        megaMenu = new MegaMenu(driver)
    }

    @When("^Navigate to the orderforms\$")
    void navigateToOrderForms() {

        orderForms = new OrderForms(driver)

        megaMenu.goToOrderForms()

    }


    @When("^Navigate to the PowerDrillsTab\$")
    void navigateToPowerDrillsTab() {
        megaMenu = new MegaMenu(driver)
        config = new Config()
        megaMenu.goToPowerDrillsTab()
    }

    @Then("^PowerDrillsTab should be displayed.\$")
    void AssertPowerDrillsTab() {
        Assert.assertTrue(driver.getCurrentUrl().toString() == Config.getPropValue(PowerDrillsLink))
    }


    @When("^Navigate to the AngleGrindersTab\$")
    void navigateToTheAngleGrindersTab() {
        megaMenu = new MegaMenu(driver)

        megaMenu.goToAngleGrindersTab()
    }

    @Then("^AngleGrindersTab should be displayed.\$")
    void AssertAngleGrindersTab() {
        Assert.assertTrue(driver.getCurrentUrl().toString() == "https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Tools/Power-Drills/c/1360")

    }
}