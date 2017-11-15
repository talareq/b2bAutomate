package groovy

import org.openqa.selenium.WebDriver
import org.testng.annotations.Parameters


/**
 * Created by Grzegorz Gałuszka on 03.11.2017.
 */
class DriverManager {
    private static final DriverManager INSTANCE = new DriverManager()
    private WebDriver webDriver

    private DriverManager() {

    }

    WebDriver getWebDriver() {
        return this.webDriver;
    }

    void createDriver(int browser) {
        this.webDriver = DriverFactory.createDriver(browser)
    }

    static DriverManager getInstance() {
        return INSTANCE
    }
}



