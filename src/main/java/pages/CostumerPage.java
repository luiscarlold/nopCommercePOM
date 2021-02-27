package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostumerPage extends BasePage {

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[4]/a")
	WebElement btnSideBarCostumer;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span")
	WebElement btnCostumer;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/form[1]/div[1]/div/a")
	WebElement btnAddCostumer;

	@FindBy(id = "Email")
	WebElement formEmail;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(id = "FirstName")
	WebElement firstName;

	@FindBy(id = "LastName")
	WebElement lastName;

	@FindBy(xpath = "//*[@id=\"Gender_Male\"]")
	WebElement gender;

	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[1]/div[6]/div[2]/span[1]/span/span")
	WebElement dateOfBirth1;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[7]/a")
	WebElement dateOfBirth;

	@FindBy(id = "Company")
	WebElement companyName;

	@FindBy(xpath = "//*[@id=\"IsTaxExempt\"]")
	WebElement taxExemp;

	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[1]/div[9]/div[2]/div/div[1]/div")
	WebElement newsletter;

	@FindBy(xpath = "//*[@id=\"SelectedNewsletterSubscriptionStoreIds_listbox\"]/li[1]")
	WebElement newsletter1;

	@FindBy(id = "VendorId")
	WebElement vendor;

	@FindBy(id = "AdminComment")
	WebElement textArea;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[1]/div/button[1]")
	WebElement btnSave;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[1]/h1")
	WebElement AssertText;

	@FindBy(id = "customer-info")
	WebElement costumerInfo;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[1]/div/button[1]")
	WebElement btnAdd;

	@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr[1]/td[9]/a")
	WebElement btnEdit;

	WebDriver driver;

	public CostumerPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void AddCostumers(String[] data) {
		waitUntilClickable(btnSideBarCostumer, 10);
		waitUntilClickable(btnCostumer, 10);
		waitUntilClickable(btnAddCostumer, 10);
		waitUntilClickable(costumerInfo, 10);
		waitUntilClickable(formEmail, 10);
		typeOnElement(formEmail, data[0]);
		typeOnElement(password, data[1]);
		typeOnElement(firstName, data[2]);
		typeOnElement(lastName, data[3]);
		waitUntilClickable(gender, 10);
		waitUntilClickable(dateOfBirth1, 10);
		waitUntilClickable(dateOfBirth, 10);
		typeOnElement(companyName, data[4]);
		waitUntilClickable(taxExemp, 10);
		waitUntilClickable(newsletter, 10);
		waitUntilClickable(newsletter1, 10);
		typeOnElement(textArea, data[5]);
		selectDropdown(vendor, 1);
		waitUntilClickable(btnAdd, 10);
		waitUntilClickable(btnEdit, 10);
	}

	public boolean isCustomerPageDisplayed() {
		return isDisplayed(AssertText);
	}

}
