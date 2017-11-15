package resources.webUtils


import groovy.AquisitionRunner
import groovy.Config
import groovy.DriverManager


import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.Assert
import org.testng.ITestListener
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies

import javax.imageio.ImageIO
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalTime
import org.testng.ITestResult
import org.testng.ITestListener

/**
 * Created by Grzegorz Gałuszka on 26.10.2017.
 */
class Wrappers {
    WebDriver driver


    public Wrappers() {driver =  DriverManager.getInstance().getWebDriver()}
    public static void click(WebDriver driver, WebElement element) {

        try {
            element.click()}
        catch (NoSuchElementException e) {
            (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
            element.click()}
        catch (StaleElementReferenceException sere) {
            // simply retry finding the element in the refreshed DOM
            element.click()
        }
        catch (TimeoutException toe) {
            System.out.println("Element was not clickable after 10 seconds")
        }
        takeScreenshot()
    }

    public static void sendKeys(WebDriver driver, WebElement element,String keys) {
        try {
            element.sendKeys(keys)}
        catch (NoSuchElementException e) {
            (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
            element.sendKeys(keys)}
        catch (StaleElementReferenceException sere) {
            // simply retry finding the element in the refreshed DOM
            element.sendKeys(keys);
        }
        catch (TimeoutException toe) {
            System.out.println("Element was not clickable after 10 seconds");
        }
        takeScreenshot()
    }

    public static getText(WebDriver driver, WebElement element) {
        try {
            element.getText()}
        catch (NoSuchElementException e) {
            (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
            def value= element.getText()
            return value}
        catch (StaleElementReferenceException sere) {
            // simply retry finding the element in the refreshed DOM
            def value= element.getText()
            return value
        }
        catch (TimeoutException toe) {
            System.out.println("Element was not clickable after 10 seconds");
        }
        takeScreenshot()
    }

    public static getList(WebDriver driver,  List<WebElement> elements) {
        try {
            def list= elements
            return list
        }
        catch (NoSuchElementException e) {
            (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(elements[0]));
            def list= elements
            return list
        }
        catch (StaleElementReferenceException sere) {
            // simply retry finding the element in the refreshed DOM
            def list= elements
            return list
        }
        catch (TimeoutException toe) {
            System.out.println("Element was not clickable after 10 seconds")
        }
        takeScreenshot()

    }
    public static boolean isElementPresent(WebDriver driver, List<WebElement> elements) {
        try { if (elements.size()>0)
            return true
        }
        catch (NoSuchElementException e) {
            (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(elements[0]))
            if (elements.size()>0)
                return true
        }
        catch (StaleElementReferenceException sere) {
            // simply retry finding the element in the refreshed DOM
            if (elements.size()>0)
                return true
        }
        catch (TimeoutException toe) {
            System.out.println("Element was not clickable after 10 seconds")
        }
        takeScreenshot()
    }

    public static getNumberOfElements(WebDriver driver,  List<WebElement> elements) {
        try {
            def list= elements
            return list.size()
        }
        catch (NoSuchElementException e) {
            (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(elements[0]));
            def list= elements
            return list.size()}
        catch (StaleElementReferenceException sere) {
            // simply retry finding the element in the refreshed DOM
            def list= elements
            return list.size()
        }
        catch (TimeoutException toe) {
            System.out.println("Element was not clickable after 10 seconds")
        }
        takeScreenshot()
    }

    public static void checkMessage(WebDriver driver, WebElement element,String message)
    {
        Assert.assertTrue(element.getText().contains(message))
    }
    public static void takeScreenshot() {
        String currentScenario = getScenarioTitle()
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(DriverManager.getInstance().webDriver);
        String localTime = new SimpleDateFormat("HH_mm_ss").format(Calendar.getInstance().getTime()).toString()
        String localDate = new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime()).toString()
        String screenshotPath = "target/cucumber-html-report/" + "/" + localDate.toString() + " screens"
        createFolder(screenshotPath)
        String fileName = localTime + "_" +currentScenario + ".PNG"
        try {
            ImageIO.write(screenshot.getImage(), "PNG", new File(screenshotPath+"\\" +fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFolder (String path) {
        File testDirectory = new File(path);
        if (!testDirectory.exists()) {
            System.out.println(path);
            if (testDirectory.mkdirs()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        } else {
            System.out.println("Directory already exists: " + path);
        }


        }
    private static getScenarioTitle(ITestResult iTestResult){

        Object[] parameters = iTestResult.getParameters()
        String currentScenario = parameters[0].toString().replaceAll(" ", "_").replaceAll("\"","")
        return currentScenario
    }

    public static void deleteScreenshots(){
        String currentScenario = getScenarioTitle()
        String localDate = new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime()).toString()
        String screenshotPath = "target/cucumber-html-report/" + "/" + localDate.toString() + " screens"
        File directory = new File(screenshotPath);
        File[] files = directory.listFiles()
        for (File f : files)
        {
            if (f.getName().contains(currentScenario))
            {
                f.delete();
            }
        }
    }
}