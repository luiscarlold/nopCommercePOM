package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/input")
	WebElement btnLogin;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[4]/a/span")
	WebElement btnSideBar;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[4]/a")
	WebElement btnCostumer;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void doLogin() {
		clickOnElement(btnLogin);
	}

}
