package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class DetailsPage extends BaseClass {

	public DetailsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstname")
	private WebElement firstName;
	@FindBy(id = "lastname")
	private WebElement lastName;
	@FindBy(id = "mobileNo")
	private WebElement mobileNumber;
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(WebElement mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(WebElement dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public WebElement getActiveCheckbox() {
		return activeCheckbox;
	}
	public void setActiveCheckbox(WebElement activeCheckbox) {
		this.activeCheckbox = activeCheckbox;
	}
	public WebElement getSubmittedDate() {
		return SubmittedDate;
	}
	public void setSubmittedDate(WebElement submittedDate) {
		SubmittedDate = submittedDate;
	}
	public WebElement getOpenSavingsAccount() {
		return openSavingsAccount;
	}
	public void setOpenSavingsAccount(WebElement openSavingsAccount) {
		this.openSavingsAccount = openSavingsAccount;
	}
	public WebElement getStaffSelection() {
		return staffSelection;
	}
	public void setStaffSelection(WebElement staffSelection) {
		this.staffSelection = staffSelection;
	}
	public WebElement getStaffCheckBox() {
		return staffCheckBox;
	}
	public void setStaffCheckBox(WebElement staffCheckBox) {
		this.staffCheckBox = staffCheckBox;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getGender() {
		return gender;
	}
	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	public WebElement getClientClassification() {
		return clientClassification;
	}
	public void setClientClassification(WebElement clientClassification) {
		this.clientClassification = clientClassification;
	}
	public WebElement getFinalCheckBox() {
		return finalCheckBox;
	}
	public void setFinalCheckBox(WebElement finalCheckBox) {
		this.finalCheckBox = finalCheckBox;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	@FindBy(id = "dateofbirth")
	private WebElement dateOfBirth;
	@FindBy(id = "activeCheckbox")
	private WebElement activeCheckbox;
	@FindBy(id = "submittedon")
	private WebElement SubmittedDate;
	@FindBy(id = "opensavingsproduct")
	private WebElement openSavingsAccount;
	@FindBy(xpath = "//span[contains(text(),'--Select Staff--')]")
	private WebElement staffSelection;
	@FindBy(xpath = "//span[contains(text(),'S, Raja')]")
	private WebElement staffCheckBox;
	@FindBy(id = "emailAddress")
	private WebElement email;
	@FindBy(xpath = "//span[contains(text(),'Male')]")
	private WebElement gender;
	@FindBy(xpath = "//span[contains(text(),'class1')]")
	private WebElement clientClassification;
	@FindBy(id = "ishg")
	private WebElement finalCheckBox;
	@FindBy(id = "save")
	private WebElement submitButton;
@FindBy(xpath="//span[contains(text(),'Subscriber')]")
private WebElement clientType;
public WebElement getClientType() {
	return clientType;
}
public void setClientType(WebElement clientType) {
	this.clientType = clientType;
}
}
