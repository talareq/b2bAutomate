package groovy

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.PageFactory

/**
 * Created by Grzegorz Gałuszka on 03.11.2017.
 */
class DriverFactory {
    private DriverFactory() {

    }

    static WebDriver createDriver(int browser) {

        switch (browser) {
            case 1:
                System.out.println("Firefox");
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "//src//test//resources//drivers/geckodriver.exe");
                return new FirefoxDriver();

            case 2:
                System.out.println("CHROME");
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "//src//test//resources//drivers/chromedriver.exe");
                return new ChromeDriver();

            default:
                System.out.println("No browser selected!");
                return null;
        }

    }
}