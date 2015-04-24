package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LitsPage extends Page{

	public LitsPage(WebDriver webDriver) {
		super(webDriver);
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='header-logo-image']//img")
	public WebElement headerLogoImage;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-mail']")
	public WebElement mailIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-fb']")
	public WebElement faceBookIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-moodle']")
	public WebElement moodleIcon;

	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-tel']")
	public WebElement telephoneIcon;
	
	public boolean isAvatarDisplayed() {
		return headerLogoImage.isDisplayed();
	}

}
