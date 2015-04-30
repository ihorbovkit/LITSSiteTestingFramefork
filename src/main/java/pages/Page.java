package pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	protected WebDriver webDriver;
	
	public Page(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	public WebDriver getWebDriver(){
		return webDriver;
	}
	
	public void waitForElementPresent(WebElement webElement){
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}
	public void waitForElementsPresent(List<WebElement> webElement){
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
	}
	
	public String getTitle(){
		return webDriver.getTitle();
	}
	
	public boolean isElementPresent(WebElement element){
		try{
			element.isEnabled();
			return true;
		} catch (NoSuchElementException e){
			return false;
		}
	}
}
