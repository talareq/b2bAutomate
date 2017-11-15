package groovy.listeners

import org.testng.ITestContext
import org.testng.ITestListener
import org.testng.ITestResult
import resources.webUtils.Wrappers


class FailListener implements ITestListener   {
    @Override
    void onTestStart(ITestResult iTestResult) {

    }

    @Override
    void onTestSuccess(ITestResult iTestResult) {
        Wrappers.deleteScreenshots()

    }

    @Override
    void onTestFailure(ITestResult iTestResult) {
        Wrappers.takeScreenshot()

    }

    @Override
    void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    void onStart(ITestContext iTestContext) {

    }

    @Override
    void onFinish(ITestContext iTestContext) {

    }
}


