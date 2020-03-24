package com.cts.stepdefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import com.cts.pages.DashboardPage;
import com.cts.pages.LoginPage;
import com.cts.utils.ReadExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
	WebDriver driver;

	@Given("i have browser with openemrpage")
	public void i_have_browser_with_openemrpage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter login details from Excel \\{string} with SheetName \\{string}")
	public void i_enter_login_details_from_Excel_with_SheetName() throws IOException {
		String str[][] = ReadExcel.getSheetIntoStringArray("src/test/resources/Excel/openEMR.xlsx", "LoginValidCredential");
		LoginPage.enterUsername(driver, str[0][0]);
		LoginPage.enterPassword(driver, str[0][1]);
		LoginPage.clickLogin(driver);

	}

	@Then("I should access to the portal with title as {string}")
	public void i_should_access_to_the_portal_with_title_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();

	}

	@Given("I have browser with openemrpage")
	public void i_have_browser_with_openemrpage1() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");

	}


@When("I enter wrong login details from Excel \\{string} with SheetName \\{string}")
public void i_enter_wrong_login_details_from_Excel_with_SheetName() throws IOException {
	String str[][] = ReadExcel.getSheetIntoStringArray("src/test/resources/Excel/openEMR.xlsx", "invalidCredential");
		LoginPage.enterUsername(driver, str[0][0]);
		LoginPage.enterPassword(driver, str[0][1]);
		LoginPage.clickLogin(driver);
//		LoginPage.enterUsername(driver, str[1][0]);
//		LoginPage.enterPassword(driver, str[1][1]);
//		LoginPage.clickLogin(driver);
//		LoginPage.enterUsername(driver, str[2][0]);
//		LoginPage.enterPassword(driver, str[2][1]);
//		LoginPage.clickLogin(driver);

	}

@Then("Error message should be displayed as {string}")
public void error_message_should_be_displayed_as(String string) {
		LoginPage.errormessg(driver);
		String actualmessg=LoginPage.errormessg(driver);
		String expectedmessg = ("Invalid username or password");

		Assert.assertEquals(actualmessg, expectedmessg);
		driver.quit();

	}
@Given("I have browser with openemrpage and loggedin")
public void i_have_browser_with_openemrpage_and_loggedin() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
	LoginPage.enterUsername(driver, "admin");
	LoginPage.enterPassword(driver, "pass");
	LoginPage.clickLogin(driver);
    
}

@When("I click on create new patient without entering details")
public void i_click_on_create_new_patient_without_entering_details() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	DashboardPage.mouseOverOnPatient(driver);
	DashboardPage.clickOnNew(driver);
	DashboardPage.clickOnCreate(driver);

	
    
}

@Then("Error message should be displayed")
public void error_message_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
	String pageSourceforerror=driver.getPageSource();
	if(pageSourceforerror.toLowerCase().contains("not valid"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	driver.quit();
}
@When("I click on recall board and enter details")
public void i_click_on_recall_board_and_enter_details() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    DashboardPage.clickOnRecallBoard(driver);
    DashboardPage.clickOnNewRecall(driver);
    Thread.sleep(3000);
    driver.switchTo().defaultContent();
    DashboardPage.clickOnName(driver);
    //Thread.sleep(3000);
    driver.switchTo().defaultContent();
    driver.switchTo().frame("modalframe");
   DashboardPage.searchForName(driver);
   DashboardPage.clickOnSearch(driver);
   Thread.sleep(3000);
   DashboardPage.clickOnSearchResults(driver);
    driver.switchTo().defaultContent();
    
    
    DashboardPage.selectyears(driver);
    driver.switchTo().defaultContent();
    Thread.sleep(5000);
    driver.switchTo().frame("recall");
    DashboardPage.clickOnAddRecall(driver);
    driver.switchTo().defaultContent();
    Thread.sleep(10000);
    DashboardPage.enterdate(driver);
    DashboardPage.clickOnFilter(driver);
    Thread.sleep(5000);


}

@Then("New recall should be created")
public void new_recall_should_be_created() {
    // Write code here that turns the phrase above into concrete actions
	String pageSource=driver.getPageSource();
	if(pageSource.toLowerCase().contains("phil belford"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	driver.quit();
    
}

@When("I click on Time sheet and create an appointment")
public void i_click_on_Time_sheet_and_create_an_appointment() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	DashboardPage.clickOnTime(driver);
	DashboardPage.clickOnCategory(driver);
	DashboardPage.clickOnPatientName(driver);
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.switchTo().frame("findPatient");
	DashboardPage.searchForName(driver);
	DashboardPage.clickOnSearch(driver);
	DashboardPage.clickOnSearchResults(driver);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("modalframe");
	DashboardPage.selectStatus(driver);
	DashboardPage.selectRoom(driver);
	DashboardPage.clickOnSave(driver);
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.switchTo().frame("cal");
	driver.switchTo().frame("Calendar");
	
    
}

@Then("New appointment should be created")
public void new_appointment_should_be_created() {
    // Write code here that turns the phrase above into concrete actions
	String pageSourcefornppointment=driver.getPageSource();
	if(pageSourcefornppointment.toLowerCase().contains("belford"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	driver.quit();
   
}
@When("I click on search an appointment")
public void i_click_on_search_an_appointment() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	
	driver.switchTo().frame("cal");
	driver.switchTo().frame("Calendar");
	DashboardPage.clickonsearchappointment(driver);
	DashboardPage.searchappointmentname(driver);
	DashboardPage.selectcategoryforappontmentsearch(driver);
	DashboardPage.selectproviderforappointmentsearch(driver);
	DashboardPage.selectfacilityforappointmentsearch(driver);
	DashboardPage.clickonsubmitforappointmentsearch(driver);
}

@Then("Searched appointment should be displayed")
public void searched_appointment_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
	String pageSourceforappointment=driver.getPageSource();
	if(pageSourceforappointment.toLowerCase().contains("belford"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	driver.quit();
    
}
@When("I click on logout")
public void i_click_on_logout() {
	// Write code here that turns the phrase above into concrete actions
	//DashboardPage.waitforMessgElementpresence(driver);
	//LoginPage.enterUsername(driver, "physician");
	//LoginPage.enterphysicianword(driver, "physician");
	//LoginPage.clickLogin(driver);

	DashboardPage.clickOnLogout(driver);
}

@Then("It should be logged out")
public void it_should_be_logged_out() {
	// Write code here that turns the phrase above into concrete actions
driver.quit();
}


}
