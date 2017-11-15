package groovy

import com.github.mkolisnyk.cucumber.reporting.CucumberUsageReporting

/**
 * Created by Grzegorz Gałuszka on 30.10.2017.
 */import cucumber.api.CucumberOptions
import org.junit.After
import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory
import org.testng.ITestResult;
import org.testng.annotations.*

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview
import resources.webUtils.Wrappers

import java.text.SimpleDateFormat


@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "src/test/resources/features/login.feature",
        glue = "groovy.stepdefinitions",
        plugin = ["pretty", "json:target/cucumber-json-report.json" ]
        //,tags = {"@Tag1,@Tag2,etc."}
)
class AquisitionRunner extends MainRunner {


    @Parameters([ "browser" ])


    @BeforeSuite(alwaysRun = true)
    public setUp() throws Exception {


          }

    @Parameters([ "browser" ])
    @BeforeMethod
    public void setUpBeforeMethod(int browser) throws Exception{
       this.initializeDriver(browser)


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
        quit()
    }
@AfterSuite
        public void reportIt(){
    CucumberResultsOverview results = new CucumberResultsOverview()
    String localTime = new SimpleDateFormat("HH_mm_ss").format(Calendar.getInstance().getTime()).toString()
    String localDate = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()).toString()
    String path = "target/cucumber-html-report/" + "/" + localDate.toString() +" report"
    Wrappers.createFolder(path)
    results.setOutputDirectory(path)
    results.setOutputName("report "+localDate+"at "+localTime)
    results.setSourceFile("target/cucumber-json-report.json")
    results.executeFeaturesOverviewReport()

}
    }

