package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;

	private static final Logger logger = LogManager.getLogger();

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void typeOnElement(WebElement element, String text) {
		try {
			element.clear();
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
			logger.info("Type on element: " + element + " , text: " + text);
		} catch (Exception e) {
			logger.error("Unable type on element: " + e);
		}

	}

	public void clickOnElement(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			logger.info("Clicked on element: " + element);
		} catch (Exception e) {
			logger.error("Unable to click on element: " + e);
		}
	}

	public void selectDropdown(WebElement locator, int value) {
		try {
			Select se = new Select(locator);
			se.selectByIndex(value);
			logger.info("Select on element: " + locator);
		} catch (Exception e) {
			logger.error("Unable to select on element: " + e);
		}

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
