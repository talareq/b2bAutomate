package groovy.page.object.models

import groovy.Config
import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.testng.Assert
import resources.webUtils.Wrappers

/**
 * Created by pawel on 26.10.2017.
 */
public class FindStorePage extends BaseClass
{
    public FindStorePage (WebDriver driver) {super (driver);}

    @FindBy(xpath = "//a[@class='btn']")
    private WebElement directFindStorePage

    @FindBy(xpath = "//input[@id='storelocator-query']")
    private WebElement inputZipCode

    @FindBy(xpath = "//button[@id='findStoresNearMe']")
    private WebElement findStoresNearMe

    @FindBy(xpath = "//div[@id='storeFinder']")
    private WebElement foundStores

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement searchButton

    @FindBy (xpath = "//div[@class='js-storefinder-alert alert alert-danger alert-dismissable']")
    private WebElement failedSearch

    public clickFindStoreButton()
    {
        Wrappers.click(driver,directFindStorePage)
    }
    public findStoreByZipCode()
    {
        Wrappers.sendKeys(driver,inputZipCode,Config.getPropValue("searchZipCode"))
    }
    public clickFindStoresNearby()
    {
        Wrappers.click(driver,findStoresNearMe)
    }
    public displayedStoresNearby()
    {
        Assert.assertTrue(foundStores.getText().contains("stores found"))
    }
    public clickSearchButton()
    {
        Wrappers.click(driver,searchButton)
    }
    public failedSearchMessage()
    {
        Assert.assertTrue(failedSearch.getText().contains("Check that you entered a valid postcode or place name."))
    }
}
