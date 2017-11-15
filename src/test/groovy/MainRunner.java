package groovy;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import resources.webUtils.Wrappers;

import java.util.concurrent.TimeUnit;


public class MainRunner extends AbstractTestNGCucumberTests {
    private WebDriver driver;

    public WebDriver initializeDriver(int browser) {
        DriverManager.getInstance().createDriver(browser);
        this.driver = DriverManager.getInstance().getWebDriver();
        maximizeWindow();
        deleteAllCookies();
        return driver;
   }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void implicitWait(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void pageLoad(int time) {
        driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
    }

    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }

    public void setEnv() throws Exception {
        //String baseUrl = "http://www.google.com";
        //driver.get(baseUrl);
    }
    public void quit(){
        driver.quit();
    }


}
