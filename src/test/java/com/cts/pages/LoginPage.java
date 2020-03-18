package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
		private static By usernameLoc=By.id("authUser");
		private static By passLoc=By.id("clearPass");
		private static By languageLoc=By.name("languageChoice");
		private static By clickLoginLoc=By.xpath("//button[@type='submit']");
		private static By errormessgLoc=By.xpath("//div[@class='alert alert-danger login-failure m-1']");
		public static void enterUsername(WebDriver driver,String username)
		{
			driver.findElement(usernameLoc).sendKeys(username);
		}
				
		public static void enterPassword(WebDriver driver,String password)
		{
			driver.findElement(passLoc).sendKeys(password);
		}
		
		public static void selectLanguage(WebDriver driver,String language)
		{
		WebElement langSelect = driver.findElement(languageLoc);
		Select selectLanguage = new Select(langSelect);
		selectLanguage.selectByVisibleText(language);
			}
		public static void clickLogin(WebDriver driver)
		{
			driver.findElement(clickLoginLoc).click();
		}
		public static String errormessg(WebDriver driver)
		{
			WebElement errorEle = driver.findElement(errormessgLoc);
			String actualmessg = errorEle.getText();
			return actualmessg;
		}

}



