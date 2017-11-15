package groovy.general.page.object.models

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory
import resources.webUtils.Wrappers


public class BaseClass {
    public WebDriver driver;
    Wrappers wrappers
    MegaMenu megaMenu

    BaseClass(WebDriver driver) {

        this.driver=driver
        this.megaMenu  = new MegaMenu(driver)
        PageFactory.initElements((WebDriver) driver,this)
    }
}
