package groovy;

/**
 * Created by fts on 26.10.2017.
 */

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.testng.ITestResult;
import org.testng.annotations.*;
import resources.webUtils.Wrappers;


import java.lang.reflect.Method;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "src/test/resources/features/registration.feature",
        glue = "groovy.stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-json-report.json" }
        //,tags = {"@Tag1,@Tag2,etc."}
)
public class RegistrationRunner extends MainRunner {

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {

    }


    @Parameters({ "browser" })
    @BeforeMethod
    public void setUpBeforeMethod(int browser) throws Exception{
         this.initializeDriver(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownAfterMethod(ITestResult result) throws IOException {
//        if (result.isSuccess()) {
//
//            //To w zaleznosci jak chcemy robic screeny, mozna by wywalic i zmienic (że jak bedzie bład to by wtedy robil screena)
//            //a tak to robi screena po prostu co Scenario z cucumbera
//            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            String failureImageFileName = result.getMethod().getMethodName()
//                    + new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
//            File failureImageFile = new File(System.getProperty("user.dir") + "//screenshots//" + failureImageFileName);
//            FileUtils.copyFile(imageFile, failureImageFile);
//
//        }
       quit();

    }

    @AfterSuite
    public void reportIt() throws Exception {
        CucumberResultsOverview results = new CucumberResultsOverview();
        String localTime = new SimpleDateFormat("HH_mm_ss").format(Calendar.getInstance().getTime()).toString();
        String localDate = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()).toString();
        String path = "target/cucumber-html-report/" + "/" + localDate.toString() +" report";
        Wrappers.createFolder(path);
        results.setOutputDirectory(path);
        results.setOutputName("report "+localDate+"at "+localTime);
        results.setSourceFile("target/cucumber-json-report.json");
        results.executeFeaturesOverviewReport();

    }
}
