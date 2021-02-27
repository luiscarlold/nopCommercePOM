package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Tests_Login {

	@Test
	public void testLogin() {
		String url = "https://admin-demo.nopcommerce.com/login";
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();

	}

}
