package groovy.general.page.object.models


import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import resources.webUtils.Wrappers


class MegaMenu {
    private WebDriver driver;

    public MegaMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this)

    }

    /////////////////////////////                           TABS                               //////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Office-Equipment%2C-Supplies-%26-Accessories/Hand-Tools/Power-Drills/c/1360']")
    private WebElement powerDrillsTab

    def goToPowerDrillsTab() {
        Wrappers.click(driver, powerDrillsTab)
    }

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Office-Equipment%2C-Supplies-%26-Accessories/Hand-Tools/Angle-Grinders/c/1595']")
    private WebElement angleGrindersTab

    def goToAngleGrindersTab() {
        Wrappers.click(driver, angleGrindersTab)
    }

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Office-Equipment%2C-Supplies-%26-Accessories/Hand-Tools/Screwdrivers/c/1593']")
    private WebElement screwdriversTab

    def goToScrewdriversTab() {
        Wrappers.click(driver, screwdriversTab)
    }

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Office-Equipment%2C-Supplies-%26-Accessories/Hand-Tools/Sanders/c/1596']")
    private WebElement sandersTab

    def goToSandersTab() {
        Wrappers.click(driver, sandersTab)
    }

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Office-Equipment%2C-Supplies-%26-Accessories/Hand-Tools/Measuring-%26-Layout-Tools/c/1358']")
    private WebElement measuringToolsTab

    def goToMeasuringToolsTab() {
        Wrappers.click(driver, measuringToolsTab)
    }

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Office-Equipment%2C-Supplies-%26-Accessories/Hand-Tools/c/1355']")
    private WebElement handtoolsTab

    def goToHandToolsTab() {
        Wrappers.click(driver, handtoolsTab)
    }

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/Open-Catalogue/Office-Equipment%2C-Supplies-%26-Accessories/Hand-Tools/Safety/c/1800']")
    private WebElement safetyTab

    def goToSafetyTab() {
        Wrappers.click(driver, safetyTab)
    }

    /////////////////////////////                                  Buttons                               //////////////////////////////////////////////////////////////////////////

    @FindBy(css = "body > main > header > nav.navigation.navigation--middle.js-navigation--middle > div > div.row.desktop__nav > div.nav__right.col-xs-6.col-xs-6.hidden-xs > ul > li:nth-child(1) > div > a > span")
    private WebElement storeFinderButton

    def goToStoreFinder() {
        Wrappers.click(driver, storeFinderButton)
    }

    @FindBy(css = "body > main > header > nav.navigation.navigation--middle.js-navigation--middle > div > div.row.desktop__nav > div.nav__right.col-xs-6.col-xs-6.hidden-xs > ul > li:nth-child(2) > div > div:nth-child(1) > div > nav > div:nth-child(1) > a")
    private WebElement orderFormsButton

    def goToOrderForms() {
        Wrappers.click(driver, orderToolsButton)
        Wrappers.click(driver, orderFormsButton)
    }


    @FindBy(css = "body > main > header > nav.navigation.navigation--middle.js-navigation--middle > div > div.row.desktop__nav > div.nav__right.col-xs-6.col-xs-6.hidden-xs > ul > li:nth-child(2) > div > div:nth-child(1) > div > nav > div:nth-child(2) > a")
    private WebElement quickOrderButton

    def goToQuickOrder() {
        Wrappers.click(driver, orderToolsButton)
        Wrappers.click(driver, quickOrderButton)
    }

    @FindBy(xpath = "body > main > header > nav.navigation.navigation--middle.js-navigation--middle > div > div.row.desktop__nav > div.nav__right.col-xs-6.col-xs-6.hidden-xs > ul > li:nth-child(2) > div > div:nth-child(1) > div > nav > div:nth-child(3) > a")
    private WebElement importSavedCartButton

    def goToImportSavedCart() {
        Wrappers.click(driver, orderToolsButton)
        Wrappers.click(driver, importSavedCartButton)
    }

    @FindBy(css = "body > main > header > nav.navigation.navigation--middle.js-navigation--middle > div > div.row.desktop__nav > div.nav__right.col-xs-6.col-xs-6.hidden-xs > ul > li:nth-child(2) > div > div:nth-child(1) > div")
    private WebElement orderToolsButton

    def goToOrderTools() {
        Wrappers.click(driver, orderToolsButton)
    }

    @FindBy(css = "body > main > header > nav.navigation.navigation--middle.js-navigation--middle > div > div.row.desktop__nav > div.nav__right.col-xs-6.col-xs-6.hidden-xs > ul > li:nth-child(2) > div > div:nth-child(2) > div.nav-cart > a > div.mini-cart-count.js-mini-cart-count")
    private WebElement cartButton

    def openCart() {
        Wrappers.click(driver, cartButton)
    }

    @FindBy(css = "body > main > header > nav.navigation.navigation--top.hidden-xs.hidden-sm > div > div.col-sm-12.col-md-4")
    private WebElement mainPageButton

    def goToMainPage() {
        Wrappers.click driver, mainPageButton
    }

    @FindBy(xpath = "//a[@href='#accNavComponentDesktopOne']")
    private WebElement myAccountButton

    def goToMyAccount() {
        Wrappers.click(driver, myAccountButton)
    }

    @FindBy(xpath = "//a[@href='/yb2bacceleratorstorefront/powertools/en/USD/logout']")
    private WebElement signOutButton

    def signOut() {
        Wrappers.click(driver, signOutButton)
    }
