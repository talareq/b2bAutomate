package groovy.page.object.models

import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import resources.webUtils.Wrappers


class ProductCategory extends BaseClass {
    ProductCategory(WebDriver driver) { super(driver) }



    @FindBy(xpath = "//li[@class='pagination-next']")
    private nextPageButton

    @FindBy(xpath = "//li[@class='pagination-prev']")
    private WebElement previousPageButton

    void goToProductDetails(String productName) {

        WebElement product =  driver.findElement(By.xpath("//a[@title="+"'"+productName+"'"+"]"))
        Wrappers.click(driver,product)
        }
    void addProductToTheCart(String productName) {
       WebElement addToCart = driver.findElement(By.xpath("//input[@value="+"'"+productName+"'"+"]//button[@type='submit']"))
        Wrappers.click(driver,addToCart)

    }
    }
