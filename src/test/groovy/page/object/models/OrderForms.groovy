package groovy.page.object.models

import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import resources.webUtils.Wrappers

class OrderForms extends BaseClass {
    OrderForms (WebDriver driver) { super(driver) }

    @FindBy(xpath = "//input[@id='js-product-ids']")
    private WebElement keywordSearchInput

    @FindBy(xpath = "//input[@id='js-enable-product-ids']")
    private WebElement productIDOnlyCheckbox

    @FindBy(xpath = "//input[@id='search-create-order-form']")
    private WebElement createOrderFormCheckbox

    @FindBy(xpath="//input[@id='search-order-form']")
    private WebElement orderFormCheckbox

    @FindBy(xpath="//button[@type='submit']")
    private WebElement orderFormSearchButton

    def orderFormsSearch(String input, Boolean productIdOnly, Boolean orderForm, Boolean createOrderForm ){
        keywordSearchInput.sendKeys(input)
        if (productIdOnly) {
            Wrappers.click(driver,productIDOnlyCheckbox)
        }
        if(orderForm){
            Wrappers.click(driver,orderFormCheckbox)
        }
        if(createOrderForm){
            Wrappers.click(driver,createOrderFormCheckbox)
        }
        Wrappers.click(driver,orderFormSearchButton)

    }
}