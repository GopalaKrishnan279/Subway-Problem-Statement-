package org.resources;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.pagefactory.CreateClient;
import org.pagefactory.DetailsPage;
import org.pagefactory.LandingPage;
import org.pagefactory.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageLogin extends BaseClass {

	LoginPage lp = new LoginPage();
	LandingPage l = new LandingPage();
	CreateClient c = new CreateClient();
	DetailsPage dp = new DetailsPage();

	@BeforeClass
	private void bfrClass() throws InterruptedException {
		chromeDriver();
		Maximize();
		launchUrl("https://appsit.habiletechnologies.com/#/home");
		CurrentUrl();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	private void beforeMethod() {

		DateAndTime();

	}

	@Test()
	private void loginPage() throws InterruptedException {
		// WebElement OrganisId=lp.getOrganisationId();
		// organisationId(OrganisId,"default");
		Thread.sleep(2000);
		lp.getOrganisationId().sendKeys("default");
		lp.getUserName().sendKeys("cb_admin");
		lp.getPassWord().sendKeys("password");
		lp.getSigninButton().click();

	}

	@Test()
	private void landingPage() {
		a.moveToElement(l.getClientDropDown()).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test
	private void createClientPage() {
		c.getCreateClient().click();

	}

	@Test
	private void detailsPage() {
		dp.getFirstName().sendKeys("tony");
		dp.getLastName().sendKeys("stephen");
		dp.getMobileNumber().sendKeys("9876543210");
		dp.getDateOfBirth().sendKeys("09 September 1995");
		dp.getClientType().click();
		dp.getActiveCheckbox().click();
		boolean selected = dp.getActiveCheckbox().isSelected();
		if (selected == true) {
			System.out.println("checkBox is enabled");
		} else {
			System.out.println("checkBox is not enabled");
		}
		dp.getSubmittedDate().sendKeys("10 September 2022");
		dp.getOpenSavingsAccount().click();
		boolean selected2 = dp.getOpenSavingsAccount().isSelected();
		if (selected2 == true) {
			System.out.println("checkBox is enabled");
		} else {
			System.out.println("checkBox is not enabled");
		}
		dp.getStaffSelection().click();
		dp.getStaffCheckBox().click();
		dp.getEmail().sendKeys("google123@gmail.com");
		dp.getGender().click();
		dp.getClientClassification().click();

		dp.getFinalCheckBox().click();
		boolean selected3 = dp.getFinalCheckBox().isSelected();
		if (selected3 == true) {
			System.out.println("checkBox is enabled");

		} else {
			System.out.println("checkBox is not enabled");
		}
		dp.getSubmitButton().click();

	}

	@AfterMethod
	private void afterMethod() {
		DateAndTime();
	}

	@AfterClass
	private void afterClass() {
		driver.quit();
	}

}
