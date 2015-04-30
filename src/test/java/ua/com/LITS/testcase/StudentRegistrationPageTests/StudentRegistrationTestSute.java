package ua.com.LITS.testcase.StudentRegistrationPageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.StudentRegistrationFormPage;
import ua.com.LITS.testcase.TestBase;

public class StudentRegistrationTestSute extends TestBase {

	@Test
	public void fielRegistrationForm() throws InterruptedException {
		StudentRegistrationFormPage formPage = home
				.clickOnBecomeStudentButton().fielRegistrationForm("Ihor",
						"Bovkit", "096", 8139917, "ihor.bovkit@gmail.com",
						"Автоматизоване тестування", "Івано-Франківськ");
		//Thread.sleep(4000);
		formPage.clickOnButton("Send");
		//Thread.sleep(10000);
		Assert.assertTrue(formPage.countOfErrorMessage(1), "Count of error message on the page should be 1");
		
		formPage.clickOnButton("Close");

	}
	
	@Test
	public void fielRegistarationFormWithOutNameAndSureName() throws InterruptedException{
		StudentRegistrationFormPage formPage = home.clickOnBecomeStudentButton();
		Thread.sleep(2000);
		formPage.fielRegistrationFormWithOutNameAndSureName("096", 8139917, "ihor.bovkit@gmail.com",
						"Автоматизоване тестування", "Івано-Франківськ");
		Thread.sleep(2000);
		formPage.clickOnButton("Send");
		Assert.assertTrue(formPage.countOfErrorMessage(2), "Count of error message on the page should be 2");
		formPage.clickOnButton("Close");
	}

}
