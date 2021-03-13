package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;

public class Tests_Login extends BaseTest {

	@Test
	public void testLogin() {
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.doLogin();

		Assert.assertTrue(homePage.isDisplayed());
	}

}
