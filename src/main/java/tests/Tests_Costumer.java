package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.CostumerPage;
import pages.LoginPage;

public class Tests_Costumer {

	@Test(priority = 0)
	public void costumerTest() throws InterruptedException {
		String url = "https://admin-demo.nopcommerce.com/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		String email1 = "homework1@test.com";
		String password = "123";
		String firstName = "Homework";
		String lastName = "Number two";
		String companyName = "CINTEC";
		String textArea = "Mi primer tarea del curso de automatización";

		String[] datos = { email1, password, firstName, lastName, companyName, textArea };

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();

		CostumerPage costumerPage = new CostumerPage(driver);
		costumerPage.AddCostumers(datos);

		assertTrue(costumerPage.isCustomerPageDisplayed());
	}

}
