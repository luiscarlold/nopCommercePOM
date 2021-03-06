package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage extends BasePage {

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

	@FindBy(id = "Gender_Male")
	WebElement gender;

	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[1]/div[6]/div[2]/span[1]/span/span")
	WebElement dateOfBirth1;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[7]/a") // xpath relativos
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

	public CustomerPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void addCustomers(String[] data) {
		clickOnElement(btnSideBarCostumer);
		clickOnElement(btnCostumer);
		clickOnElement(btnAddCostumer);
		clickOnElement(costumerInfo);
		clickOnElement(formEmail);
		typeOnElement(formEmail, data[0]);
		typeOnElement(password, data[1]);
		typeOnElement(firstName, data[2]);
		typeOnElement(lastName, data[3]);
		clickOnElement(gender);
		clickOnElement(dateOfBirth1);
		clickOnElement(dateOfBirth);
		typeOnElement(companyName, data[4]);
		clickOnElement(taxExemp);
		clickOnElement(newsletter);
		clickOnElement(newsletter1);
		selectDropdown(vendor, 1);
		typeOnElement(textArea, data[5]);
		clickOnElement(btnAdd);
		clickOnElement(btnEdit);
	}

	public void updateCustomers(String[] data) {
		clickOnElement(btnSideBarCostumer);
		clickOnElement(btnCostumer);
		clickOnElement(btnEdit);
		typeOnElement(formEmail, data[0]);
		typeOnElement(password, data[1]);
		typeOnElement(firstName, data[2]);
		typeOnElement(lastName, data[3]);
		clickOnElement(gender);
		clickOnElement(dateOfBirth1);
		clickOnElement(dateOfBirth);
		typeOnElement(companyName, data[4]);
		clickOnElement(taxExemp);
		clickOnElement(newsletter);
		clickOnElement(newsletter1);
		selectDropdown(vendor, 2);
		typeOnElement(textArea, data[5]);
		clickOnElement(btnAdd);
	}
	
	public boolean isCustomerPageDisplayed() {
		return isDisplayed(AssertText);
	}

}
