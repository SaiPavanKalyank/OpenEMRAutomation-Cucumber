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
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter login details from Excel {string} with SheetName {string}")
	public void i_enter_login_details_from_Excel_with_SheetName(String filedetails, String sheetname)
			throws IOException {
		String str[][] = ReadExcel.getSheetIntoStringArray("src/test/resources/Excel/openEMR.xlsx",
				"LoginValidCredential");
		// object for constructor
		LoginPage login = new LoginPage(driver);
		// enter user name
		login.enterUsername(str[0][0]);
		// enter password
		login.enterPassword(str[0][1]);
		// click on login
		login.clickLogin();

	}

	@Then("I should access to the portal with title as {string}")
	public void i_should_access_to_the_portal_with_title_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		String pageSource = driver.getPageSource();
		if (pageSource.toLowerCase().contains("openemr")) {
			System.out.println("PASS");
		} else {
			Assert.fail("Not accessed to required portal");
		}
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.tearDown();

	}

	@Given("I have browser with openemrpage")
	public void i_have_browser_with_openemrpage1() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");

	}

	@When("I enter wrong login details from Excel {string} with SheetName {string}")
	public void i_enter_wrong_login_details_from_Excel_with_SheetName(String filedetails, String sheetname)
			throws IOException {
		String str[][] = ReadExcel.getSheetIntoStringArray("src/test/resources/Excel/openEMR.xlsx",
				"invalidCredential");
		// object for constructor
		LoginPage login = new LoginPage(driver);
		// enter user name
		login.enterUsername(str[0][0]);
		// enter password
		login.enterPassword(str[0][1]);
		// click on login
		login.clickLogin();
		// enter user name
		login.enterUsername(str[1][0]);
		// enter password
		login.enterPassword(str[1][1]);
		// click on login
		login.clickLogin();
		// enter user name
		login.enterUsername(str[2][0]);
		// enter password
		login.enterPassword(str[2][1]);
		// click on login
		login.clickLogin();

	}

	@Then("Error message should be displayed as {string}")
	public void error_message_should_be_displayed_as(String string) {
		// object for constructor
		LoginPage login = new LoginPage(driver);
		// get error message
		login.errormessg();
		String actualmessg = login.errormessg();
		String expectedmessg = ("Invalid username or password");
		// assert error message
		Assert.assertEquals(actualmessg, expectedmessg);
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.tearDown();

	}

	@Given("I have browser with openemrpage and loggedin")
	public void i_have_browser_with_openemrpage_and_loggedin() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		// object for constructor
		LoginPage login = new LoginPage(driver);
		// enter user name
		login.enterUsername("admin");
		// enter password
		login.enterPassword("pass");
		// click on login
		login.clickLogin();

	}

	@When("I click on create new patient without entering details")
	public void i_click_on_create_new_patient_without_entering_details() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// object for constructor
		DashboardPage dashboard = new DashboardPage(driver);
		// move mouse onto patient
		dashboard.mouseOverOnPatient();
		// click on new
		dashboard.clickOnNew();
		// click on create
		dashboard.clickOnCreate();

	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		String pageSourceforerror = driver.getPageSource();
		if (pageSourceforerror.toLowerCase().contains("not valid")) {
			System.out.println("PASS");
		} else {
			Assert.fail("Error message not displayed");
		}
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.tearDown();
	}

	@When("I click on recall board and enter details")
	public void i_click_on_recall_board_and_enter_details() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// object for constructor
		DashboardPage dashboard = new DashboardPage(driver);
		// click on recall board
		dashboard.clickOnRecallBoard();
		// click on new recall
		dashboard.clickOnNewRecall();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		// click on name
		dashboard.clickOnName();
		// Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("modalframe");
		// click on search for name
		dashboard.searchForName();
		// clcik on search
		dashboard.clickOnSearch();
		Thread.sleep(3000);
		// click on search results
		dashboard.clickOnSearchResults();
		driver.switchTo().defaultContent();
		// click on select years
		dashboard.selectyears();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("recall");
		// click on add recall
		dashboard.clickOnAddRecall();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		// enter date
		dashboard.enterdate();
		// click on filter
		dashboard.clickOnFilter();
		Thread.sleep(5000);

	}

	@Then("New recall should be created")
	public void new_recall_should_be_created() {
		// Write code here that turns the phrase above into concrete actions
		String pageSource = driver.getPageSource();
		if (pageSource.toLowerCase().contains("phil belford")) {
			System.out.println("PASS");
		} else {
			Assert.fail("New Recall not created");
		}
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.tearDown();

	}

	@When("I click on Time sheet and create an appointment")
	public void i_click_on_Time_sheet_and_create_an_appointment() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// object for constructor
		DashboardPage dashboard = new DashboardPage(driver);
		// clcik on time
		dashboard.clickOnTime();
		// click on category
		dashboard.clickOnCategory();
		// click on patient name
		dashboard.clickOnPatientName();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("findPatient");
		// click on search for name
		dashboard.searchForName();
		// click on search
		dashboard.clickOnSearch();
		// click on search results
		dashboard.clickOnSearchResults();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("modalframe");
		// click on select status
		dashboard.selectStatus();
		// click on select room
		dashboard.selectRoom();
		// click on save
		dashboard.clickOnSave();
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
		String pageSourcefornppointment = driver.getPageSource();
		if (pageSourcefornppointment.toLowerCase().contains("belford")) {
			System.out.println("PASS");
		} else {
			Assert.fail("New Appointment not created");
		}
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.tearDown();

	}

	@When("I click on search an appointment")
	public void i_click_on_search_an_appointment() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);

		driver.switchTo().frame("cal");
		driver.switchTo().frame("Calendar");
		// object for constructor
		DashboardPage dashboard = new DashboardPage(driver);
		// click on search for appointment
		dashboard.clickonsearchappointment();
		// click on search appointment name
		dashboard.searchappointmentname();
		// click on select category for appontment search
		dashboard.selectcategoryforappontmentsearch();
		// click on select provider for appointment search
		dashboard.selectproviderforappointmentsearch();
		// click on select facility for appointment search
		dashboard.selectfacilityforappointmentsearch();
		// click on click on submit for appointment search
		dashboard.clickonsubmitforappointmentsearch();
	}

	@Then("Searched appointment should be displayed")
	public void searched_appointment_should_be_displayed() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		String pageSourceforappointment = driver.getPageSource();
		if (pageSourceforappointment.toLowerCase().contains("belford")) {

			System.out.println("PASS");
		} else {
			Assert.fail("Searched Appointment not dispalyed");
		}
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.tearDown();

	}

	@When("I click on logout")
	public void i_click_on_logout() {
		// Write code here that turns the phrase above into concrete actions

		// object for constructor
		DashboardPage dashboard = new DashboardPage(driver);
		// click on logout
		dashboard.clickOnLogout();
	}

	@Then("I should go to the portal with title as {string}")
	public void i_should_go_to_the_portal_with_title_as(String string) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		String pageSource = driver.getPageSource();
		if (pageSource.toLowerCase().contains("openemr login")) {

			System.out.println("PASS");
		} else {
			Assert.fail("I haven't redirected to required portal");
		}

		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.tearDown();
	}

}
