package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class Tests_Login extends BaseTest {

	@Test
	public void testLogin() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();

	}

}
