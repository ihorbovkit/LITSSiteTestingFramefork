package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LitsPage extends Page{

	public LitsPage(WebDriver webDriver) {
		super(webDriver);
		
	}
	
	// Header Elements
	
	@FindBy(how = How.XPATH, using = "//*[@id='header-logo-image']//img")
	public WebElement logoImageHeader;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-mail']")
	public WebElement mailIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-fb']")
	public WebElement faceBookIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-moodle']")
	public WebElement moodleIcon;

	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-tel']")
	public WebElement phoneIcon;
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-tel']/ancestor::a")
	public WebElement phoneNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@class='red-btn-small']")
	public WebElement becomeStudentButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='site-navigation']")
	public WebElement headerSiteNavigation;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-9']/a")
	public WebElement homePageLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-178']/a")
	public WebElement schoolDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-179']/a")
	public WebElement qaSchoolLinkSchoolDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-180']/a")
	public WebElement pmSchoolLinkSchoolDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-181']/a")
	public WebElement codeSchoolLinkSchoolDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-378']/a")
	public WebElement designSchoolLinkSchoolDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-74']/a")
	public WebElement newsLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-60']/a")
	public WebElement courceDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement lvivQASchoolDropDownCourceDropDown;
	//TODO
	/*
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement courceDropDownLvivQASchoolDropDown;
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement courceDropDownLvivQASchoolDropDown;
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement courceDropDownLvivQASchoolDropDown;
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement courceDropDownLvivQASchoolDropDown;
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement courceDropDownLvivQASchoolDropDown;
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement courceDropDownLvivQASchoolDropDown;*/
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-500']/a")
	public WebElement pmSchoolDropDownCourceDropDown;
	//TODO	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-501']/a")
	public WebElement codeSchoolDropDownCourceDropDown;
	//TODO
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-502']/a")
	public WebElement designSchoolDropDownCourceDropDown;

	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-97']/a")
	public WebElement teachersLink;

	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-558']/a")
	public WebElement blogPostsLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-83']/a")
	public WebElement contactsLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-845']/a")
	public WebElement photogalleryLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-1059']/a")
	public WebElement lectoramasLink;
	
	// Footer Elements
	@FindBy(how = How.XPATH, using = "//*[@id='colophon']")
	public WebElement footer;
	
	@FindBy(how = How.XPATH, using = "//div[@class='edit-message']/text()")
	public WebElement editMessage;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'footer-socket-area')]")
	public WebElement socketAreaFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-78']/a")
	public WebElement newsLinkFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-79']/a")
	public WebElement courseLinkFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-82']/a")
	public WebElement contactsLinkFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-106']/a")
	public WebElement teachersLinkFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-188']/a")
	public WebElement blogPostsLinkFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-747']/a")
	public WebElement forPressLinkFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-991']/a")
	public WebElement lectoramasLinkFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']")
	public WebElement contactsFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-mail']")
	public WebElement iconMailFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-fb-light']")
	public WebElement iconFaceBookLightFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-moodle']")
	public WebElement iconMoodleFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-inner-web']")
	public WebElement iconInnerWebFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='inner-tel']")
	public WebElement iconTelephoneFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-tel']/..//text()")
	public WebElement telephoneNumberFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@class='mission-title']/text()")
	public WebElement missionTitleFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@class='mission-title']/../text()")
	public WebElement missionTextFooter;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'copyright-text')]/text()")
	public WebElement copyrightTextFooter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='scroll-up']")
	public WebElement scrollUpFooter;
	
	public boolean isAvatarDisplayed() {
		waitForElementPresent(headerSiteNavigation);
		return logoImageHeader.isDisplayed();
	}
	
	public HomePage clickOnPageLogo(){
		waitForElementPresent(logoImageHeader);
		logoImageHeader.click();
		return PageFactory.initElements(webDriver, HomePage.class);
	}
	
	public ContactFormPage clickOnIconMail(){
		waitForElementPresent(mailIcon);
		mailIcon.click();
		return PageFactory.initElements(webDriver, ContactFormPage.class);
	}
	
	public String checkForCorrectPhoneNumber(){
		waitForElementPresent(phoneNumber);
		String str = phoneNumber.getText();
		str = str.replace(" ", "");
		str = str.replace("-", "");
		return str;
	}
	
	public StudentRegistrationFormPage clickOnBecomeStudentButton(){
		waitForElementPresent(becomeStudentButton);
		becomeStudentButton.click();
		return PageFactory.initElements(webDriver, StudentRegistrationFormPage.class);
	}
	
	public HomePage clickOnHomePageLink(){
		waitForElementPresent(homePageLink);
		homePageLink.click();
		return PageFactory.initElements(webDriver, HomePage.class);
	}
}
