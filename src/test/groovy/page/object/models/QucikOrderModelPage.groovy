package groovy.page.object.models

import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.testng.log4testng.Logger
import resources.webUtils.Wrappers

//import java.util.function.Function

/**
 * Created by SI-Ecommerce on 27.10.2017.
 */

//ADD REDIRECTIONS TO PRODUCT PAGES
class QucikOrderModelPage extends BaseClass {

    private int i = 0;
    final static Logger logger = Logger.getLogger(QucikOrderModelPage.class);

    QucikOrderModelPage(WebDriver driver) {
        super(driver)
    }


    @FindBy(xpath = "//*[@id=\"js-reset-quick-order-form-btn-top\"]")
    private WebElement resetFormButton

    @FindBy(xpath = "//*[@id=\"js-add-to-cart-quick-order-btn-top\"]")
    private WebElement addToCartButton

    @FindBy(xpath = "//*[@id=\"quickOrder\"]/div/div[3]/ul/li[2]/div[1]/input[1]")
    private WebElement firstSkuField;

    @FindBy(xpath = "//*[@id=\"quickOrder\"]/div/div[3]/ul/li[2]/div[2]/button")
    private WebElement firstRemoveSkuButton;

//    private List<WebElement> skuList
//    private List<WebElement> removeSkuButtonList

    void initializeSkuList() {
        while (i < 25) {
            String temp = "//*[@id='quickOrder']/div/div[3]/ul/li[" + i + "]/div[1]/input[1]"
            WebElement tempSkuField = this.driver.findElement(By.xpath(temp));
            this.skuList.add(tempSkuField);
            String temp2 = "//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + i + "]/div[2]/button"
            WebElement tempRemoveButton = this.driver.findElement(By.xpath(temp));
            this.removeSkuButtonList.add(tempRemoveButton);
            Wrappers.click(driver,tempSkuField)
            i++;
        }
    }

//    private <T> void runTest(By by, Function<WebElement, T> closure) {
//        try {
//            def element = this.driver.findElement(by);
//            closure.apply(element)
//        } catch (org.openqa.selenium.NoSuchElementException nsee) {
//        }
//    }

    void restFormAction() {
        Wrappers.click(driver,resetFormButton)
    }

    void addToCartAction() {
        Wrappers.click(driver,addToCartButton)
    }

    void insertSkuAtPosition(int position, String number) {
        try {
            WebElement skuField = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li["+position+"]/div[1]/input[1]"))
            skuField.clear();
            Wrappers.sendKeys(driver,skuField,number);
        } catch (org.openqa.selenium.NoSuchElementException nsee) {
            logger.error("SKU field for position" + position + "is not initialized");
        }
    }

    void removeSkuFromPosition(int position) {
        try {
            WebElement skuField = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li["+position+"]/div[2]/button"))
            Wrappers.click(driver,skuField);
        } catch (org.openqa.selenium.NoSuchElementException nsee) {
            logger.error("SKU button for position" + position + "is not initialized");
        }
    }

    void insertSkuList(int ammount, List<String> list) {
        for (int a = 0; a < ammount; a++) {
            this.insertSkuAtPosition(a, list.get(a));
        }
    }

    void changeQuantityOfProduct(int position, int quantity) {
        try {
            WebElement productQuantity = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + position + "]/div[5]/input"));
            productQuantity.clear();
            Wrappers.sendKeys(driver,productQuantity,quantity);
        } catch (org.openqa.selenium.NoSuchElementException noee) {
            logger.error("There is not any product in the given SKU field");
        }
//        this.<Void>runTest(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + position + "]/div[5]/input"), { e ->
//            e.clear();
//            e.sendKeys(quantity);
//        })
    }

    void navigateToProductPageByImage(int position) {
        try {
            WebElement productImage = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + position + "]/div[2]/a/img"));
            Wrappers.click(driver,productImage)
        } catch (org.openqa.selenium.NoSuchElementException noee) {
            logger.error("There is not any product in the given SKU field");
        }
    }

    void navigateToProductPageByName(int position) {
        try {
            WebElement productImage = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + position + "]/div[3]/a/span"));
            Wrappers.click(driver, productImage)
        } catch (org.openqa.selenium.NoSuchElementException noee) {
            logger.error("There is not any product in the given SKU field");
        }
    }

    boolean checkDuplicateErrorMessage(int position) {
        WebElement errorMessage = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + position + "]/div[1]/div"));
        if (errorMessage.displayed) {
            return true;
        } else {
            return false;
        }
    }

    String checkProductPrice(int position) {
        try {
            WebElement productPrice = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + position + "]/div[6]"));
            String value = productPrice.getText();
            return value;
        } catch (org.openqa.selenium.NoSuchElementException noee) {
            logger.error("There is not any product in the given SKU field");
        }
    }

    boolean checkStockReductionWarningMessage(int position) {
        WebElement stockReductionWarningMessage = this.driver.findElement(By.xpath("//*[@id=\"quickOrder\"]/div/div[3]/ul/li[" + position + "]/div[5]/div/text()"))
        if (stockReductionWarningMessage.displayed)
            return true;
        else
            return false;
    }
}
