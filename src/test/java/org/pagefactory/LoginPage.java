package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "oid")
	private WebElement organisationId;
	@FindBy(id = "uid")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement signinButton;

	public WebElement getSigninButton() {
		return signinButton;
	}

	public void setSigninButton(WebElement signinButton) {
		this.signinButton = signinButton;
	}

	public WebElement getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(WebElement organisationId) {
		this.organisationId = organisationId;
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	@FindBy(id = "pwd")
	private WebElement passWord;

}