/////////////////////////////////                        My Account Buttons                             /////////////////////////////////////////////////

    @FindBy(xpath = "//a[@href='https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/my-account/update-profile']")
    private WebElement personalDetailsButton

    def goToPersonalDetails() {
        Wrappers.click(driver, myAccountButton)
        Wrappers.click(driver, personalDetailsButton)
    }

    @FindBy(xpath = "//a[@href='https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/my-account/saved-carts']")
    private WebElement savedCartsButton

    def goToSavedCarts() {
        Wrappers.click(driver, myAccountButton)
        Wrappers.click(driver, savedCartsButton)
    }

    @FindBy(xpath = "//a[@href='https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/my-account/update-email']")
    private WebElement emailAdressButton

    def goToEmailAdress() {
        Wrappers.click(driver, myAccountButton)
        Wrappers.click(driver, emailAdressButton)
    }

    @FindBy(xpath = "//a[@href='https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/my-account/support-tickets']")
    private WebElement supportTicketsButton

    def goToSupportTickets() {
        Wrappers.click(driver, myAccountButton)
        Wrappers.click(driver, supportTicketsButton)
    }

    @FindBy(xpath = "//a[@href='https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/my-account/update-password']")
    private WebElement passwordButton

    def goToPassword() {
        Wrappers.click(driver, myAccountButton)
        Wrappers.click(driver, passwordButton)
    }

    @FindBy(xpath = "//a[@href='https://powertools.local:9002/yb2bacceleratorstorefront/powertools/en/USD/my-account/returns']")
    private WebElement returnsHistoryButton

    def goToReturnHistory() {
        Wrappers.click(driver, myAccountButton)
        Wrappers.click(driver, returnsHistoryButton)

    }

    /////////////////////////////                                 Search                               //////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//input[@id='js-site-search-input']")
    private WebElement searchInput


    @FindBy(xpath = "//button[@class='js_search_button']")
    private WebElement searchButton

    def SearchFor(String input) {
        Wrappers.click(driver, searchInput)
        Wrappers.sendKeys(driver, searchInput, input)
        Wrappers.click(driver, searchButton)
    }
    /////////////////////////////                                 NavigationLinks                               //////////////////////////////////////////////////////////////////////////
    //@FindBy(xpath = "")
    // private WebElement acceleratorLink

    @FindBy(xpath = "//a[@href='http://www.hybris.com/multichannel-accelerator']")
    private WebElement aboutCommerceAcceleratorLink

    def goToAboutCommerceAccelerator() {
        Wrappers.click(driver, aboutCommerceAcceleratorLink)
    }

    @FindBy(xpath = "//a[@href='https://help.hybris.com']")
    private WebElement documentationLink

    def goToDocumentation() {
        Wrappers.click(driver, documentationLink)
    }

    // @FindBy(xpath = )
    // private WebElement hybrisLink

    @FindBy(xpath = "//a[@href='http://www.hybris.com']")
    private WebElement aboutHybrisLink

    def goToAboutHybris() {
        Wrappers.click(driver, aboutHybrisLink)
    }

    @FindBy(xpath = "//a[@href='http://www.hybris.com/contact']")
    private WebElement contactLink

    def goToContact() {
        Wrappers.click(driver, contactLink)
    }
    @FindBy(xpath = "//a[@title='Follow Us']")
    private WebElement followUsLink

    def goToFollowUs() {
        Wrappers.click(driver, followUsLink)
    }

    @FindBy(xpath = "//a[@href='http://www.agile-commerce.com/']")
    private WebElement agileCommerceBlogLink

    def goToAgileCommerce() {
        Wrappers.click(driver, agileCommerceBlogLink)
    }

    @FindBy(xpath = "//a[@href='http://www.linkedin.com/company/97435']")
    private WebElement linkedinLink

    def goToLinkedin() {
        Wrappers.click(driver, linkedinLink)
    }

    @FindBy(xpath = "//a[@href='http://www.facebook.com/hybrissoftware']")
    private WebElement facebookLink

    def goToFacebook() {
        Wrappers.click(driver, facebookLink)
    }

    @FindBy(xpath = "//a[@href='http://twitter.com/#!/hybris_software']")
    private WebElement twitter

    def goToTwitter() {
        Wrappers.click(driver, twitter)
    }


}

