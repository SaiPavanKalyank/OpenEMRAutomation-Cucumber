$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/OpenEMRScenario.feature");
formatter.feature({
  "name": "Scenarios",
  "description": "In order to check if the application is working as required",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "LoginValidCredential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "i have browser with openemrpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_have_browser_with_openemrpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"LoginValidCredential\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_login_details_from_Excel_with_SheetName(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#authUser\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-ENSJ7VDG\u0027, ip: \u0027192.168.43.222\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\saipa\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51742}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 784ec312fd2982e9096642fb473faebb\n*** Element info: {Using\u003did, value\u003dauthUser}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.cts.pages.LoginPage.enterUsername(LoginPage.java:21)\r\n\tat com.cts.stepdefinations.StepDefinations.i_enter_login_details_from_Excel_with_SheetName(StepDefinations.java:41)\r\n\tat ✽.I enter login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"LoginValidCredential\"(file:///C:/Users/saipa/Desktop/OpenEmrBDD/src/main/resources/feature/OpenEMRScenario.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I should access to the portal with title as \u0027OpenEMR\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_should_access_to_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "invalidCredential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have browser with openemrpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_have_browser_with_openemrpage1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter wrong login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"invalidCredential\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_wrong_login_details_from_Excel_with_SheetName(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#authUser\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-ENSJ7VDG\u0027, ip: \u0027192.168.43.222\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\saipa\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51768}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ee77254f3d2861dd81ad8cb209728149\n*** Element info: {Using\u003did, value\u003dauthUser}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.cts.pages.LoginPage.enterUsername(LoginPage.java:21)\r\n\tat com.cts.stepdefinations.StepDefinations.i_enter_wrong_login_details_from_Excel_with_SheetName(StepDefinations.java:82)\r\n\tat ✽.I enter wrong login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"invalidCredential\"(file:///C:/Users/saipa/Desktop/OpenEmrBDD/src/main/resources/feature/OpenEMRScenario.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Error message should be displayed as \u0027Invalid username or password\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.error_message_should_be_displayed_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});