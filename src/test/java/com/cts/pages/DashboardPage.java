package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	private static By patientLoc=By.xpath("//div[text()=('Patient/Client')]");
	private static By newLoc=By.xpath("//div[text()=('New/Search')]");
	private static By createLoc=By.id("create");
	private static By recallLoc=By.xpath("//div[contains(text(),'Recall Board')]");
	private static By newrecallLoc=By.xpath("//button[@class='btn btn-default btn-add']");
	private static By nameLoc=By.xpath("//input[@id='new_recall_name']");
	private static By searchnameLoc=By.xpath("//input[@name='searchparm']");
	private static By clickonsearchLoc=By.xpath("//input[@id='submitbtn']");
	private static By clickonsearchresultsLoc=By.xpath("//tbody[@id='searchResults']");
	private static By recallwhenLoc=By.xpath("//label[@for='new_recall_when_1yr']");
	private static By dateLoc=By.xpath("//input[@id='form_to_date']");
	private static By addrecallLoc=By.id("add_new");
	private static By timeLoc=By.partialLinkText("11:45");
	private static By categoryLoc=By.xpath("(//select[@class='input-sm']/option)[5]");
	private static By patientnameLoc=By.xpath("//input[@name='form_patient']");
	private static By selectstatusLoc=By.xpath(("((//select[@class='form-control'])[2]/option)[15]"));
	private static By selectroomLoc=By.xpath(("((//select[@class='form-control'])[3]/option)[3]"));
	private static By saveLoc=By.id("form_save");
	private static By filterLoc=By.id("filter_submit");
	private static By clickLoc=By.xpath("//div[@class='container-fluid']");
	private static By appointmentsearchLoc=By.xpath("//a[@title='Search Appointment']");
	private static By appointmentsearchnameLoc=By.id("pc_keywords");
	private static By selectcategoryforappointmentsearchLoc=By.xpath("(//select[@name='pc_category']/option)[5]");
	private static By selectproviderforappointmentsearchLoc=By.xpath("(//select[@name='provider_id']/option)[3]");
	private static By selectfacilityforappointmentsearchLoc=By.xpath("(//select[@name='pc_facility']/option)[2]");
	private static By submitforappointmentsearchLoc=By.id("submit");
	
	
	
	private static By messgLoc = By.xpath("//div[text()='Messages']");
	private static By logoutmoLoc=By.xpath("//span[text()='Smith']");
	private static By logoutLoc=By.xpath("//li[text()='Logout']");
	
	public static void mouseOverOnPatient(WebDriver driver)
	{
		WebElement searchEle = driver.findElement(patientLoc);
		// searchEle.click();

		Actions action = new Actions(driver);
		action.moveToElement(searchEle).build().perform();
	}
	public static void clickOnNew(WebDriver driver)
	{
	driver.findElement(newLoc).click();
	}
	public static void clickOnCreate(WebDriver driver) throws InterruptedException
	{
		driver.switchTo().frame("pat");
		Thread.sleep(3000);
        driver.findElement(createLoc).click();
	}
	public static void clickOnRecallBoard(WebDriver driver)
	{
		driver.findElement(recallLoc).click();
	}
	public static void clickOnNewRecall(WebDriver driver) throws InterruptedException
	{
		driver.switchTo().frame("rcb");
	    Thread.sleep(3000);
	    driver.findElement(newrecallLoc).click();
	}
	public static void clickOnName(WebDriver driver)
	{
		driver.switchTo().frame("recall");
		driver.findElement(nameLoc).click();
	}
	public static void searchForName(WebDriver driver) 
	{
		//driver.switchTo().frame("modalframe");
	    driver.findElement(searchnameLoc).sendKeys("belford");
	}
	public static void clickOnSearch(WebDriver driver) 
	{
		
	    driver.findElement(clickonsearchLoc).click();
	}
	public static void clickOnSearchResults(WebDriver driver)
	{
	    
	    driver.findElement(clickonsearchresultsLoc).click();
	}
	public static void selectyears(WebDriver driver)
	{
		driver.switchTo().frame("recall");
		driver.findElement(recallwhenLoc).click();
		
	}
	public static void enterdate(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.switchTo().frame("recall");
		driver.findElement(dateLoc).clear();
		driver.findElement(dateLoc).sendKeys("2022-01-30");
		driver.findElement(clickLoc).click();
	}
	
	public static void clickOnAddRecall(WebDriver driver)
	{
		driver.findElement(addrecallLoc).click();
	}
	public static void clickOnFilter(WebDriver driver)
	{
		driver.findElement(filterLoc).click();
	}
	public static void waitforMessgElementpresence(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(messgLoc));
	}

	public static String getCurrentTitle(WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	public static void clickOnTime(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.switchTo().frame("cal");
		driver.switchTo().frame("Calendar");
		driver.findElement(timeLoc).click();
		driver.switchTo().defaultContent();
	}
	public static void clickOnCategory(WebDriver driver) throws InterruptedException
	{
        Thread.sleep(5000);
        driver.switchTo().frame("modalframe");
		driver.findElement(categoryLoc).click();
	}
	public static void clickOnPatientName(WebDriver driver)
	{
		driver.findElement(patientnameLoc).click();
		//driver.switchTo().defaultContent();
	}
	public static void selectStatus(WebDriver driver)
	{
		driver.findElement(selectstatusLoc).click();
	}
	public static void selectRoom(WebDriver driver)
	{
		driver.findElement(selectroomLoc).click();
	}
	public static void clickOnSave(WebDriver driver)
	{
		driver.findElement(saveLoc).click();
	}
	public static void clickonsearchappointment(WebDriver driver)
	{
		driver.findElement(appointmentsearchLoc).click();
	}
	public static void searchappointmentname(WebDriver driver)
	{
		driver.findElement(appointmentsearchnameLoc).sendKeys("bel");
	}
	public static void selectcategoryforappontmentsearch(WebDriver driver)
	{
		driver.findElement(selectcategoryforappointmentsearchLoc).click();
	}
	public static void selectproviderforappointmentsearch(WebDriver driver)
	{
		driver.findElement(selectproviderforappointmentsearchLoc).click();
	}
	public static void selectfacilityforappointmentsearch(WebDriver driver)
	{
		driver.findElement(selectfacilityforappointmentsearchLoc).click();
	}
	public static void clickonsubmitforappointmentsearch(WebDriver driver)
	{
		driver.findElement(submitforappointmentsearchLoc).click();
	}
	
	
	
	
	
	
	
	public static void clickOnLogout(WebDriver driver)
	{
		WebElement lomEle = driver.findElement(logoutmoLoc);
		Actions action = new Actions(driver);
		action.moveToElement(lomEle).build().perform();
		driver.findElement(logoutLoc).click();
	}
}
