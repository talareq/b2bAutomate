package groovy.stepdefinitions

import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import groovy.DriverManager


import groovy.page.object.models.CartPage
import groovy.page.object.models.SearchResultsPage
import org.openqa.selenium.WebDriver

/**
 * Created by Grzegorz Gałuszka on 27.10.2017.
 */
class BuySteps {

    CartPage cartPage
    WebDriver driver
    SearchResultsPage searchResultPage
    def tempItem
    def tempName


    public BuySteps() {

        driver =  DriverManager.getInstance().getWebDriver()


    }

    @When("^I search for \"(.*)\"")
        public iSearchForItem(String item){
        searchResultPage = new SearchResultsPage(driver)
        tempItem = searchResultPage.iSearchForItem(item)


            }
    @Then("^I select the first one on the list")
    public  iSelectTheItem(){
        searchResultPage = new SearchResultsPage(driver)
        tempName = searchResultPage.selectFirstItem()
    }
    @When("^I add the item to cart and checkout")
    public addItemToCart(){
        searchResultPage = new SearchResultsPage(driver)
        searchResultPage.addToCart(tempName, tempItem)

    }

    @Then("^I view the cart content and checkout")
    public void viewCart(){
        cartPage = new CartPage(driver)
        cartPage.viewCartAndCheckout(tempName)
    }
}



