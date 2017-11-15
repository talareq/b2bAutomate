package groovy.page.object.models

import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.testng.Assert
import resources.webUtils.Wrappers

/**
 * Created by Grzegorz Gałuszka on 27.10.2017.
 */
class CartPage extends BaseClass{
    public CartPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//span[@class='item__name']")
    private WebElement itemName

    @FindBy(xpath="//button[@class='btn--continue-shopping']")
    private WebElement continueShoppingButton


    @FindBy(xpath="//button[@class='btn-create-quote']")
    private WebElement requestQuoteButton

    @FindBy(xpath = "//button[@class='btn--continue-checkout']")
    private WebElement  checkoutButton

    @FindBy(xpath = "//href='export__cart--link']")
    private WebElement exportCSV

    @FindBy(xpath = "//input[@name='voucherCode']")
    private WebElement couponInput

    @FindBy(xpath = "//button[@class='cart-voucher__btn']")
    private WebElement couponSubmit

    @FindBy(xpath = "//div[@class='grand-total']")
    private WebElement totalPrice



    void viewCartAndCheckout(String tempName) {
        def cartedItem = Wrappers.getText(driver, itemName)
        Assert.assertEquals(tempName, cartedItem)
        System.out.println(Wrappers.getText(driver, totalPrice))
        Wrappers.click(driver, checkoutButton)
    }

    // Zrobione na driverze z racji statycznych @FindBy
    void removeEntry(String item){
        Wrappers.click(driver, driver.findElement(By.xpath("//li[contains(@outerText,'"+item+"')]//button[@class='dropdown-toggle']")))
        Wrappers.click(driver, driver.findElement(By.xpath("//li[contains(@outerText,'"+item+"')]//text()[contains(.,'Remove')]")))
    }

    void applyCoupon(String input){
        Wrappers.sendKeys(driver, couponInput,input)
        Wrappers.click(driver, couponSubmit)
    }

    void continueShopping(){
        Wrappers.click(driver, continueShoppingButton)
    }
    void requestQuote() {
        Wrappers.click(driver, requestQuoteButton)
    }

    void exportCSV(){
        Wrappers.click(driver, exportCSV)
    }

    // Zrobione na driverze z racji statycznych @FindBy
    void changeQuantity(int number, String item){
        WebElement quantity = driver.findElement(By.xpath("//li[contains(@outerText,'"+item+"')]//input[@name='quantity']"))
        Wrappers.sendKeys(driver, quantity,number)
    }

}
