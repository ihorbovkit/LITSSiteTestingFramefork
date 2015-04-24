package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LitsPage extends Page{

	public LitsPage(WebDriver webDriver) {
		super(webDriver);
		
	}
	
	// Header Nodes
	
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
	
	@FindBy(how = How.XPATH, using = "//*[@id ='header-right-section']//i[@class='icon-tel']/ancestor::a/text()")
	public WebElement telephoneNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@class='red-btn-small']")
	public WebElement becomeStudentButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='site-navigation']")
	public WebElement headerSiteNavigation;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-9']/a")
	public WebElement homePageLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-178']/a")
	public WebElement schoolDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-179']/a")
	public WebElement schoolDropDownQaSchoolLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-180']/a")
	public WebElement schoolDropDownPmSchoolLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-181']/a")
	public WebElement schoolDropDownCodeSchoolLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-378']/a")
	public WebElement schoolDropDownDesignSchoolLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-74']/a")
	public WebElement newsLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-60']/a")
	public WebElement courceDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-499']/a")
	public WebElement courceDropDownLvivQASchoolDropDown;
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
	public WebElement courceDropDownPmSchoolDropDown;
	//TODO	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-501']/a")
	public WebElement courceDropDownCodeSchoolDropDown;
	//TODO
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-502']/a")
	public WebElement courceDropDownDesignSchoolDropDown;

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
	
	// Footer Nodes
	@FindBy(how = How.XPATH, using = "//*[@id='colophon']")
	public WebElement footer;
	
	@FindBy(how = How.XPATH, using = "//div[@class='edit-message']/text()")
	public WebElement editMessage;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'footer-socket-area')]")
	public WebElement footerSocketArea;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-78']/a")
	public WebElement footerNewsLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-79']/a")
	public WebElement footerCourseLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-82']/a")
	public WebElement footerContactsLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-106']/a")
	public WebElement footerTeachersLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-188']/a")
	public WebElement footerBlogPostsLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-747']/a")
	public WebElement footerForPressLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu-item-991']/a")
	public WebElement footerLectoramasLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']")
	public WebElement footerContacts;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-mail']")
	public WebElement footerIconMail;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-fb-light']")
	public WebElement footerIconFaceBookLight;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-moodle']")
	public WebElement footerIconMoodle;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-inner-web']")
	public WebElement footerIconInnerWeb;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='inner-tel']")
	public WebElement footerIconTelephone;
	
	@FindBy(how = How.XPATH, using = "//*[@id='footer-contacts']//i[@class='icon-tel']/..//text()")
	public WebElement footerTelephoneNumber;
	
	@FindBy(how = How.XPATH, using = "//*[@class='mission-title']/text()")
	public WebElement footerMissionTitle;
	
	@FindBy(how = How.XPATH, using = "//*[@class='mission-title']/../text()")
	public WebElement footerMissionText;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'copyright-text')]/text()")
	public WebElement footerCopyrightText;
	
	@FindBy(how = How.XPATH, using = "//*[@id='scroll-up']")
	public WebElement footerScrollUp;
	
	public boolean isAvatarDisplayed() {
		return headerLogoImage.isDisplayed();
	}

}
