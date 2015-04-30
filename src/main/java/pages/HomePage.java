package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends LitsPage{

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@class='slider-nav']/a")
	public List<WebElement> buttonsCaruselSlider;
	
	@FindBy(how = How.XPATH, using = "//*[@id='controllers']/a")
	public List<WebElement> controllersCarosel;
	
	@FindBy(how = How.XPATH, using = "//*[@class='slider-rotate']/..")
	public WebElement caroselMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@class='slider-rotate']/div")
	public List<WebElement> imagesCaroselMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='school_container']")
	public List<WebElement> containersHomePage;
	
	public int countButtonsCaruselSlider(){
		
		return buttonsCaruselSlider.size(); 
	}
	public int countControllersCaruselSlider(){
		waitForElementsPresent(controllersCarosel);
		return controllersCarosel.size(); 
	}
	public boolean caroseleMenuIsDisplayed(){
		if (caroselMenu.isDisplayed()){
			return true;
		}else return false;
	}
	public int countOfImagesCaroselMenu(){
		return imagesCaroselMenu.size();
	}
	public int countOfContainersHomeOnPage(){
		waitForElementsPresent(containersHomePage);
		return containersHomePage.size();
	}
}

