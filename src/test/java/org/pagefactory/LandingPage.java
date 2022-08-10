package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class LandingPage extends BaseClass {

	
	
	public WebElement getClientDropDown() {
		return clientDropDown;
	}
	public void setClientDropDown(WebElement clientDropDown) {
		this.clientDropDown = clientDropDown;
	}
	public LandingPage () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="client-dropdown")
	private WebElement clientDropDown;
	
}
