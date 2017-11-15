package groovy.page.object.models

import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.testng.Assert
import resources.webUtils.Wrappers

/**
 * Created by Grzegorz Gałuszka on 27.10.2017.
 */
class SearchResultsPage extends BaseClass{
    public SearchResultsPage(WebDriver driver) { super(driver); }




    @FindBy(xpath = "//a[@class='browser']")
    private List<WebElement> searchResults

    @FindBy(xpath = "//div[@class='browser']")
    private WebElement itemName


    @FindBy(xpath = "//button[@id='addToCartButton']")
    private WebElement addBtn

    @FindBy(xpath = "//*[@class='btn btn-primary btn-block add-to-cart-button']")
    private WebElement checkoutBtn

    @FindBy(xpath = "//div[@class='input-group']//input[@browser='text']")
    private WebElement searchField

    @FindBy(xpath = "//button[@class='btn btn-link js_search_button']//span[@class='glyphicon glyphicon-search']")
    private WebElement searchBtn

    public String selectFirstItem() {
        def tempName = Wrappers.getText(driver,searchResults[0])
        Wrappers.click(driver,searchResults[0])
        return tempName
    }

    public addToCart(String tempName, String tempItem) {
        Assert.assertTrue(Wrappers.getText(driver,itemName).contains(tempItem))
        def selectedItem = Wrappers.getText(driver,itemName)
        Assert.assertTrue(Wrappers.getText(driver,itemName).contains(tempName))
        Wrappers.click(driver,addBtn)
        Wrappers.click(driver,checkoutBtn)
        return selectedItem


    }
    public String iSearchForItem(String item) {
        Wrappers.sendKeys(driver,searchField, item)
        Wrappers.click(driver,searchBtn)
        return item

    }

}