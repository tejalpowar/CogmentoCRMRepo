package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	private static LoginPage loginpage;
	// pre condition

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateLoginFunctionality() {
		// capture Username and password from Properties file
		String username = prop.getProperty("USERNAME");
		String password = prop.getProperty("PASSWORD");

		// create object of LoginPage class
		LoginPage loginpage = new LoginPage();
		loginpage.loginFunctionality(username, password);
	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}
}


