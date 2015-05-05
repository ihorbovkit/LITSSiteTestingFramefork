package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class StudentRegistrationFormPage extends Page{

	public StudentRegistrationFormPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	private String phoneNumber;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='register_form']//*[@id='myModalLabel']")
	public WebElement headerRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='register_form']//button[@class='close']")
	public WebElement closeButtonRegistartionForm;
	
	// Should switch to iFrame
	@FindBy(how = How.XPATH, using = "//*[@id='JotFormIFrame']")
	public WebElement iFrame;
	
	@FindBy(how = How.XPATH, using = "//*[@class='jotform-form']")
	public WebElement registrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_1']")
	public WebElement fullNameLabelRegistartionForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='first_1']")
	public WebElement nameInputFieldRegistartionForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='last_1']")
	public WebElement sureNameInputFieldRegistartionForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='last_1']")
	public WebElement nameSubLableRegistartionForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='sublabel_last']")
	public WebElement sureNameSubLableRegistartionForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_4']")
	public WebElement numberLableRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_4_area']")
	public WebElement operatorCodeInputFieldRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_4_phone']")
	public WebElement phoneNumberInputFieldRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='sublabel_area']")
	public WebElement operatorCodeSubLableRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='sublabel_phone']")
	public WebElement phoneNumberSubLableRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_3']")
	public WebElement emailLableRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_3']")
	public WebElement emailInputFieldRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_5']")
	public WebElement corseLableRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_5']")
	public WebElement corseDropdownRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_6']")
	public WebElement cityLableRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//span[@class='form-radio-item']/label")
	public List<WebElement> cityRadioButtonsRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_12']/text()")
	public WebElement priceLableRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_12']")
	public WebElement priceInputFieldRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@class='form-error-message']")
	public List<WebElement> errorMessageRegistrationForm;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='form-captcha']")
	public WebElement captchaRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@class='modal-footer']/button[1]")
	public WebElement closeButtonRegistrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reg_sbmt']")
	public WebElement submitButtonRegistrationForm;
	
	public boolean isPageLoaded(){
		return closeButtonRegistartionForm.isDisplayed();
	}
	public StudentRegistrationFormPage fielRegistrationForm(String name, String sureName, String operatorCode, int phoneNumber, String emailAdress, String courseName, String city){
		this.phoneNumber = Integer.toString(phoneNumber);
		
		webDriver.switchTo().frame(iFrame);
		waitForElementPresent(nameInputFieldRegistartionForm);
		
		nameInputFieldRegistartionForm.sendKeys(name);
		sureNameInputFieldRegistartionForm.sendKeys(sureName);
		operatorCodeInputFieldRegistrationForm.sendKeys(operatorCode);
		phoneNumberInputFieldRegistrationForm.sendKeys(this.phoneNumber);
		emailInputFieldRegistrationForm.sendKeys(emailAdress);
		//working with DropDown
		Select corseDropdown = new Select(corseDropdownRegistrationForm);
		corseDropdown.selectByVisibleText(courseName);
		//working with radio buttons
		for (int i=0; i<cityRadioButtonsRegistrationForm.size(); i++){
			
			
			if (city.equals(cityRadioButtonsRegistrationForm.get(i).getText())){
				cityRadioButtonsRegistrationForm.get(i).click();
				break;
			}
		}
		webDriver.switchTo().defaultContent();
		return this;
	}

	public StudentRegistrationFormPage fielRegistrationFormWithOutNameAndSureName(String operatorCode, int phoneNumber, String emailAdress, String courseName, String city){
		this.phoneNumber = Integer.toString(phoneNumber);
		
		webDriver.switchTo().frame(iFrame);
		waitForElementPresent(operatorCodeInputFieldRegistrationForm);
		
		operatorCodeInputFieldRegistrationForm.sendKeys(operatorCode);
		phoneNumberInputFieldRegistrationForm.sendKeys(this.phoneNumber);
		emailInputFieldRegistrationForm.sendKeys(emailAdress);
		
		//working with DropDown
		Select corseDropdown = new Select(corseDropdownRegistrationForm);
		corseDropdown.selectByVisibleText(courseName);
		//working with radio buttons
		for (int i=0; i<cityRadioButtonsRegistrationForm.size(); i++){
			
			
			if (city.equals(cityRadioButtonsRegistrationForm.get(i).getText())){
				cityRadioButtonsRegistrationForm.get(i).click();
				break;
			}
		}
		webDriver.switchTo().defaultContent();
		return this;
	}
	
	public int countOfErrorMessage(){
		webDriver.switchTo().frame(iFrame);
		int count = errorMessageRegistrationForm.size();
		webDriver.switchTo().defaultContent();
		return count;
		
	}
	
	public StudentRegistrationFormPage clickOnButton(String buttonName){
		if ("Send".equalsIgnoreCase(buttonName)){
			submitButtonRegistrationForm.click();
		}else {
			if ("Close".equalsIgnoreCase(buttonName)){
				closeButtonRegistrationForm.click();
			}
		}
		return this;
	}
}
