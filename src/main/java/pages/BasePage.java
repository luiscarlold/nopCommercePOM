package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void typeOnElement(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void clickOnElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

//	// Explicit wait
//	public void waitUntilClickable(WebElement element, int seconds) {
//
//		(new WebDriverWait(driver, seconds)).until(ExpectedConditions.elementToBeClickable(element)).click();
//
//	}

	// Select dropdown
	public void selectDropdown(WebElement locator, int value) {
		Select se = new Select(locator);
		se.selectByIndex(value);
	}

	// Cambiar a otra ventana
	public void switchTab() {
		String firstWindow = driver.getWindowHandle();
		// Se setea la segunda ventana
		Set<String> secondWindow = driver.getWindowHandles();

		// Recorrer un bucle hasta que encontremos un nuevo window handle
		for (String handle : secondWindow) {
			if (!handle.equals(firstWindow)) {
				// Aqui se cambia a la segunda ventana
				driver.switchTo().window(handle);
			}
		}
	}

	// Assert para mostrar elementos
	public Boolean isDisplayed(WebElement locator) {
		try {
			return (locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

}
