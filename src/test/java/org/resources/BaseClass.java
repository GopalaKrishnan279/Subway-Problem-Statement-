package org.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Select s;
	public static WebDriverWait w;

	// 1.launch Chrome
	public static void chromeDriver() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	// 2.launch Edge
	public static void edgeDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	// 3.launch fire fox
	public static void fireFox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	// 4.Url
	public static void launchUrl(String Url) {
		driver.get(Url);
	}

	// 5.Maximize
	public static void Maximize() {
		driver.manage().window().maximize();
	}

	// 6.Print Title
	public static void printTittle() {

		System.out.println(driver.getTitle());
	}

	// 7.currentUrl
	public static void CurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	// 8.passing value for organisationId
	public static void organisationId(WebElement e, String Value) {
		e.sendKeys(Value);
	}

	// 9.passing value for userName
	public static void userName(WebElement e, String Value) {
		e.sendKeys(Value);
	}

	// 10.passing value for passWord
	public static void passWord(WebElement e, String Value) {
		e.sendKeys(Value);
	}

	// 11.Clicking signin button
	public static void signinButton(WebElement e) {
		e.click();
	}

	// 12.Client drop down
	public static void clientDropDown(WebElement e) throws AWTException {
		a = new Actions(driver);
		a.moveToElement(e).perform();
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		a.click().perform();
	}

	// 13.createClient
	public static void createClient(WebElement e) {
		e.click();
	}
//14.firstName
	public static void firstName(WebElement e, String Value) {
		e.sendKeys(Value);
	}
//15.lastname
	public static void lastName(WebElement e, String Value) {
		e.sendKeys(Value);
	}
//16.MobileNumber
	public static void mobileNumber(WebElement e, String Value) {
		e.sendKeys(Value);
	}

	// 17.Date of Birth
	public static void dateOfBirth(WebElement e, String Value) {
		e.sendKeys(Value);
	}
//18.clientType
	public static void clientType(WebElement e) {
		e.click();
	}
//19.Checking Active CheckBox
	public static void activeCheckbox(WebElement e) {
		e.click();
	}
//20.Submitted on
	public static void SubmittedDate(WebElement e) {

	}

	// 21.OpenSavings Account
	public static void openSavingsAccount(WebElement e) {
		e.click();
	}

	// 22.Staff Selection
	public static void staffSelection(WebElement e) {
		e.click();
	}

	// 23.Staff CheckBox
	public static void staffCheckBox(WebElement e) {
		e.click();
	}

	// 24.Email Address
	public static void email(WebElement e, String Value) {
		e.sendKeys(Value);
	}

	// 25.Gender Selection
	public static void gender(WebElement e) {
		e.click();
	}

	// 26.Client Classification
	public static void clientClassification(WebElement e) {
		e.click();
	}

	// 27.checkbox 15H/15G
	public static void finalCheckBox(WebElement e) {
		e.click();
	}

	// 28.Submit Button
	public static void submitButton(WebElement e) {
		e.click();
	}

	public static void DateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}
public static void closingDriver() {
	driver.quit();
}
}
