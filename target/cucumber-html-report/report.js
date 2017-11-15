$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "name": "Register as a new customer to webshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Input valid data and register in webshop",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationFeatureSteps.iAmOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter New Customer registration through log in page",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFeatureSteps.clickRegisterButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[contains(.,\u0027Register\u0027)]\"}\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DESKTOP-0404NMQ\u0027, ip: \u0027192.168.1.164\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\GRZEGO~1\\AppData\\Local\\Temp\\scoped_dir3840_16939}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d61.0.3163.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 71970743fcb2527a8356f94477a2064c\n*** Element info: {Using\u003dxpath, value\u003d//button[contains(.,\u0027Register\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:458)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat org.openqa.selenium.WebElement$click.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:117)\r\n\tat resources.webUtils.Wrappers.click(Wrappers.groovy:37)\r\n\tat resources.webUtils.Wrappers$click.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat groovy.page.object.models.RegistrationPage.clickRegister(RegistrationPage.groovy:78)\r\n\tat groovy.page.object.models.RegistrationPage$clickRegister.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:117)\r\n\tat groovy.stepdefinitions.RegistrationFeatureSteps.clickRegisterButton(RegistrationFeatureSteps.groovy:32)\r\n\tat ✽.Enter New Customer registration through log in page(src/test/resources/features/registration.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Fill all mandatory data",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFeatureSteps.registerDataInput()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on register button",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationFeatureSteps.clickConfirmRegistrationButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Successful registration as a new customer",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationFeatureSteps.successfulRegistrationConfirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Input valid data and register in webshop",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationFeatureSteps.iAmOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter New Customer registration through log in page",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFeatureSteps.clickRegisterButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[contains(.,\u0027Register\u0027)]\"}\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DESKTOP-0404NMQ\u0027, ip: \u0027192.168.1.164\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\GRZEGO~1\\AppData\\Local\\Temp\\scoped_dir17556_11761}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d61.0.3163.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 69d5f3f8730eede5ce2bb1645f8902d8\n*** Element info: {Using\u003dxpath, value\u003d//button[contains(.,\u0027Register\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:458)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat org.openqa.selenium.WebElement$click.call(Unknown Source)\r\n\tat resources.webUtils.Wrappers.click(Wrappers.groovy:37)\r\n\tat resources.webUtils.Wrappers$click.call(Unknown Source)\r\n\tat groovy.page.object.models.RegistrationPage.clickRegister(RegistrationPage.groovy:78)\r\n\tat groovy.page.object.models.RegistrationPage$clickRegister.call(Unknown Source)\r\n\tat groovy.stepdefinitions.RegistrationFeatureSteps.clickRegisterButton(RegistrationFeatureSteps.groovy:32)\r\n\tat ✽.Enter New Customer registration through log in page(src/test/resources/features/registration.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Fill all mandatory and optional data",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFeatureSteps.registerOptionalDataInput()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on register button",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationFeatureSteps.clickConfirmRegistrationButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Successful registration as a new customer",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationFeatureSteps.successfulRegistrationConfirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Input not all data and register in webshop",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationFeatureSteps.iAmOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter New Customer registration through log in page",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFeatureSteps.clickRegisterButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[contains(.,\u0027Register\u0027)]\"}\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DESKTOP-0404NMQ\u0027, ip: \u0027192.168.1.164\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\GRZEGO~1\\AppData\\Local\\Temp\\scoped_dir19948_24373}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d61.0.3163.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 6ca228655c41b8d5754cb902fbdf37e3\n*** Element info: {Using\u003dxpath, value\u003d//button[contains(.,\u0027Register\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:458)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat org.openqa.selenium.WebElement$click.call(Unknown Source)\r\n\tat resources.webUtils.Wrappers.click(Wrappers.groovy:37)\r\n\tat resources.webUtils.Wrappers$click.call(Unknown Source)\r\n\tat groovy.page.object.models.RegistrationPage.clickRegister(RegistrationPage.groovy:78)\r\n\tat groovy.page.object.models.RegistrationPage$clickRegister.call(Unknown Source)\r\n\tat groovy.stepdefinitions.RegistrationFeatureSteps.clickRegisterButton(RegistrationFeatureSteps.groovy:32)\r\n\tat ✽.Enter New Customer registration through log in page(src/test/resources/features/registration.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Leave at least one mandatory section unfilled",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationFeatureSteps.withoutNameDataInput()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on register button",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationFeatureSteps.clickConfirmRegistrationButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Redirect to registration page with highlightened unfilled/invalid sections",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationFeatureSteps.failedRegistrationNotFilledMandatoryField()"
});
formatter.result({
  "status": "skipped"
});
});