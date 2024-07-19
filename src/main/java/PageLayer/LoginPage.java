package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	// create Object Repository using POM with Page Factory
		@FindBy(name = "email")
		private WebElement username;

		@FindBy(name = "password")
		private WebElement password;

		@FindBy(xpath = "//div[text()='Login']")
		private WebElement loginbutton;

		// Initialize the Object Repository 
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		// create non static associated method for each and every OR without entering
		// test data
		public void loginFunctionality(String Username, String Password) {
			username.sendKeys(Username);
			password.sendKeys(Password);
			loginbutton.click();
		}

}
