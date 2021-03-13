package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CustomerPage;
import pages.HomePage;
import pages.LoginPage;

public class Tests_Customer extends BaseTest {
	@Test(priority = 0)
	public void addCustomerTest() throws InterruptedException {
		String email1 = "entregafinal@test.com";
		String password = "123";
		String firstName = "Homework";
		String lastName = "Number two";
		String companyName = "CINTEC";
		String textArea = "Mi primer tarea del curso de automatización";

		String[] datos = { email1, password, firstName, lastName, companyName, textArea };

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.doLogin();
		Assert.assertTrue(homePage.isDisplayed());

		CustomerPage customerPage = new CustomerPage(driver);
		customerPage.addCustomers(datos);

	}

	@Test(priority = 1)
	public void updateCustomers() {
		String email1 = "entregafinalUPDATE@test.com";
		String password = "123";
		String firstName = "Homework";
		String lastName = "Update";
		String companyName = "CINTEC UPDATE";
		String textArea = "Update tarea del curso de automatización";

		String[] datos = { email1, password, firstName, lastName, companyName, textArea };

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.doLogin();
		Assert.assertTrue(homePage.isDisplayed());

		CustomerPage customerPage = new CustomerPage(driver);
		customerPage.updateCustomers(datos);

	}

	@Test(priority = 2)
	public void deleteCustomer() {
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.doLogin();
		Assert.assertTrue(homePage.isDisplayed());

		CustomerPage customerPage = new CustomerPage(driver);
		customerPage.deleteCustomers();
	}
}
