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
  "name": "I enter login details from Excel {string} with SheetName {string}",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_login_details_from_Excel_with_SheetName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal with title as \u0027OpenEMR\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_should_access_to_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
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
  "name": "I enter wrong login details from Excel {string} with SheetName {string}",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_wrong_login_details_from_Excel_with_SheetName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should be displayed as \u0027Invalid username or password\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.error_message_should_be_displayed_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});