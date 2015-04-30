package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactFormPage extends Page{

	public ContactFormPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how = How.XPATH, using = "//div[@id='contact_form']//*[@id='myModalLabel']")
	public WebElement headerContactForm;
	
	public String getHeader(){
		return headerContactForm.getText();
	}
}
