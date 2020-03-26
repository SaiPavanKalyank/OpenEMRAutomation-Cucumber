package com.cts.pages;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	private WebDriver driver; 
	 public DashboardPage(WebDriver driver) {
			this.driver = driver;
	 }
	private  By patientLoc=By.xpath("//div[text()=('Patient/Client')]");
	private  By newLoc=By.xpath("//div[text()=('New/Search')]");
	private  By createLoc=By.id("create");
	private  By recallLoc=By.xpath("//div[contains(text(),'Recall Board')]");
	private  By newrecallLoc=By.xpath("//button[@class='btn btn-default btn-add']");
	private  By nameLoc=By.xpath("//input[@id='new_recall_name']");
	private  By searchnameLoc=By.xpath("//input[@name='searchparm']");
	private  By clickonsearchLoc=By.xpath("//input[@id='submitbtn']");
	private  By clickonsearchresultsLoc=By.xpath("//tbody[@id='searchResults']");
	private  By recallwhenLoc=By.xpath("//label[@for='new_recall_when_1yr']");
	private  By dateLoc=By.xpath("//input[@id='form_to_date']");
	private  By addrecallLoc=By.id("add_new");
	private  By timeLoc=By.partialLinkText("11:45");
	private  By categoryLoc=By.xpath("(//select[@class='input-sm']/option)[5]");
	private  By patientnameLoc=By.xpath("//input[@name='form_patient']");
	private  By selectstatusLoc=By.xpath(("((//select[@class='form-control'])[2]/option)[15]"));
	private  By selectroomLoc=By.xpath(("((//select[@class='form-control'])[3]/option)[3]"));
	private  By saveLoc=By.id("form_save");
	private  By filterLoc=By.id("filter_submit");
	private  By clickLoc=By.xpath("//div[@class='container-fluid']");
	private  By appointmentsearchLoc=By.xpath("//a[@title='Search Appointment']");
	private  By appointmentsearchnameLoc=By.id("pc_keywords");
	private  By selectcategoryforappointmentsearchLoc=By.xpath("(//select[@name='pc_category']/option)[5]");
	private  By selectproviderforappointmentsearchLoc=By.xpath("(//select[@name='provider_id']/option)[3]");
	private  By selectfacilityforappointmentsearchLoc=By.xpath("(//select[@name='pc_facility']/option)[2]");
	private  By submitforappointmentsearchLoc=By.id("submit");
	
	
	
	private  By messgLoc = By.xpath("//div[text()='Messages']");
	private  By logoutmoLoc=By.xpath("//span[text()='Smith']");
	private  By logoutLoc=By.xpath("//li[text()='Logout']");
	
	public  void mouseOverOnPatient()
	{
		WebElement searchEle = driver.findElement(patientLoc);
		// searchEle.click();

		Actions action = new Actions(driver);
		action.moveToElement(searchEle).build().perform();
	}
	public  void clickOnNew()
	{
	driver.findElement(newLoc).click();
	}
	public  void clickOnCreate() throws InterruptedException
	{
		driver.switchTo().frame("pat");
		Thread.sleep(3000);
        driver.findElement(createLoc).click();
	}
	public  void clickOnRecallBoard()
	{
		driver.findElement(recallLoc).click();
	}
	public  void clickOnNewRecall() throws InterruptedException
	{
		driver.switchTo().frame("rcb");
	    Thread.sleep(3000);
	    driver.findElement(newrecallLoc).click();
	}
	public  void clickOnName()
	{
		driver.switchTo().frame("recall");
		driver.findElement(nameLoc).click();
	}
	public  void searchForName() 
	{
		//driver.switchTo().frame("modalframe");
	    driver.findElement(searchnameLoc).sendKeys("belford");
	}
	public  void clickOnSearch() 
	{
		
	    driver.findElement(clickonsearchLoc).click();
	}
	public  void clickOnSearchResults()
	{
	    
	    driver.findElement(clickonsearchresultsLoc).click();
	}
	public  void selectyears()
	{
		driver.switchTo().frame("recall");
		driver.findElement(recallwhenLoc).click();
		
	}
	public  void enterdate() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.switchTo().frame("recall");
		driver.findElement(dateLoc).clear();
		driver.findElement(dateLoc).sendKeys("2022-01-30");
		driver.findElement(clickLoc).click();
	}
	
	public  void clickOnAddRecall()
	{
		driver.findElement(addrecallLoc).click();
	}
	public  void clickOnFilter()
	{
		driver.findElement(filterLoc).click();
	}
	public  void waitforMessgElementpresence()
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(messgLoc));
	}

	public  String getCurrentTitle()
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	public  void clickOnTime() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.switchTo().frame("cal");
		driver.switchTo().frame("Calendar");
		driver.findElement(timeLoc).click();
		driver.switchTo().defaultContent();
	}
	public  void clickOnCategory() throws InterruptedException
	{
        Thread.sleep(5000);
        driver.switchTo().frame("modalframe");
		driver.findElement(categoryLoc).click();
	}
	public  void clickOnPatientName()
	{
		driver.findElement(patientnameLoc).click();
		//driver.switchTo().defaultContent();
	}
	public  void selectStatus()
	{
		driver.findElement(selectstatusLoc).click();
	}
	public  void selectRoom()
	{
		driver.findElement(selectroomLoc).click();
	}
	public  void clickOnSave()
	{
		driver.findElement(saveLoc).click();
	}
	public  void clickonsearchappointment()
	{
		driver.findElement(appointmentsearchLoc).click();
	}
	public  void searchappointmentname()
	{
		driver.findElement(appointmentsearchnameLoc).sendKeys("belford");
	}
	public  void selectcategoryforappontmentsearch()
	{
		driver.findElement(selectcategoryforappointmentsearchLoc).click();
	}
	public  void selectproviderforappointmentsearch()
	{
		driver.findElement(selectproviderforappointmentsearchLoc).click();
	}
	public  void selectfacilityforappointmentsearch()
	{
		driver.findElement(selectfacilityforappointmentsearchLoc).click();
	}
	public  void clickonsubmitforappointmentsearch()
	{
		driver.findElement(submitforappointmentsearchLoc).click();
	}
	
	public  void clickOnLogout()
	{
		WebElement lomEle = driver.findElement(logoutmoLoc);
		Actions action = new Actions(driver);
		action.moveToElement(lomEle).build().perform();
		driver.findElement(logoutLoc).click();
	}
	public void tearDown() {
		Date date=new Date();
		String dateStr=date.toString().replace(":","-");
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File file=screenshot.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/screenshot/image_"+dateStr+".png"));
		driver.quit();
	}
}
