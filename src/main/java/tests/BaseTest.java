package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		String url = "https://admin-demo.nopcommerce.com/login";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.doLogin();

	}

	@AfterMethod
	public void teardown() {
//		driver.quit();
	}

}
