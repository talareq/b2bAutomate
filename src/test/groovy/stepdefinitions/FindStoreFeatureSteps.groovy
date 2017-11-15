package groovy.stepdefinitions

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovy.Config
import groovy.page.object.models.FindStorePage
import groovy.page.object.models.LoginPage
import org.openqa.selenium.WebDriver

/**
 * Created by pawel on 26.10.2017.
 */
public class FindStoreFeatureSteps
{
    LoginPage loginPage
    FindStorePage findStorePage
    WebDriver driver

    public FindStoreFeatureSteps()
    {
        loginPage = new LoginPage(driver)
        findStorePage = new FindStorePage(driver)
    }
        @Given("^Log in to webshop\$")
        public void logInToWebshop()
        {
            loginPage.logIn(Config.getPropValue("customerLogin"), Config.getPropValue("customerPassword"))
        }
        @And("^Go to the find store page\$")
        public void directToFindStorePage()
        {
            findStorePage.clickFindStoreButton()
        }
        @When("^Input Zip Code in search field and click search button\$")
        public void searchByZipCode()
        {
            findStorePage.findStoreByZipCode()
        }
        @When("^Click on find stores button\$")
        public void clickFindStoresButton()
        {
            sleep(2000)
            findStorePage.clickFindStoresNearby()
        }
        @When("^Click search button with unfilled search field\$")
        public void leaveUnfilledSearchField()
        {
            sleep(2000)
            findStorePage.clickSearchButton()
        }

        @Then("^Find all stores available nearby\$")
        public void checkStoresDisplayed()
        {
            findStorePage.displayedStoresNearby()
        }
        @Then("^Failed search\$")
        public void checkFailedSearch()
        {
            findStorePage.failedSearchMessage()
        }
}
