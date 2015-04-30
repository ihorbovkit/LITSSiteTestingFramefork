package ua.com.LITS.testcase.HomePageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactFormPage;
import ua.com.LITS.testcase.TestBase;

public class HomePageTestSuite extends TestBase{	
	@Test
	public void checkTitle(){
		Assert.assertEquals(home.getTitle(), "Lviv IT School - Львівська IT школа", "Correct Title");
	}
	@Test
	public void isHomePageLoaded(){
		Assert.assertTrue(home.isAvatarDisplayed(), "Home page is loaded"); 
	}
	
	@Test
	public void clickOnPageLogo(){
		home.clickOnPageLogo();
		checkTitle();
	} 
	
	@Test
	public void clickOnIconMail(){
		ContactFormPage contactFormPage = home.clickOnIconMail();
		home.waitForElementPresent(contactFormPage.headerContactForm);
		Assert.assertEquals(contactFormPage.getHeader(), "Задати питання", "Correct Header");
	}
	
	@Test
	public void isPhoneNumberCorrect(){
		Assert.assertEquals(home.phoneNumber.getText(), "+38 067 675-24-50", "Phone number");
		Assert.assertEquals(home.checkForCorrectPhoneNumber(), "+380676752450", "Phone number");	
	}
	@Test
	public void clickOnHomePageLink() throws InterruptedException{
		home.clickOnHomePageLink();
		checkTitle();
	}
	@Test
	public void caruselMetuItemsTest() {
		Assert.assertEquals(home.caroseleMenuIsDisplayed(), true, "Carusel menu items is displayed");
		Assert.assertEquals(home.countOfImagesCaroselMenu(), 5, "Count of Images in Carusel menu");
		Assert.assertEquals(home.countButtonsCaruselSlider(), 2, "Count of slider buttons");
		Assert.assertEquals(home.countControllersCaruselSlider(), 5, "Count of slider controllers");
	}
	@Test
	public void containersOnHomePage(){
		Assert.assertEquals(home.countOfContainersHomeOnPage(), 5, "Count of containers located on Home Page");
	}
}