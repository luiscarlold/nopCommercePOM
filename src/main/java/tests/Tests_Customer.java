package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CustomerPage;
import pages.LoginPage;

public class Tests_Customer extends BaseTest {
	@Test(priority = 0)
	public void customerTest() throws InterruptedException {
//		String url = "https://admin-demo.nopcommerce.com/login";
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);

		String email1 = "tarea2@test.com";
		String password = "123";
		String firstName = "Homework";
		String lastName = "Number two";
		String companyName = "CINTEC";
		String textArea = "Mi primer tarea del curso de automatización";

		String[] datos = { email1, password, firstName, lastName, companyName, textArea };

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();

		CustomerPage customerPage = new CustomerPage(driver);
		customerPage.addCustomers(datos);

		assertTrue(customerPage.isCustomerPageDisplayed());
	}

	@Test(priority = 1)
	public void updateCustomers() {
		String email1 = "tarea2update@test.com";
		String password = "123";
		String firstName = "Homework";
		String lastName = "Update";
		String companyName = "CINTEC UPDATE";
		String textArea = "Update tarea del curso de automatización";

		String[] datos = { email1, password, firstName, lastName, companyName, textArea };

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();

		CustomerPage customerPage = new CustomerPage(driver);
		customerPage.updateCustomers(datos);

		assertTrue(customerPage.isCustomerPageDisplayed());
	}

}
