package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void typeOnElement(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void clickOnElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void selectDropdown(WebElement locator, int value) {
		Select se = new Select(locator);
		se.selectByIndex(value);
	}

	public void switchTab() {
		String firstWindow = driver.getWindowHandle();
		Set<String> secondWindow = driver.getWindowHandles();
		for (String handle : secondWindow) {
			if (!handle.equals(firstWindow)) {
				driver.switchTo().window(handle);
			}
		}
	}

	public Boolean isDisplayed(WebElement locator) {
		try {
			return (locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

}
