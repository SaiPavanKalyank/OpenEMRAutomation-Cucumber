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
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using id\u003dauthUser\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-ENSJ7VDG\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.cts.pages.LoginPage.enterUsername(LoginPage.java:21)\r\n\tat com.cts.stepdefinations.StepDefinations.i_enter_login_details_from_Excel_with_SheetName(StepDefinations.java:41)\r\n\tat ✽.I enter login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"LoginValidCredential\"(file:///C:/Users/saipa/Desktop/OpenEmrBDD/src/main/resources/feature/OpenEMRScenario.feature:5)\r\n",
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
