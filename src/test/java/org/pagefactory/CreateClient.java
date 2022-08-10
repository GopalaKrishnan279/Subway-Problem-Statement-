package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class CreateClient extends BaseClass {

	public CreateClient() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="client_createbutton")
	private WebElement createClient ;

	public WebElement getCreateClient() {
		return createClient;
	}

	public void setCreateClient(WebElement createClient) {
		this.createClient = createClient;
	}
}
