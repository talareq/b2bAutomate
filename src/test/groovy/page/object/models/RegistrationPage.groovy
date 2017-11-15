package groovy.page.object.models

import groovy.Config
import groovy.factories.PersonFactory
import groovy.general.page.object.models.BaseClass
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.ui.Select
import resources.webUtils.Wrappers

/**
 * Created by pawel on 25.10.2017.
 */
public class RegistrationPage extends BaseClass {

    public RegistrationPage(WebDriver driver){super (driver);}

    String emailAddress



    @FindBy(xpath = "//button[contains(.,'Register')]")
    private WebElement registerButton

    @FindBy(xpath = "//select[@id='address.country_del']")
    private WebElement selectCountry

    @FindBy(xpath = "//select[@id='register.title']")
    private WebElement selectTitle

    @FindBy(xpath = "//input[@id='text.secureportal.register.firstAndLastName']")
    private WebElement inputFullName

    @FindBy(xpath = "//input[@id='text.secureportal.register.companyName']")
    private WebElement inputCompanyName

    @FindBy(xpath = "//input[@id='address.line1']")
    private WebElement inputAddressLine1

    @FindBy(xpath = "//input[@id='address.townCity']")
    private WebElement inputTownCity

    @FindBy(xpath = "//input[@id='address.postcode']")
    private WebElement inputPostcode

    @FindBy(xpath = "//input[@id='text.secureportal.register.position']")
    private WebElement inputYourPosition

    @FindBy(xpath = "//input[@id='storeDetails.table.telephone']")
    private WebElement inputTelephoneNumber

    @FindBy(xpath = "//input[@id='register.email']")
    private WebElement inputEmailAddress

    @FindBy(xpath = "//input[@id='register.confirm.email']")
    private WebElement inputConfirmEmailAddress

    @FindBy(xpath = "//textarea[@id='text.secureportal.register.message']")
    private WebElement textareaCommentArea

    @FindBy(xpath = "//input[@id='address.line2']")
    private WebElement inputAddressLine2

    @FindBy(xpath = "//input[@id='text.secureportal.register.extension']")
    private WebElement inputExtTelephoneNumber

    @FindBy(xpath = "//div[@class='help-block']")
    private WebElement spanErrorRegistration

    WebElement getSpanErrorRegistration()
    {
        return spanErrorRegistration
    }

    public clickRegister()
    {
        Wrappers.click(driver,registerButton)
    }

    public fillMandatoryAndOptional(){
        fillMandatory()
        PersonFactory personFactory = new PersonFactory()
        Person user = personFactory.createUser()
        Wrappers.sendKeys(driver, inputAddressLine2, user.addressLine2)
        Wrappers.click(driver,textareaCommentArea)
        Wrappers.sendKeys(driver,textareaCommentArea,Config.getPropValue("commentMessage"))

    }

    public  fillMandatory(){
        Select countrySelector = new Select(selectCountry)
        countrySelector.selectByValue(Config.getPropValue("countryOption"))
        Select titleSelector = new Select (selectTitle)
        titleSelector.selectByValue(Config.getPropValue("titleOption"))
        PersonFactory personFactory = new PersonFactory()
        Person user = personFactory.createUser()
        Wrappers.sendKeys(driver, inputFullName, user.fullName)
        Wrappers.sendKeys(driver, inputCompanyName, user.companyName)
        Wrappers.sendKeys(driver,inputAddressLine1, user.addressLine1 )
        Wrappers.sendKeys(driver,inputTownCity, user.townCity )
        Wrappers.sendKeys(driver, inputPostcode, user.postCode)
        Wrappers.sendKeys(driver, inputYourPosition, user.yourPosition)
        Wrappers.sendKeys(driver, inputTelephoneNumber, user.phone)
        Wrappers.sendKeys(driver, inputExtTelephoneNumber, user.extPhone)
        Wrappers.sendKeys(driver,inputEmailAddress, user.email )
        Wrappers.sendKeys(driver,inputConfirmEmailAddress, user.email )
        Wrappers.click(driver,textareaCommentArea)


    }
public missOneMandatory(){
    fillMandatory()
    inputFullName.clear()

}

    }
