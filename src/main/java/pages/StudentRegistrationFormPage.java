package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StudentRegistrationFormPage extends Page{

	public StudentRegistrationFormPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how = How.XPATH, using = "//*[@id='register_form']//*[@id='myModalLabel']/text()")
	public WebElement registrationFormHeader;
	
	@FindBy(how = How.XPATH, using = "//*[@id='register_form']//button[@class='close']")
	public WebElement registartionFormCloseButton;
	
	// Should switch to form
	@FindBy(how = How.XPATH, using = "//*[@class='jotform-form']")
	public WebElement registrationForm;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_1']")
	public WebElement registrationFormFullNameLabel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='first_1']")
	public WebElement registrationFormNameInputField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='last_1']")
	public WebElement registrationFormSureNameInputField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='last_1']")
	public WebElement registrationFormNameSubLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='sublabel_last']")
	public WebElement registrationFormSureNameSubLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_4']/text()")
	public WebElement registrationFormPhoneNumberLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_4_area']")
	public WebElement registrationFormOperatorCodeInputField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_4_phone']")
	public WebElement registrationFormPhoneNumberInputField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='sublabel_area']/text()")
	public WebElement registrationFormOperatorCodeSubLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='sublabel_phone']/text()")
	public WebElement registrationFormPhoneNumberSubLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_3']/text()")
	public WebElement registrationFormEmailLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_3']")
	public WebElement registrationFormEmailInputField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_5']/text()")
	public WebElement registrationFormCorseLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_5']")
	public WebElement registrationFormCorseDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_6']/text()")
	public WebElement registrationFormCityLable;
	
	@FindBy(how = How.XPATH, using = "//div[@class='form-single-column']")
	public WebElement registrationFormCityRadioButtons;
	
	@FindBy(how = How.XPATH, using = "//*[@id='label_12']/text()")
	public WebElement registrationFormPriceLable;
	
	@FindBy(how = How.XPATH, using = "//*[@id='input_12']")
	public WebElement registrationFormPriceInputField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='id_7']")
	public WebElement registrationFormCaptcha;
	
	@FindBy(how = How.XPATH, using = "//*[@class='modal-footer']/button[1]/text()")
	public WebElement registrationFormCloseButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='reg_sbmt']")
	public WebElement registrationFormSubmitButton;
}
